package Arrays;

import java.util.*;

public class _29AddingElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int value = 40;

        // Insert at the beginning
        arr = insertAtBegin(arr, n, value);

        // Insert at the end
        arr = insertAtEnd(arr, value);

        // Insert at position 4
        arr = insertAtPosition(arr, 4, value);

        // Print the modified array
        System.out.println("Modified Array: " + Arrays.toString(arr));

        sc.close();
    }

    // Insert at beginning
    public static int[] insertAtBegin(int[] arr, int n, int value) {
        int[] newArr = new int[n + 1];
        newArr[0] = value;  // Insert new value at index 0

        // Copy original elements
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // Insert at end
    public static int[] insertAtEnd(int[] arr, int value) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        // Copy original array
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = value;  // Insert at last position
        return newArr;
    }

    // Insert at a specific position (1-based index)
    public static int[] insertAtPosition(int[] arr, int position, int value) {
        int n = arr.length;

        if (position < 1 || position > n + 1) {
            System.out.println("Invalid position!");
            return arr;
        }

        int[] newArr = new int[n + 1];

        // Copy elements before position
        for (int i = 0; i < position - 1; i++) {
            newArr[i] = arr[i];
        }

        newArr[position - 1] = value;  // Insert new element

        // Copy elements after position
        for (int i = position; i < n + 1; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;
    }
}
