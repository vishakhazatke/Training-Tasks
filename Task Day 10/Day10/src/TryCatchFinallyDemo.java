public class TryCatchFinallyDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");
            int result = 10 / 0;
            System.out.println("This line will not execute");
        }

        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        }
        catch (Exception e) {
            System.out.println("Caught General Exception");
        }
        finally {
            System.out.println("Finally block executes always");
        }

        System.out.println("Code after try-catch-finally");
    }
}

