/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicLayer.messageHandler;

import basicLayer.data.packages.DataDebugUnit;
import basicLayer.data.packages.DataDiscRespUnit;
import basicLayer.data.packages.DataDiscoverUnit;
import basicLayer.data.packages.DataElectionUnit;
import basicLayer.data.packages.DataLeaderUnit;
import basicLayer.data.packages.DataUnit;
import basicLayer.data.packages.DataUpdateUnit;
import basicLayer.data.packages.DataWannabeLeaderUnit;

/**
 * Part of the Visitor pattern (visitor). 
 * @author Angelo
 */
public interface HandlerData {
    public void execute(DataUnit data);
    public void execute(DataDebugUnit data);
    public void execute(DataDiscoverUnit data);
    public void execute(DataElectionUnit data);
    public void execute(DataDiscRespUnit data);
    public void execute(DataLeaderUnit data);
    public void execute(DataUpdateUnit data);
    public void execute(DataWannabeLeaderUnit data);
}
