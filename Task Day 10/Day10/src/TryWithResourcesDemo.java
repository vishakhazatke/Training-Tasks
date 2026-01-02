import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("data.txt")) {
            int ch = fr.read();
            System.out.println((char) ch);
        }
        catch (IOException e) {
            System.out.println("Exception occurred");
        }
    }
}
