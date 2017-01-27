package basicLayer.messageHandler;

import basicLayer.algorithms.Algo;
import basicLayer.data.packageConstructor.PackageFactory;
import basicLayer.data.packages.DataDebugUnit;
import basicLayer.data.packages.DataDiscRespUnit;
import basicLayer.data.packages.DataDiscoverUnit;
import basicLayer.data.packages.DataElectionUnit;
import basicLayer.data.packages.DataLeaderUnit;
import basicLayer.data.packages.DataUnit;
import basicLayer.data.packages.DataUpdateUnit;
import basicLayer.data.packages.DataWannabeLeaderUnit;
import basicLayer.messageHandler.specializedHandlers.DebugHandler;
import basicLayer.messageHandler.specializedHandlers.DiscRespHandler;
import basicLayer.messageHandler.specializedHandlers.DiscoverHandler;
import basicLayer.messageHandler.specializedHandlers.ElectionHandler;
import basicLayer.messageHandler.specializedHandlers.LeaderHandler;
import basicLayer.messageHandler.specializedHandlers.UpdateHandler;
import basicLayer.messageHandler.specializedHandlers.WannabeLeaderHandler;
import error.exceptions.SwitchMatchCustEx;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Part of the Visitor pattern for handling incoming messages 
 * Like the HandlerData.java you need to have one method that will take care
 * the incoming packages.
 * @author Angelo
 */
public class MessageHandler implements HandlerData{

    private final DebugHandler handleDebug;
    private final DiscoverHandler handleDisc;
    private final ElectionHandler handleElect;
    private final LeaderHandler handleLeader;
    private final UpdateHandler handleUpdate;
    private final DiscRespHandler handleDiscResp;
    private final Algo algo;
    private final PackageFactory pckgFactory;
    private final WannabeLeaderHandler handleWannabeLeader;
    
    public MessageHandler(Algo algo, PackageFactory pckgFactory){
        handleDebug = new DebugHandler(pckgFactory);
        handleDisc = new DiscoverHandler(pckgFactory);
        handleElect = new ElectionHandler(pckgFactory);
        handleDiscResp = new DiscRespHandler(pckgFactory);
        handleLeader = new LeaderHandler(pckgFactory);
        handleUpdate = new UpdateHandler(pckgFactory);
        handleWannabeLeader = new WannabeLeaderHandler(pckgFactory);
        this.algo = algo;
        this.pckgFactory = pckgFactory;
    }

    /**
     * Call the handler for Debug packages.
     * @param data DataDebugUnit
     */
    @Override
    public void execute(DataDebugUnit data) {
        handleDebug.handleData(data);
    }
    
    /**
     * Call the handler for Discover-Response packages.
     * @param data DataDiscRespUnit
     */
    @Override
    public void execute(DataDiscRespUnit data) {
        handleDiscResp.handleData(data);
    }

    /**
     * Call the handler for Discover packages.
     * @param data DataDiscoverUnit
     */
    @Override
    public void execute(DataDiscoverUnit data) {
        handleDisc.handleData(data);
    }

    /**
     * Call the handler for Election packages.
     * @param data DataElectionUnit
     */
    @Override
    public void execute(DataElectionUnit data) {
        handleElect.handleData(data, this.algo);
    }
    
    /**
     * Call the handler for Leader packages.
     * @param data DataLeaderUnit
     */
    @Override
    public void execute(DataLeaderUnit data) {
        handleLeader.handleData(data, this.algo);
    }

    /**
     * Call the handler for Update packages.
     * @param data DataUpdateUnit
     */
    @Override
    public void execute(DataUpdateUnit data) {
        handleUpdate.handleData(data);
    }

    /**
     * Call the handler for WannabeLeader packages.
     * @param data
     */
    @Override
    public void execute(DataWannabeLeaderUnit data) {
        handleWannabeLeader.handleData(data, algo);
    }
    
    /**
     * This is a general call which should never be called 
     * since the DataUnit is abstract; It is just here as
     * last resort in case something goes wrong.
     * @param data
     */
    @Override
    public void execute(DataUnit data) {
        try {
            throw new SwitchMatchCustEx(this.getClass().getName());
        } catch (SwitchMatchCustEx ex) {
            Logger.getLogger(MessageHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
