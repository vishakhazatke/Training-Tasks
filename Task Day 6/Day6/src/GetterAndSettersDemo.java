class Employee{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
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

public class GetterAndSettersDemo {

    public static void main(String [] args){

        Employee e1 = new Employee();
        e1.setName("Vishakha");
        e1.setAge(22);
        e1.setAge(15); // Invalid Age

        System.out.println("Employee Name: " + e1.getName());
        System.out.println("Employee Age: " + e1.getAge());
    }
}
