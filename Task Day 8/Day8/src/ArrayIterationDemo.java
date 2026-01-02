import java.util.Arrays;

public class ArrayIterationDemo {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Traditional for loop: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Index " + i + ": " + arr[i]);
        }

        System.out.println("Enhanced for loop");
        for(int value : arr){
            System.out.println(value);
        }

        System.out.println("While loop: ");
        int i = 0;
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("Using Streams: ");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
