/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class InitializerTimer {
    
    public static void execute(String msg, Long seconds){
        System.out.println(msg);
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            Logger.getLogger(InitializerTimer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void execute(String msg, int seconds){
        System.out.println(msg);
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            //Thread.currentThread().interrupt();
            Logger.getLogger(InitializerTimer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
