import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Ten");
        treeMap.put(1, "One");
        treeMap.put(5, "Five");

        System.out.println("Sorted Map: " + treeMap);

        TreeMap<Integer, String> specificMap = (TreeMap<Integer, String>) treeMap;
        System.out.println("First Key: " + specificMap.firstKey());
        System.out.println("Last Key: " + specificMap.lastKey());
    }
}

