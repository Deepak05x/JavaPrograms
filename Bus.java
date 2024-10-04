import java.util.Iterator;
import java.util.*;

public class Bus {
    private int busno;
    private boolean ac;
    private int cap;

    public Bus(int busno, boolean ac, int cap) {
        this.busno = busno;
        this.ac = ac;
        this.cap = cap;
    }

    List<Bus> buses = new ArrayList<>();
    Iterator<Bus> iter = buses.iterator();

}
