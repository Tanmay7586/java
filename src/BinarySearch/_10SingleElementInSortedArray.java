package BinarySearch;

public class _10SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 4, 4, 8};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];
            //eliminate left half
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {  //eliminate right half
                high = mid - 1;
            }
        }

        return -1;
    }
}
