import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Orange");

        set.add("Apple");

        System.out.println("Set Size is: " + set.size());
        System.out.println("Contains Mango ? :" + set.contains("Mango"));
        System.out.println("All Fruits in Set is: " + set);
    }
}
