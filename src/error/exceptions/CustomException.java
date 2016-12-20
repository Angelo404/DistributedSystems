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
public abstract class CustomException extends Exception{
    
    protected ErrorMessage customErrorMsg;
    
    public CustomException(){
        
    }
    
    public CustomException(String errorMsg){
        super("Error: " + errorMsg);
    }
    
    public CustomException(String errorMsg, Throwable throwable){
        super("Error: " + errorMsg, throwable);
    }
    
    public abstract void showCustomMessage();
    
}
