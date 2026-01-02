import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Remove element: " + stack.pop());
        System.out.println("New Top element: " + stack.peek());
    }
}
