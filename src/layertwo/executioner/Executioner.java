/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.executioner;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class Executioner {
    
    public Executioner(){
        
    }
    
    public void execute(Callable<?> v){
        try {
            System.err.println(v.call());
        } catch (Exception ex) {
            Logger.getLogger(Executioner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
