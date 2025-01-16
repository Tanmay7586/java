package Deloitte;

public class MaxProductPair {
    public static void main(String[] args) {
        int[] arr = {-1,};
        int[] result = maxProductPair(arr);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("na");
        }
    }

    public static int[] maxProductPair(int[] arr) {
        if (arr.length < 2) {
            return null;
        }
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        if (min1 * min2 > max1 * max2) {
            return new int[]{min1, min2};
        } else {
            return new int[]{max1, max2};
        }

    }
}
