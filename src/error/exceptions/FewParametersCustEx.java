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
public class FewParametersCustEx extends CustomException{
    
    public FewParametersCustEx(String msg){
        super(msg);
        this.customErrorMsg = ErrorMessage.NOT_ENOUGH_PARAMS;
    }
    
    public FewParametersCustEx(String msg, Throwable th){
        super(msg, th);
        this.customErrorMsg = ErrorMessage.NOT_ENOUGH_PARAMS;
    }
    
    @Override
    public void showCustomMessage(){
        System.err.println(this.customErrorMsg);
    }
    
}
