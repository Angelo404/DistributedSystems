/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.data.packages;

import java.util.UUID;
import layerOne.messageHandler.HandlerData;

/**
 *
 * @author Angelo
 */
public abstract class ExecutionUnit extends TransmitionUnit{

    private final UUID executionUUID;
    
    protected ExecutionUnit(UUID uuid){
        this.executionUUID = uuid;
    };
    
    public UUID getExecutionUUID(){
        return this.executionUUID;
    }

    @Override
    public String toString() {
        return super.toString() + " - Execution Unit";
    }
    
}
