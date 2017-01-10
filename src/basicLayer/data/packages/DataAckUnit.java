package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The Acklowledgement package is sent when then node needs to
 * acklowledge that the message was received successfully.
 * @author Angelo
 */
public class DataAckUnit extends DataUnit{

    /**
     * Acknowledgement package constructor.
     */
    public DataAckUnit() {
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
        return super.toString() + " - Acknoledgment Data Unit";
    }

}
