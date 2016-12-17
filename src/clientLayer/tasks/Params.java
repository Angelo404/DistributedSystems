/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.tasks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Angelo
 */
public class Params<E> extends ArrayList<E>{
            
    public Params (E ... params){
        this.addAll(Arrays.asList(params));
    }
    
    public ArrayList<E> getParams(){
        return this;
    }
    
    
}
