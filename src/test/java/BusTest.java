import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private Person person2;

    @Before
    public void before() {
        person = new Person("Joe");
        person2 = new Person("Dave");
        bus = new Bus("Wherever", 3);
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
}
