/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layerOne.messageHandler;

import layerOne.data.packages.DataDebugUnit;
import layerOne.data.packages.DataDiscRespUnit;
import layerOne.data.packages.DataDiscoverUnit;
import layerOne.data.packages.DataElectionUnit;
import layerOne.data.packages.DataLeaderUnit;
import layerOne.data.packages.DataUnit;
import layerOne.data.packages.DataUpdateUnit;
import layerOne.data.packages.DataWannabeLeaderUnit;

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
