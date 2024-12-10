package Arrays;

import java.util.Arrays;

public class _3PairSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int start = 0;
        int end = nums.length - 1;
        int sum;
        int[] pair = new int[2];

        while (start < end) {
            sum = nums[start] + nums[end];
            if (sum == target) {
                pair[0] = nums[start];
                pair[1] = nums[end];
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(Arrays.toString(pair));
    }
}
