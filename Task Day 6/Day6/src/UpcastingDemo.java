class EmployeeDemo{
    int baseSalary = 30000;

    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends EmployeeDemo{
    int bonus = 10000;
    @Override
    void work(){
        System.out.println("Developer is working");
    }

    void writeCode(){
        System.out.println("Developer specific work");
    }
}
public class UpcastingDemo {
    public static void main(String[] args) {
        EmployeeDemo e = new Developer();

        System.out.println(e.baseSalary);
        e.work();
    }
}
