import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void hasEmptyQueueAtFirst() {
        assertEquals(0, bus.getQueue());
    }
}
