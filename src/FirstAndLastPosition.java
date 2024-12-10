import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = firstPosition(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] firstPosition(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchRange(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = searchRange(nums, target, false);
        }
        return ans;
    }

    public static int searchRange(int[] nums, int target, boolean firstPosition) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
