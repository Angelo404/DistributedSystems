/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler;

import algorithms.Algo;
import data.packageConstructor.PackageFactory;
import data.packages.DataDebugUnit;
import data.packages.DataDiscRespUnit;
import data.packages.DataDiscoverUnit;
import data.packages.DataElectionUnit;
import data.packages.DataLeaderUnit;
import data.packages.DataUnit;
import data.packages.DataUpdateUnit;
import data.packages.DataWannabeLeaderUnit;
import error.ErrorMessages;
import messageHandler.specializedHandlers.DebugHandler;
import messageHandler.specializedHandlers.DiscRespHandler;
import messageHandler.specializedHandlers.DiscoverHandler;
import messageHandler.specializedHandlers.ElectionHandler;
import messageHandler.specializedHandlers.LeaderHandler;
import messageHandler.specializedHandlers.UpdateHandler;
import messageHandler.specializedHandlers.WannabeLeaderHandler;

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
