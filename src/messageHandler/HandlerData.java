/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageHandler;

import data.packages.DataDebugUnit;
import data.packages.DataDiscRespUnit;
import data.packages.DataDiscoverUnit;
import data.packages.DataElectionUnit;
import data.packages.DataLeaderUnit;
import data.packages.DataUnit;
import data.packages.DataUpdateUnit;
import data.packages.DataWannabeLeaderUnit;

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
