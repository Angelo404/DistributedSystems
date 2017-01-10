package basicLayer.messageHandler;


/**
 * Part of the Visitor pattern (Visitable).
 * @author Angelo
 */
public interface Handler {
    
    public abstract void accept(HandlerData handlerSwitch);

}
