import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedVsUncheckedDemo {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file); // IOException subclass
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception handled");
        }

        String str = null;
        try {
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception occurred");
        }
    }
}
