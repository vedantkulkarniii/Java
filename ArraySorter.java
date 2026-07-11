import java.util.Scanner;
import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        // Bubble Sort
        int[] sortedArr = arr.clone();
        bubbleSort(sortedArr);
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(sortedArr));

        // Reverse sorted
        sortDescending(sortedArr);
        System.out.println("Sorted Array (Descending): " + Arrays.toString(sortedArr));

        sc.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        System.arraycopy(reversed, 0, arr, 0, arr.length);
    }
}
