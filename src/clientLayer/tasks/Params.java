/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.tasks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Angelo
 */
public class Params<E> extends SecondTeirDataUnit implements Serializable{
            
    private ArrayList<E> params = new ArrayList<>();
    
    public Params (E ... params){
        this.params.addAll(Arrays.asList(params));
    }
    
    public ArrayList<E> getParams(){
        return params;
    }
    
    public int size(){
        return params.size();
    }
    
}
