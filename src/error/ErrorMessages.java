/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error;

/**
 *
 * @author Angelo
 */
public enum ErrorMessages {
    
    CONSTRUCTOR_SWITCH_MISSMATCH(0, "Switch statement failed to find a match"),
    THIS_SHOULD_NOT_SHOW(1, "This message should never be printed");
    
    private final int code;
    private final String description;
    
    private ErrorMessages(int code, String description) {
    this.code = code;
    this.description = description;
  }
    
    public String getDiscription(){
        return description;
    }
    
    public int getCode(){
        return code;
    }
    
    @Override
    public String toString(){
        return code + ":" + description;
    }
    
}
