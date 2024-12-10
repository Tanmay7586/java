package BinarySearch;

public class _11FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 2;
        int start = 1;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] > nums[mid - 1]) {
                start = mid + 1;
            } else if (nums[mid] > nums[mid + 1]) {
                end = mid - 1;
            } else start = mid + 1;
        }

        return -1;
    }
}
