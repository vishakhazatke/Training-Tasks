@FunctionalInterface
interface Operation{
    int calculate(int a, int b);
}
public class FunctionalInterfaceDemo {

    static void performOperation(int x, int y, Operation op){
        int result = op.calculate(x,y);
        System.out.println("Result: " + result);
    }
    public static void main(String[] args) {

        Operation addtion = (a , b) -> a + b;

        performOperation(10, 20, addtion);
    }
}
