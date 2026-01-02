import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("The String at index 1 is: " + list.get(1));

        list.add(1, "Javascript");
        list.remove(2);
        System.out.println("Final List: " + list);
    }
}
