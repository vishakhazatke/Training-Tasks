import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));

            Student s = (Student) ois.readObject();

            System.out.println(s.id);
            System.out.println(s.name);
            System.out.println(s.password);

            ois.close();
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
