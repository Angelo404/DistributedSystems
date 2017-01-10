package basicLayer.data.packages;

import basicLayer.messageHandler.HandlerData;

/**
 * The Update package is used to transfer information
 * that need to be updated to other nodes such as the
 * ClientMap.
 * @author Angelo
 */
public class DataUpdateUnit extends DataUnit{
        
    /**
     * Update package constructor.
     */
    public DataUpdateUnit() {
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
        return super.toString() + " - Data Upadate Data Unit";
    }
}