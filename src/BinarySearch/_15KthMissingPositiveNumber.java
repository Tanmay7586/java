package BinarySearch;

public class _15KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int k = 4;
        int ans = findKthPositive(vec, k);
        System.out.println("The missing number is: " + ans);
    }

    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] - mid - 1 < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low + k;
    }
}