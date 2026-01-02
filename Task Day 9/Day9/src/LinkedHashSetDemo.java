import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("First");
        linkedSet.add("Second");
        linkedSet.add("Third");

        linkedSet.add("First");

        System.out.println("LinkedHashSet: " + linkedSet);
    }
}

