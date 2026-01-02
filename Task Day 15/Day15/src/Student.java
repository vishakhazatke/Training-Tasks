import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String name;
    transient String password;

    Student(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
