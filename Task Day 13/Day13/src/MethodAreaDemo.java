public class MethodAreaDemo {

    static int count = 1000;  //Method area

    static void display(){                 //Method area
        System.out.println(count);
    }
    public static void main(String[] args) {

        display();
    }
}
