import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;
    private Person person2;

    @Before
    public void before() {
        busStop = new BusStop("Random stop");
        person = new Person("Joe");
        person2 = new Person("Dave");
    }

    @Test
    public void hasName() {
        assertEquals("Random stop", busStop.getName());
    }

    @Test
    public void hasEmptyQueueAtFirst() {
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPerson(person);
        busStop.addPerson(person2);
        busStop.remove(person);
        assertEquals(1, busStop.getQueue());
    }
}
