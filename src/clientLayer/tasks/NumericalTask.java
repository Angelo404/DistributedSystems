/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientLayer.tasks;

import error.exceptions.FewParametersCustEx;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                throw new FewParametersCustEx(this.getClass().getCanonicalName());
        } catch (FewParametersCustEx ex) {
            Logger.getLogger(Addition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Number call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
