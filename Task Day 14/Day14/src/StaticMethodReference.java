import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {

    static void printMessage(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Method", "Reference");

        names.forEach(StaticMethodReference::printMessage);
    }
}
