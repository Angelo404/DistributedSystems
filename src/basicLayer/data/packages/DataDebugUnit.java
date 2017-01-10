package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The Debug package is used only for testing purposes.
 * @author Angelo
 */
public class DataDebugUnit extends DataUnit{

    private final String msg;
    private final int counter;
    
    /**
     * Constructor for the Debug packages.
     * @param msg String
     * @param counter int
     */
    public DataDebugUnit(String msg, int counter){
        super();
        this.msg = msg;
        this.counter = counter;
    }
    
    /**
     * This will return the context of the Debug package.
     * @return String
     */
    public String getContext(){
        return msg;
    }
    
    /**
     * This is called when the package has been received and
     * it is about to be handled by the receiver
     * It is part of the Visitor pattern.
     * @param handlerSwitch HandlerData
     */
    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Debug Data Unit number - " + counter;
    }
}
