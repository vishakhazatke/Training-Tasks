import java.util.Optional;

public class OptionalWithValue {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Vishakha");

        System.out.println(name.get());
    }
}
