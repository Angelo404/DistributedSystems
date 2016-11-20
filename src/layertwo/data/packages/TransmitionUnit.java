/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.data.packages;

import layerOne.data.packages.DataUnit;
import java.io.Serializable;

/**
 *
 * @author Angelo
 */
public abstract class TransmitionUnit extends DataUnit implements Serializable {
    
    protected TransmitionUnit(){};
    
    @Override
    public String toString(){
        return super.toString() + " - Transmition Unit";
    }
    
}
