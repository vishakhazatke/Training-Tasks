import java.util.ArrayList;

public class ArraysVsArrayListDemo {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println("Array elements: ");
        for(int i : arr){
            System.out.println(i);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("ArrayList elements");
        for(int i : list){
            System.out.println(i);
        }

        list.add(1, 99);
        list.remove(2);

        System.out.println("After insertion & removal: ");
        System.out.println(list);
    }
}
