import java.util.Arrays;
import java.util.List;

public class StreamUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("vishakha", "java", "stream");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));
    }
}
