/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.exceptions;

import error.WarningsAndErrors;

/**
 *
 * @author Angelo
 */
public enum ErrorMessages implements WarningsAndErrors{
    
    NOT_ENOUGH_PARAMS(1, "More parameters are needed for this operation");
    
    private final int code;
    private final String description;
    
    private ErrorMessages(int code, String description) {
    this.code = code;
    this.description = description;
  }
    
    @Override
    public String getDiscription(){
        return description;
    }
    
    @Override
    public int getCode(){
        return code;
    }
    
    @Override
    public String toString(){
        return code + ":" + description;
    }
    
}
