import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> fruitStock = new HashMap<>();

        fruitStock.put("Apple", 50);
        fruitStock.put("Banana", 30);
        fruitStock.put("Mango", 100);

        System.out.println("Apple stock: " + fruitStock.get("Apple"));

        fruitStock.remove("Banana");

        System.out.println("Total items: " + fruitStock.size());
        System.out.println("Has Mango? " + fruitStock.containsKey("Mango"));

        for (Map.Entry<String, Integer> entry : fruitStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
