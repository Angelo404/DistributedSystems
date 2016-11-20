/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.tasks;

import error.exceptions.ExceptionNumberParams;
import error.warnings.WarningMessages;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelo
 */
public class Addition extends Task implements Callable<Integer>{

    private Integer total;
    private Integer[] params;

    public Addition(Integer ... params){
        total = 0;
        System.err.println(params.length);
        try {
            if(params.length > 1)
                this.params = params;
            else
                throw new ExceptionNumberParams();
        } catch (ExceptionNumberParams ex) {
            Logger.getLogger(Addition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Integer call() {
        for(Integer i : params)
            total += i;
        return total;
    }

}
