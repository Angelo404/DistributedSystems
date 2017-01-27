package basicLayer.data.logs;

import basicLayer.data.BasicLayerConfig;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import utils.Parser;

/**
 * Client map is an index of all hosts in the network; It keeps only information
 * vital for the basic layer of the application; It is configured as a Singleton pattern.
 * @author Angelo
 */
public class ClientMap implements Serializable{

    private static final ClientMap instance = new ClientMap();
    private static HashMap<InetAddress, Integer> clientHashMap = new HashMap<>();
    private static InetAddress leaderIP;
    
    private ClientMap(){};
    
    /**
     * Part of the singleton pattern.
     * @return ClientMap
     */
    public static ClientMap getInstance(){
        return instance;
    }

    /**
     * Add new host to the index.
     * @param newHost InetAddress
     */
    public void addHost(InetAddress newHost) {
        if (!clientHashMap.containsKey(newHost)) {
            clientHashMap.put(newHost, 0);
        } else {
            increaseHost(newHost);
        }
    }

    /**
     * Add new host to the index.
     * @param newHost String
     */
    public void addHost(String newHost) {
        addHost(Parser.strToInet(newHost));
    }
    
    /**
     * Remove host from the index.
     * @param host InetAddress
     */
    public void remove(InetAddress host){
        ClientMap.clientHashMap.remove(host);
    }

    /**
     * Remove host from the index.
     * @param host String
     */
    public void remove(String host){
        remove(Parser.strToInet(host));
    }

    /**
     * Increase the vector counter for a host.
     * @param host InetAddress
     */
    public void increaseHost(InetAddress host) {
        clientHashMap.put(host, clientHashMap.get(host) + 1);
    }

    /**
     * Increate the vector counter for a host.
     * @param host String
     */
    public void increaseHost(String host) {
        increaseHost(Parser.strToInet(host));
    }

    /**
     * Set a new leader for the network.
     * @param ip InetAddress
     */
    public void setLeader(InetAddress ip) {
        leaderIP = ip;
    }

    /**
     * Set a new leader for the network.
     * @param ip String
     */
    public void setLeader(String ip) {
        setLeader(Parser.strToInet(ip));
    }

    /**
     * Get the IP of the leader.
     * @return InetAddress
     */
    public InetAddress getLeaderIp() {
        return leaderIP;
    }

    /**
     * Return the whole index.
     * @return HashMap<InetAddress, Integer>
     */
    public HashMap<InetAddress, Integer> getHashMap() {
        return clientHashMap;
    }
    
    /**
     * Replace a specific remote host.
     * @param ip InetAddress
     * @param i int
     */
    public void replace(InetAddress ip, int i){
        clientHashMap.put(ip, i);
    }
    
    /**
     * Replace a specific remote host.
     * @param ip String
     * @param i int
     */
    public void replace(String ip, int i){
        replace(Parser.strToInet(ip), i);
    }
    
    /**
     * Replace the whole index with a new one.
     * @param newMap HashMap
     */
    public void replaceALL(HashMap newMap){
        clientHashMap = newMap;
    }

    /**
     * Get the vector clock of a specific remote host.
     * @param ip InetAddress
     * @return Integer
     */
    public Integer getCounter(InetAddress ip) {
        return clientHashMap.get(ip);
    }

    /**
     * Get the vector clock of a specific remote host.
     * @param ip String
     * @return Integer
     */
    public Integer getCounter(String ip) {
        return getCounter(Parser.strToInet(ip));
    }

    /**
     * Return the counter of the local host.
     * @return Integer
     */
    public Integer getMyCounter(){
        return getCounter(BasicLayerConfig.getIp());
    }
    
    /**
     * Updates the vector clock of the local host.
     */
    public void increaseMe(){
        increaseHost(BasicLayerConfig.getIp());
    }
    
    /**
     * Replace all remote hosts that have higher counter than the current counters.
     * @param newClientMap ClientMap
     */
    public void replaceHigher(ClientMap newClientMap){
        replaceHigher(newClientMap.getHashMap());
    }
    
    /**
     * Replace all remote hosts that have higher counter than the current counters.
     * @param newClientHashMap HashMap<InetAddress,Integer>
     */
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
    
    /**
     * Get all the IPs from the host index.
     * @return ArrayList<InetAddress>
     */
    public ArrayList<InetAddress> getIps(){
        return new ArrayList<>(clientHashMap.keySet());
    }
    
    @Override
    public String toString(){
        return clientHashMap.toString();
    }
}
