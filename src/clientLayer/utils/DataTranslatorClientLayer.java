/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.utils;

import clientLayer.tasks.Task;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class DataTranslatorClientLayer {
    
    public static byte[] objectToBytes(Task task){
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {   
            out = new ObjectOutputStream(byteOut);
            out.writeObject(task);
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(DataTranslatorClientLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return byteOut.toByteArray();
    }
    
    public static Task bytesToObject(byte[] data){
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        ObjectInput in = null;
        Task task = null;

        try {
            in = new ObjectInputStream(bis);
            task = (Task) in.readObject(); 
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(DataTranslatorClientLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return task;
    }
}
