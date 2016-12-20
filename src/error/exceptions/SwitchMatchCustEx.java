/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.exceptions;

/**
 *
 * @author Angelo
 */
public class SwitchMatchCustEx extends CustomException{
    
    public SwitchMatchCustEx(String errorMsg){
        super(errorMsg);
        this.customErrorMsg = ErrorMessage.CONSTRUCTOR_SWITCH_MISSMATCH;
    }
    
    public SwitchMatchCustEx(String errorMsg, Throwable throwable){
        super(errorMsg, throwable);
                this.customErrorMsg = ErrorMessage.CONSTRUCTOR_SWITCH_MISSMATCH;

    }

    @Override
    public void showCustomMessage() {
        System.err.println(this.customErrorMsg);
    }
    
}
