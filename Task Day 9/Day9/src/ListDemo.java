import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple");

        String secondFruit = fruits.get(1);
        System.out.println(secondFruit);

        fruits.set(0, "Cheery");
        System.out.println(fruits);
    }
}
