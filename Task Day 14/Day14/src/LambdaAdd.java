@FunctionalInterface
interface Add{
    int add(int a, int b);
}
public class LambdaAdd {
    public static void main(String[] args) {

        Add sum = (a, b) -> a + b;

        System.out.println("Addition: " + sum.add(10, 20));
    }
}
