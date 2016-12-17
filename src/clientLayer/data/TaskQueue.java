/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.data;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author Angelo
 */
public class TaskQueue<E> extends ConcurrentLinkedQueue<E>{
    
    public TaskQueue(){
        
    }
    
    @Override
    public E poll(){
        return super.poll();
    }
    
}
