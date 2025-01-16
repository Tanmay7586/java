package BinarySearch;

public class _14MinimumdaystomakeMbouquets {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;

        int ans = roseGarden(arr, k, m);
        if (ans == -1) {
            System.out.println("We cannot make m bouquets.");
        } else {
            System.out.println("We can make bouquets on day " + ans);
        }
    }

    // Main function to calculate the minimum day
    public static int roseGarden(int[] arr, int k, int m) {
        // If required flowers exceed available, return -1
        if ((long) k * m > arr.length) return -1;

        // Find minimum and maximum days in bloomDay array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        int low = min;
        int high = max;

        // Perform binary search to find the minimum day
        while (low < high) {
            int mid = low + (high - low) / 2; // Prevents overflow
            if (isPossible(arr, mid, m, k)) {
                high = mid; // Try earlier days
            } else {
                low = mid + 1; // Try later days
            }
        }

        return low; // Minimum day to make required bouquets
    }

    // Check if it is possible to form m bouquets with given day
    public static boolean isPossible(int[] arr, int day, int m, int k) {
        int bouquets = 0; // Number of bouquets formed
        int flowers = 0;  // Consecutive flowers count

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                flowers++; // Add to the current bouquet
                if (flowers == k) {
                    bouquets++; // Bouquet formed
                    flowers = 0; // Reset flowers count
                }
            } else {
                flowers = 0; // Reset if flower cannot bloom
            }

            // Early exit if enough bouquets are formed
            if (bouquets >= m) return true;
        }

        return bouquets >= m; // Return whether bouquets are sufficient
    }
}
