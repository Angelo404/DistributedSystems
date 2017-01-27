package basicLayer.data.packageConstructor;

import basicLayer.data.packages.DataUnit;
import error.exceptions.SwitchMatchCustEx;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Factory for creating data units;
 * @author Angelo
 */
public class PackageFactory {

    private final AckConstructor ackCon;
    private final DiscoverConstructor discCon;
    private final DiscRespConstructor discRespCon;
    private final ElectionConstructor electCon;
    private final LeaderConstructor leadCon;
    private final UpdateConstructor updateCon;
    private final DebugConstructor debugCon;
    private final WannabeLeaderConstructor wannabeLeaderCon;

    /**
     * Initialize the factory and the constructors for the creation of data units.
     */
    public PackageFactory() {
        ackCon = new AckConstructor();
        discCon = new DiscoverConstructor();
        discRespCon = new DiscRespConstructor();
        electCon = new ElectionConstructor();
        leadCon = new LeaderConstructor();
        updateCon = new UpdateConstructor();
        debugCon = new DebugConstructor();
        wannabeLeaderCon = new WannabeLeaderConstructor();
    }

    /**
     * TODO change this to multiple methods.
     * @param type DataType
     * @return DataUnit
     */
    public DataUnit constructPackage(DataType type) {
        DataUnit tmpData = null;

        switch (type) {
            case ACK:
                tmpData = ackCon.createPackage();
                break;
            case DISCOVER:
                tmpData = discCon.createPackage();
                break;
            case DISCRESP:
                tmpData = discRespCon.createPackage();
                break;
            case ELECTION:
                tmpData = electCon.createPackage();
                break;
            case LEADER:
                tmpData = leadCon.createPackage();
                break;
            case UPDATE:
                tmpData = updateCon.createPackage();
                break;
            case DEBUG:
                tmpData = debugCon.createPackage();
                break;
            case WANNABELEADER:
                tmpData = wannabeLeaderCon.createPackage();
                break;
            default: {
                try {
                    throw new SwitchMatchCustEx(this.getClass().getName());
                } catch (SwitchMatchCustEx ex) {
                    Logger.getLogger(PackageFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

        }
        return tmpData;

    }

}
