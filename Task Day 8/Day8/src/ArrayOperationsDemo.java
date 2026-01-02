import java.util.Arrays;

public class ArrayOperationsDemo {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};
        int key = 8;
        int linearIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                linearIndex = i;
                break;
            }
        }
        System.out.println("Linear Search index: " + linearIndex);

        Arrays.sort(arr);
        int binaryIndex = Arrays.binarySearch(arr, key);
        System.out.println("Binary Search index: " + binaryIndex);

        int[] bubble = {4, 2, 7, 1};

        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - i - 1; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble Sort: " + Arrays.toString(bubble));

        int[] selection = {9, 4, 6, 2};
        for (int i = 0; i < selection.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < selection.length; j++) {
                if (selection[j] < selection[min]) {
                    min = j;
                }
            }

            int temp = selection[min];
            selection[min] = selection[i];
            selection[i] = temp;
        }

        System.out.println("Selection Sort: " + Arrays.toString(selection));

        int[] insertion = {8, 3, 5, 1};

        for (int i = 1; i < insertion.length; i++) {
            int temp = insertion[i];
            int j = i - 1;
            while (j >= 0 && insertion[j] > temp) {
                insertion[j + 1] = insertion[j];
                j--;
            }

            insertion[j + 1] = temp;
        }

        System.out.println("Insertion Sort: " + Arrays.toString(insertion));

        arr[1] = 100;

        System.out.println("Updated array: " + Arrays.toString(arr));

        int[] copy1 = new int[arr.length];

        System.arraycopy(arr, 0, copy1, 0, arr.length);

        System.out.println("Copy using arraycopy: " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOf(arr, arr.length);

        System.out.println("Copy using copyOf: " + Arrays.toString(copy2));
    }
}
