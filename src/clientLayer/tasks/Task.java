/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.tasks;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Angelo
 */
public abstract class Task implements Serializable, TaskMethods{
    
    private final Timestamp timestampCreated;
    private Timestamp timestampCompleted;
    
    public Task(){
        timestampCreated = createTimestamp();
        timestampCompleted = new Timestamp(0);
    }
    
    public abstract void giveParams(Params params);

    @Override
    public Timestamp getCompletedTime() {
        return timestampCompleted;
    }

    @Override
    public Timestamp getCreatedTime() {
        return timestampCreated;
    }

    @Override
    public Timestamp createTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
    
    @Override
    public void markAsCompleted() {
        timestampCompleted = new Timestamp(System.currentTimeMillis());
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Task";
    }
}
