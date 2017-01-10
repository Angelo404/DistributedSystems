package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The Election package is sent when a node wants to initiate
 * an election.
 * @author Angelo
 */
public class DataElectionUnit extends DataUnit{
    
    /**
     * Election package constructor
     */
    public DataElectionUnit() {
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
        return super.toString() + " - Election Data Unit";
    }
    
}
