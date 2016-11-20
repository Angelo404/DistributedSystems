/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.exceptions;

import error.warnings.WarningMessages;

/**
 *
 * @author Angelo
 */
public class ExceptionNumberParams extends CustomException{

    public ExceptionNumberParams(){
        super(WarningMessages.CONSTRUCTOR_SWITCH_MISSMATCH.getDiscription());
    }

}
