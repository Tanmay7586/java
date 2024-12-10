package BasicCoding;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            // Display the array after each pass
            System.out.print("Step " + (i + 1) + ": ");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Before Selection Sort:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("After Selection Sort:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
