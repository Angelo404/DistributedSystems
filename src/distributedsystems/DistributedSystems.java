/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedsystems;


/**
 *
 * @author Angelo
 */
public class DistributedSystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread(new FirstTeirNode()).start();
        //new Thread(new FirstTeirNode()).start();
    }
}
