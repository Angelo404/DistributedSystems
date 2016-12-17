/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.data.logs;

import basicLayer.data.BasicLayerConfig;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import utils.Parser;

/**
 * Singleton pattern
 * @author Angelo
 */
public class ClientMap implements Serializable{

    private static final ClientMap instance = new ClientMap();
    private static HashMap<InetAddress, Integer> clientHashMap = new HashMap<>();
    private static InetAddress leaderIP;

    
    private ClientMap(){};
    
    public static ClientMap getInstance(){
        return instance;
    }

    public void addHost(InetAddress newHost) {
        if (!clientHashMap.containsKey(newHost)) {
            clientHashMap.put(newHost, 0);
        } else {
            increaseHost(newHost);
        }
    }

    public void addHost(String newHost) {
        addHost(Parser.strToInet(newHost));
    }
    
    public void remove(InetAddress host){
        ClientMap.clientHashMap.remove(host);
    }

    public void remove(String host){
        remove(Parser.strToInet(host));
    }

    public void increaseHost(InetAddress host) {
        clientHashMap.put(host, clientHashMap.get(host) + 1);
    }

    public void increaseHost(String host) {
        increaseHost(Parser.strToInet(host));
    }

    public void setLeader(InetAddress ip) {
        leaderIP = ip;
    }

    public void setLeader(String ip) {
        setLeader(Parser.strToInet(ip));
    }

    public InetAddress getLeaderIp() {
        return leaderIP;
    }

    public HashMap<InetAddress, Integer> getHashMap() {
        return clientHashMap;
    }
    
    public void replace(InetAddress ip, int i){
        clientHashMap.put(ip, i);
    }
    
    public void replace(String ip, int i){
        replace(Parser.strToInet(ip), i);
    }
    
    public void replaceALL(HashMap newMap){
        clientHashMap = newMap;
    }

    public Integer getCounter(InetAddress ip) {
        return clientHashMap.get(ip);
    }

    public Integer getCounter(String ip) {
        return getCounter(Parser.strToInet(ip));
    }

    public Integer getMyCounter(){
        return getCounter(BasicLayerConfig.getIp());
    }
    
    public void increaseMe(){
        increaseHost(BasicLayerConfig.getIp());
    }
    
    public void replaceHigher(ClientMap newClientMap){
        replaceHigher(newClientMap.getHashMap());
    }
    
    public void replaceHigher(HashMap<InetAddress,Integer> newClientHashMap){
        
        for(InetAddress ip : newClientHashMap.keySet()){
            if(ip.equals(BasicLayerConfig.getIp()))
                continue;
            else if(clientHashMap.containsKey(ip))
                clientHashMap.merge(ip, newClientHashMap.get(ip), Integer::max);
            else
                this.addHost(ip);
        }
    }
    
    public ArrayList<InetAddress> getIps(){
        return new ArrayList<>(clientHashMap.keySet());
    }
    
    @Override
    public String toString(){
        return clientHashMap.toString();
    }
}
