import java.util.Arrays;
import java.util.List;

public class StreamMaxNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 20, 50);

        int max = numbers.stream()
                .max((a, b) -> a.compareTo(b))
                .get();

        System.out.println("Maximun Number: " + max);
    }
}
