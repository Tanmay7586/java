package BinarySearch;

public class _16FindtheSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] num, int threshold) {
        int min = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        while (min < max) {
            int mid = (min + max) / 2;
            int ans = 0;
            for (int i = 0; i < num.length; i++) {
                ans += (int)Math.ceil((double)num[i] / mid);
            }
            if (ans <= threshold) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
