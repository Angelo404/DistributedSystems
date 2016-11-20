/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.net.InetAddress;
import utils.Parser;


/**
 *
 * @author Angelo
 */
public class Config {
    public static final int PORT = 8800;
    private static final String IP = "127.0.0.1";
    public static final int PCKGSIZE = 1024;
    public static final int UUID = 8;
    
    public static InetAddress getIp(){
        return Parser.strToInet(IP);
    }
}
