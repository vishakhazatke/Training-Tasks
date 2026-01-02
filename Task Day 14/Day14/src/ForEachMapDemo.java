import java.util.HashMap;
import java.util.Map;

public class ForEachMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "SQL");

        map.forEach((Key, value) -> System.out.println("Key: " + Key + " , Value: " + value));
    }
}
