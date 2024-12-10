
//Using LB, UB
//package BinarySearch;
//
//public class _05FirstAndLastOccurrencesOfX {
//    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int n = nums.length;
//        int target = 10;
//        int lb = lowerBound(nums, n, target);
//
//        if (lb == n || nums[lb] != target) {
//            System.out.println("[-1, -1]");
//            return;
//        }
//
//        int ub = upperBound(nums, n, target);
//        System.out.println("[" + lb + ", " + (ub - 1) + "]");
//    }
//
//    static int lowerBound(int[] arr, int n, int x) {
//        int low = 0, high = n - 1;
//        int ans = n;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (arr[mid] >= x) {
//                ans = mid;
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return ans;
//    }
//
//    static int upperBound(int[] arr, int n, int x) {
//        int low = 0, high = n - 1;
//        int ans = n;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (arr[mid] > x) {
//                ans = mid;
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return ans;
//    }
//}

package BinarySearch;

import java.util.Arrays;

public class _05FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int n = nums.length;
        int target = 10;
        System.out.println(Arrays.toString(firstAndLastOccurrence(nums, n, target)));
    }

    static int[] firstAndLastOccurrence(int[] nums, int n, int target) {

        int firstOccurrence = firstOccurrence(nums, n, target);
        if (firstOccurrence == -1) return new int[]{-1, -1};
        int lastOccurrence = lastOccurrence(nums, n, target);
        return new int[]{firstOccurrence, lastOccurrence};
    }

    static int firstOccurrence(int[] nums, int n, int target) {
        int start = 0;
        int end = n - 1;
        int first = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    static int lastOccurrence(int[] nums, int n, int target) {
        int start = 0;
        int end = n - 1;
        int last = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
}

