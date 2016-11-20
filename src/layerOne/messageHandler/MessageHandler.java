/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler;

import layerOne.algorithms.Algo;
import layerOne.data.packageConstructor.PackageFactory;
import layerOne.data.packages.DataDebugUnit;
import layerOne.data.packages.DataDiscRespUnit;
import layerOne.data.packages.DataDiscoverUnit;
import layerOne.data.packages.DataElectionUnit;
import layerOne.data.packages.DataLeaderUnit;
import layerOne.data.packages.DataUnit;
import layerOne.data.packages.DataUpdateUnit;
import layerOne.data.packages.DataWannabeLeaderUnit;
import error.ErrorMessages;
import layerOne.messageHandler.specializedHandlers.DebugHandler;
import layerOne.messageHandler.specializedHandlers.DiscRespHandler;
import layerOne.messageHandler.specializedHandlers.DiscoverHandler;
import layerOne.messageHandler.specializedHandlers.ElectionHandler;
import layerOne.messageHandler.specializedHandlers.LeaderHandler;
import layerOne.messageHandler.specializedHandlers.UpdateHandler;
import layerOne.messageHandler.specializedHandlers.WannabeLeaderHandler;

/**
 * Part of the Visitor pattern for handling incoming messages
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

    @Override
    public void execute(DataDebugUnit data) {
        handleDebug.handleData(data);
    }
    
    @Override
    public void execute(DataDiscRespUnit data) {
        handleDiscResp.handleData(data, this.pckgFactory);
    }

    @Override
    public void execute(DataDiscoverUnit data) {
        handleDisc.handleData(data);
    }

    @Override
    public void execute(DataElectionUnit data) {
        handleElect.handleData(data, this.algo);
    }
    
    @Override
    public void execute(DataLeaderUnit data) {
        handleLeader.handleData(data, this.algo);
    }

    @Override
    public void execute(DataUpdateUnit data) {
        handleUpdate.handleData(data);
    }

    @Override
    public void execute(DataWannabeLeaderUnit data) {
        handleWannabeLeader.handleData(data, algo);
    }
    
    @Override
    public void execute(DataUnit data) {
        System.err.println(ErrorMessages.THIS_SHOULD_NOT_SHOW);
    }
}
