package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The WannabeLeader package is used when (during the
 * election process) one of the nodes asks to become
 * leader.
 * @author Angelo
 */
public class DataWannabeLeaderUnit extends DataUnit{

    /**
     * WannabeLeader package constructor.
     */
    public DataWannabeLeaderUnit() {
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
        return super.toString() + " - Wannabe Leader Data Unit";
    }

}
