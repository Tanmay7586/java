package BinarySearch;

public class _08MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 0, 1, 2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;
            //optional step when the search space in already sorted and then the nums[start] will be minimum
            if (nums[start] <= nums[end]) {
                min = Math.min(nums[start], min);
                break;
            }
            if (nums[start] <= nums[mid]) {
                min = Math.min(nums[start], min);
                start = mid + 1;
            } else {
                min = Math.min(nums[mid], min);
                end = mid - 1;
            }
        }
        return min;
    }
}
