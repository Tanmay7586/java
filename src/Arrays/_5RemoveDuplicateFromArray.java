package Arrays;

import java.util.Arrays;

public class

_5RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 2, 6, 8, 4, 3};
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j] = nums[i];
                j++;
            }
        }
        temp[j++] = nums[nums.length - 1];

        int[] arrayWithoutDuplicates = Arrays.copyOf(temp, j);
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
    }
}
