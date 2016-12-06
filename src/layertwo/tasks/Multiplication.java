/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layertwo.tasks;

import layertwo.data.packages.NumericalTask;

/**
 *
 * @author Angelo
 */
public class Multiplication extends NumericalTask{
    
    public Multiplication(){}
    
    @Override
    public Number call(){
        return executeOperation();
    }

    @Override
    public Number executeOperation() {
        total = 0.0;
        for(Double d : params)
            total *= d;
        return total;
    }


}
