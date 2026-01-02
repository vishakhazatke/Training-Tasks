import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            new Scanner(new File("test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found : Checked Exception");
        }

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : Unchecked Exception");
        }

        int[] arr = new int[Integer.MAX_VALUE]; // OutOfMemoryError
    }
}
