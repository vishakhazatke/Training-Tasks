import java.util.Arrays;
import java.util.List;

public class ForEachListDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Spring", "SQL");

        names.forEach(n -> System.out.println(n));
    }
}
