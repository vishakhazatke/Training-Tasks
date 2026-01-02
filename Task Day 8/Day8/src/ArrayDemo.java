public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Array Elements: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        System.out.println("Array Length: " + numbers.length);
    }
}
