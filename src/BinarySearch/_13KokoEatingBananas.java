package BinarySearch;

public class _13KokoEatingBananas {
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimuRateToEatBananas(v, h);
        System.out.println("koko should eat atleast " + ans + " bananas");
    }

    public static int minimuRateToEatBananas(int[] v, int h) {
        int low = 1;
        int high = findMax(v);
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int findMax(int[] v) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= v.length - 1; i++) {
            max = Math.max(v[i], max);
        }
        return max;
    }

    public static int calculateTotalHours(int[] v, int mid) {
        int totalHours = 0;
        for (int i = 0; i <= v.length - 1; i++) {
            totalHours += Math.ceil((double) (v[i]) / (double) (mid));
        }
        return totalHours;
    }
}
