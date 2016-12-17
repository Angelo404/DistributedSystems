/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.data;

import java.util.HashMap;
import java.util.UUID;
import clientLayer.tasks.Task;

/**
 *
 * @author Angelo
 */
public class TaskLog extends HashMap<UUID, Task>{
    
    public TaskLog(){
        
    }
    
    public void addTask(Task t){
        this.put(UUID.randomUUID(), t);
    }
    
    public void completeTask(UUID id){
        // TODO remove from the hashmap
    }
    
    public void clearCompleted(){
        // TODO loop through all tasks and remove the completed ones
    }
    
}
