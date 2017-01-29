package basicLayer.data;

import java.net.InetAddress;
import utils.Parser;


/**
 * Configuration data for the basic layer.
 * @author Angelo
 */
public class BasicLayerConfig {
    public static final int PORT = 8800;
    private static final String IP = "192.168.137.1"; // 127.0.0.1
    public static final int PCKGSIZE = 1024;
    public static final int UUID = 8;
    
    /**
     * This will return the IP address of the host.
     * @return InetAddress
     */
    public static InetAddress getIp(){
        return Parser.strToInet(IP);
    }
}
