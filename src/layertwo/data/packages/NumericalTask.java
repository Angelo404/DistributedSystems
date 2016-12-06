/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.data.packages;

import error.exceptions.ExceptionNumberParams;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import layertwo.tasks.Addition;
import layertwo.tasks.Task;

/**
 *
 * @author Angelo
 */
public abstract class NumericalTask extends Task implements Callable<Number>{
    
    protected Double total;
    protected ArrayList<Double> params;
    
    
    public abstract Number executeOperation();
    
    @Override
    public void giveParams(Params params) {
        System.err.println(params.size());
        try {
            if(params.size() > 0)
                this.params = params.getParams();
            else
                throw new ExceptionNumberParams();
        } catch (ExceptionNumberParams ex) {
            Logger.getLogger(Addition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Number call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
