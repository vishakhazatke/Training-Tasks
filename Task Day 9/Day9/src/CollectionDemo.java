import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 15));

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);

        List<Integer> synchlist = Collections.synchronizedList(list);
        System.out.println("Synchlist: " + synchlist);

        List<Integer> readOnly = Collections.unmodifiableList(list);
        System.out.println("Readonly: " + readOnly);

        System.out.println("The Final List: " + list);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
