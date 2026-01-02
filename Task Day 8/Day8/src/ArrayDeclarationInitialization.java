public class ArrayDeclarationInitialization {
    public static void main(String[] args) {

        int[] arr1;
        int arr2[];

        arr1 = new int[5];

        arr1[0] = 10;
        arr1[1] = 20;

        int[] arr3 = {10, 20, 30};

        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1[1] = " + arr1[1]);

        System.out.println("arr3 elements:");
        for(int i = 0; i < arr3.length; i++){
            System.out.println("Index " + i + ": " + arr3[i]);
        }

        System.out.println("Length of arr3 = " + arr3.length);

    }
}
