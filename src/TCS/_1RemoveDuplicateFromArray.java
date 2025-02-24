package TCS;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class _1RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 2, 6, 8, 4, 3};

        // Using sorting and temp array
        int[] sortedResult = removeDuplicatesUsingSorting(nums);
        System.out.println("Using Sorting: " + Arrays.toString(sortedResult));

        // Using LinkedHashSet
        int[] setResult = removeDuplicatesUsingSet(nums);
        System.out.println("Using LinkedHashSet: " + Arrays.toString(setResult));
    }

    // Method 1: Remove duplicates using sorting
    public static int[] removeDuplicatesUsingSorting(int[] nums) {
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
        return Arrays.copyOf(temp, j);
    }

    // Method 2: Remove duplicates using LinkedHashSet
    public static int[] removeDuplicatesUsingSet(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}
