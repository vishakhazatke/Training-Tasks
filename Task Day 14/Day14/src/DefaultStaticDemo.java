interface MyInterface{
    default void show(){
        System.out.println("Default show method in interface");
    }

    static void display(){
        System.out.println("Static method in interface");
    }

}

class MyClass implements MyInterface{

    @Override
    public void show() {
        System.out.println("Overridden show method in class");
    }

}
public class DefaultStaticDemo {
    public static void main(String[] args) {

        MyInterface obj = new MyClass();
        obj.show();

        MyInterface.display();
    }
}
