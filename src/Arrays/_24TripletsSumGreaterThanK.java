package Arrays;

import java.util.Arrays;

public class _24TripletsSumGreaterThanK {

    // This method returns and prints the triplets whose sum is greater than K
    public static void findTriplets(int[] arr, int K) {
        Arrays.sort(arr); // Sort the array to use two-pointer technique
        int n = arr.length;

        // Iterate through the array and pick each element one by one
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;  // Pointer to the next element
            int high = n - 1; // Pointer to the last element

            // Find pairs (low, high) where arr[i] + arr[low] + arr[high] > K
            while (low < high) {
                if (arr[i] + arr[low] + arr[high] > K) {
                    // Print all pairs from low to high because they are valid
                    for (int j = low; j < high; j++) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[high] + ")");
                    }
                    high--; // Decrease high pointer to check for other valid triplets
                } else {
                    low++; // Increase low pointer to make the sum larger
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int K = 8;  // The sum threshold

        // Call method to find and print the triplets
        findTriplets(arr, K);
    }
}
