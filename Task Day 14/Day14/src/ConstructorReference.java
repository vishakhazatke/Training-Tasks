import java.util.function.Supplier;
class Student{

    Student(){
        System.out.println("Student Object created");
    }
}
public class ConstructorReference {
    public static void main(String[] args) {

        Supplier<Student> s = Student::new;

        Student st = s.get();
    }
}
