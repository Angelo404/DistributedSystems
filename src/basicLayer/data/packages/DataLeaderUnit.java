package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The Leader package is sent when the node has been made
 * leader and needs to broadcast that it is now the new leader.
 * @author Angelo
 */
public class DataLeaderUnit extends DataUnit{

    /**
     * Leader package constructor.
     */
    public DataLeaderUnit() {
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
    public String toString() {
        return super.toString() + " - Leader Data Unit";
    }

}
