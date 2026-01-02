import java.util.Arrays;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Banana", "Apple", "Mango");

        names.sort((a, b) -> a.compareTo(b));

        System.out.println("Sorted names: " + names);
    }
}
