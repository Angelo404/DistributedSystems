/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.tasks;

import java.sql.Timestamp;

/**
 *
 * @author Angelo
 */
public interface TaskMethods<T> {
    
    public abstract Timestamp getCompletedTime();
    public abstract Timestamp getCreatedTime();
    public abstract Timestamp createTimestamp();
    public abstract void markAsCompleted();
    
    
}
