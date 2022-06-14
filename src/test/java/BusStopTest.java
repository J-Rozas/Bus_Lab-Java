import org.junit.Before;
import org.junit.Test;

public class BusStopTest {
    private BusStop busStop;

    @Before
    public void before() {
        busStop = new BusStop("Random stop");
    }

    @Test
    public void hasName() {
        assertEquals("Random stop", busStop.getName());
    }
}
