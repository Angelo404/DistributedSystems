/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.data;

import layerOne.data.packages.DataUnit;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
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
