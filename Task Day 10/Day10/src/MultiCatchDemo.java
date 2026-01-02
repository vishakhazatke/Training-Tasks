public class MultiCatchDemo {
    public static void main(String[] args) {

        try {
            int[] arr = new int[2];
            arr[5] = 10;
            int x = 10 / 0;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
        }
    }

}
