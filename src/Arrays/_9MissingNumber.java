package Arrays;

import java.util.Arrays;

public class _9MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        Arrays.sort(nums);
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int missingnum;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int actualsum = (n * (n + 1)) / 2;
        missingnum = actualsum - sum;
        return missingnum;
    }
}
