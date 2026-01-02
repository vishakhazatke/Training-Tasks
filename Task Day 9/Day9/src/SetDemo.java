import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println("Set content: " + fruits);

        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the set!");
        }
    }
}
