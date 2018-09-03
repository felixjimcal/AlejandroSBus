package buskata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BusDriver {
    public BusDriver(Ruta ruta, Character... gossip)
    {
        this.ruta = ruta;
        this.gossip = new HashSet<Character>();
        this.gossip.addAll(Arrays.asList(gossip));
    }

    Set<Character> gossip;
    Ruta ruta;

    public Set<Character> getGossip() {
        return gossip;
    }

    public void setGossip(Set<Character> gossip) {
        this.gossip = gossip;
    }
}
