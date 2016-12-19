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
public enum ErrorMessages implements WarningsAndErrors{
    
    NOT_ENOUGH_PARAMS(1, "More parameters are needed for this operation",
                                "This message will be displayed in case the client"
                                + " gets less parameters than the operation requires"),
    CONSTRUCTOR_SWITCH_MISSMATCH(2, "Switch statement failed to find a match",
                                "In general this should never occur but just in case the switch"
                                + "statement results to default this will be printed"),
    NULL_POINTER_FOR_SOCKET_ON_CLOSE(50, "Socket port has not been initialized",
                                "In some occasions we need to kill the second tier node."
                                + "In case we try to close it before it has been initialized this"
                                + "message will be printed."),
    NULL_POINTER_FOR_STREAM_ON_CLOSE(51, "Stream has not been initialized",
                                "It can happen that we close the input/output stream"
                                + "before the node had the chance to send or receive anything. "
                                + "In that case the stream wont be initialized when closing"
                                + "the node which will result to this exception.");
    
    private final int code;
    private final String shortDescription;
    private final String longDescription;
    
    private ErrorMessages(int code, String shortDescription, String longDescription) {
    this.code = code;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
  }
    
    @Override
    public String getShortDiscription(){
        return shortDescription;
    }
    
    @Override
    public String getLongDescription(){
        return longDescription;
    }
    
    @Override
    public int getCode(){
        return code;
    }
    
    @Override
    public String toString(){
        return  "Error code: " + code + "\n" +
                "Short Description: " + shortDescription + "\n" +
                "Long Description: " + longDescription + "\n";
    }
    
}
