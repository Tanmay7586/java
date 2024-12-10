package BasicCoding;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
                System.out.print("Step " + (i + 1) + ": ");
                for (int value : array) {
                    System.out.print(value + " ");
                }
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Bubble Sorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
