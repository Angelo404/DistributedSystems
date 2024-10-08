/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class Parser {
    public static Long ipToLong(String s){
        return Long.parseLong(s.replace(".", ""));
    }
    
    public static Long ipToLong(InetAddress s){
        return Long.parseLong(inetToStr(s).replace(".", ""));
    }
    
    public static String inetToStr(InetAddress ip){
        return ip.getHostAddress();
    }
    
    public static InetAddress strToInet(String ip){
        InetAddress address = null;
        try {
            address = InetAddress.getByName(ip);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return address;
    }
}
