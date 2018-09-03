import buskata.BusDriver;
import buskata.GossipExchanger;
import buskata.Ruta;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;

public class GossipExchangerShuold {

    @Test
    public void exchageSimpleGossip() {

        BusDriver driver1 = new BusDriver(null, 'A');

        BusDriver driver2 = new BusDriver(null, 'B');

        GossipExchanger gossipExchanger = new GossipExchanger(driver1, driver2);
        gossipExchanger.exchange();

        Assert.assertEquals(driver1.getGossip(), driver2.getGossip());
    }

    @Test
    public void exchangeAllGossips(){
        BusDriver driver1 = new BusDriver(null, 'A', 'B', 'E', 'L');
        BusDriver driver2 = new BusDriver(null, 'A','B','C');
        BusDriver driver3 = new BusDriver(null,  'A','B','C','L','K','P');

        GossipExchanger gossipExchanger = new GossipExchanger(driver1, driver2, driver3);
        gossipExchanger.exchange();

        Set<Character> gossips = new HashSet<Character>();
        gossips.addAll(Arrays.asList('A','B','C','E','L','K','P'));

        Assert.assertEquals(driver1.getGossip(),gossips);

    }

}
