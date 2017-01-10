package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The Discover-Response package is send in response to
 * the Discover package.
 * @author Angelo
 */
public class DataDiscRespUnit extends DataUnit{
    
    /**
     * Discover-Response package constructor.
     */
    public DataDiscRespUnit() {
        super();
    }

    /**
     * This is called when the package has been received
     * and it is about to be handled by the receiver
     * It is part of the Visitor pattern.
     * @param handlerSwitch HandlerData
     */
    @Override
    public void accept(HandlerData handlerSwitch) {
        handlerSwitch.execute(this);
    }
    
    @Override
    public String toString(){
        return super.toString() + " - Discover Response Data Unit";
    }
}
