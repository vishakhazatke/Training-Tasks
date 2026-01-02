import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        if(name.isPresent()){
            System.out.println(name.get());
        }
        else {
            System.out.println("No value present");
        }

        String value = name.orElse("Default Name");
        System.out.println("Value using orElse: " +value);

        String value2 = name.orElseThrow(() ->
                new RuntimeException("No value present in optional"));
    }
}
