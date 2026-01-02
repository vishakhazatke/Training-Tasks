import java.util.*;

public class LinkedHashmapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Zebra", 10);
        map.put("Apple", 20);
        map.put("Mango", 30);

        // Will print in the exact order they were put in
        System.out.println("Order: " + map);
    }
}
