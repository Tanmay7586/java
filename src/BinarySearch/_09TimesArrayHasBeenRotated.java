package BinarySearch;

public class _09TimesArrayHasBeenRotated {
    public static void main(String[] args) {
        int[] nums = {5, 6, 1, 2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            //optional step when the search space in already sorted and then the nums[start] will be minimum
            if (nums[start] <= nums[end]) {
                if (nums[start] < min) {
                    index = start;
                    min = nums[start];
                }
                break;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] < min) {
                    index = start;
                    min = nums[start];
                }
                start = mid + 1;
            } else {
                if (nums[mid] < min) {
                    index = mid;
                    min = nums[mid];
                }
                end = mid - 1;
            }
        }
        return index;
    }
}
