package coffee;

import java.util.ArrayList;
import java.util.List;

public class Barista {

    public List<String> getsPendingOrders() {
        List <String> results = new ArrayList<>();
        results.add("large cappuccino");
        return results;
    }

    public List <String> getsUrgentOrders() {
        List <String> results = new ArrayList<>();
        results.add("large cappuccino");
        return results;
    }
}
