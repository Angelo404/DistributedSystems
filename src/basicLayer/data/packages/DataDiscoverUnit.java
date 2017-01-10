package basicLayer.data.packages;


import basicLayer.messageHandler.HandlerData;

/**
 * The Discover package is sent by the new node to make its
 * present known to the network.
 * @author Angelo
 */
public class DataDiscoverUnit extends DataUnit{
        
    /**
     * Discover package constructor.
     */
    public DataDiscoverUnit() {
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
        return super.toString() + " - Data Discover Data Unit";
    }
    
}
