/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import data.packages.DataUnit;
import java.util.Collection;

/**
 *
 * @author Angelo
 */
public class TCPBridge extends NetworkBridge{

    private final Collection<DataUnit> msgQueueSynch;
    
    public TCPBridge(Collection<DataUnit> msgQueueSynch){
        super(msgQueueSynch);
        this.msgQueueSynch = msgQueueSynch;
        
    }

    
    @Override
    public void run(){
        
    }

    @Override
    public void terminateConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
