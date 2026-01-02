import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {

    void show(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {

        InstanceMethodReference obj = new InstanceMethodReference();

        List<String> names = Arrays.asList("Instance", "Method", "Reference");

        names.forEach(obj::show);
    }
}
