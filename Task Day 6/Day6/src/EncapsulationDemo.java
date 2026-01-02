class Student{

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        } else{
            System.out.println("Invalid ID. ID must be positive");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        } else{
            System.out.println("Invalid Name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 60) {
            this.age = age;
        } else{
            System.out.println("Invalid Age! Age must be between 18 and 60");
        }
    }
}
public class EncapsulationDemo {

    public static void main(String [] args){

        Student s = new Student();
        s.setId(101);
        s.setName("Vishakha");
        s.setAge(22);

        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
