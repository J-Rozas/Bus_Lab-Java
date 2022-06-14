import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private Person person2;
    private Person person3;
    private Person person4;
    private BusStop busStop;

    @Before
    public void before() {
        person = new Person("Joe");
        person2 = new Person("Dave");
        person3 = new Person("Jane");
        person4 = new Person("Dan");
        bus = new Bus("Wherever", 3);
        busStop = new BusStop("Cool stop");
        busStop.addPerson(person3);
        busStop.addPerson(person4);
    }

    @Test
    public void checkStartsOffEmpty() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void checkHasDestination() {
        assertEquals("Wherever", bus.getDestination());
    }

    @Test
    public void checkHasCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void shouldAddPassengerIfSpaceAvailable() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void shouldNotAddPassengerIfFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.getPassengers());
    }

    @Test
    public void shouldBeAbleToRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person2);
        bus.removePassenger(person2);
        assertEquals(1, bus.getPassengers());
    }

    @Test
    public void shouldBeAbleToPickUpFromBusStop() {
        bus.addPassenger(person);
        bus.addFromStop(busStop.getPassengersObjects());
        assertEquals(3, bus.getPassengers());
    }
}
