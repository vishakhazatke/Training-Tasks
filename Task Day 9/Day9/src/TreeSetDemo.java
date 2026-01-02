import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        treeSet.add(10);

        // It will prints sorted
        System.out.println("TreeSet Sorted: " + treeSet);

        System.out.println("Lowest: " + ((TreeSet<Integer>)treeSet).first());
        System.out.println("Highest: " + ((TreeSet<Integer>)treeSet).last());
    }
}
