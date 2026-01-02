import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put(null, "Special value");
        map.put("Key1", null);

        map.put("KeyA", "Data1");
        map.put("KeyB", "Data2");

        System.out.println("Value for KeyA : " + map.get("KeyA"));
    }
}
