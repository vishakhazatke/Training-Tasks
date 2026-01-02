import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws Exception {

        Student s = new Student(1, "Vishakha", "secret");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));

        oos.writeObject(s);
        oos.close();
    }
}
