import java.util.ArrayList;

public class BusStop {

    private final String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }
}
