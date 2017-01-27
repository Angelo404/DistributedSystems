package basicLayer.data;

import basicLayer.data.packages.DataUnit;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * TODO Is this being used?
 * @author Angelo
 */
public class SyncQueue extends ConcurrentLinkedQueue<DataUnit>{
    
    public SyncQueue(){
        
    }
    
    public DataUnit pop(){
        DataUnit tmpData = this.poll();
        return tmpData;
    }
    
    
}
