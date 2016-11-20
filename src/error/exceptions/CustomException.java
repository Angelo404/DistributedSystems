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
    
    public CustomException(){
        
    }
    
    public CustomException(String errorMsg){
        super(errorMsg);
    }
    
}
