/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.tasks;

/**
 *
 * @author Angelo
 */
public class TaskFactory {
    
    public TaskFactory(){
        
    }
    
    public Task createTask(TaskType type){
        Task tmpTask = null;
        switch(type){
            case ADDITION:
                tmpTask = new Addition();
                break;
            case MULTIPLICATION:
                tmpTask = new Multiplication();
                break;
            default:
                break;
        }
        return tmpTask;
    }
    
}
