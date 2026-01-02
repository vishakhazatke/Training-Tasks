class Student{
    private String name;
    private int rollNo;
    private String email;
    private String city;

    private Student(Builder builder){
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.email = builder.email;
        this.city = builder.city;
    }

    static class Builder{
        private String name;
        private int rollNo;
        private String email;
        private String city;

        Builder(String name, int rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }

        Builder email(String email){
            this.email = email;
            return this;
        }

        Builder city(String city){
            this.city = city;
            return this;
        }

        Student build(){
            return new Student(this);
        }
    }

    void show(){
        System.out.println("Name: " + name + " , Roll No: " + rollNo + " , Email: " + email + " , City: " + city);
    }
}
public class BuilderDemo {
    public static void main(String[] args) {

        Student s1 = new Student.Builder("Vishakha" , 1)
                .email("vishu@gmail.com")
                .city("Pune")
                .build();

        s1.show();
    }
}
