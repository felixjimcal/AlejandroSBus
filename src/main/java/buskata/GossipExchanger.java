package buskata;

import java.util.HashSet;
import java.util.Set;

public class GossipExchanger {

    public GossipExchanger(BusDriver... busDrivers)
    {
        this.busDriver = busDrivers;
    }

    public void exchange() {

        Set<Character> gossips = new HashSet<Character>();

        for(int i = 0;i < busDriver.length; i++)
        {
            gossips.addAll(busDriver[i].getGossip());
        }

        for(int i = 0;i < busDriver.length; i++)
        {
            busDriver[i].setGossip(gossips);
        }

    }

    BusDriver[] busDriver;
}
