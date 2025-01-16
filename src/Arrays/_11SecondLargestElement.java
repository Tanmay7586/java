package Arrays;

public class _11SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {9, 12, 4, 8, 6, 3, 21, 5};
        System.out.println(findSecondLarge(arr));
        System.out.println(findSecondSmall(arr));
    }

    private static int findSecondSmall(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    static int findSecondLarge(int[] arr) {
        int max, secMax;
        max = secMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secMax = max;
                max = x;
            } else {
                if (x > secMax && x != max) {
                    secMax = x;
                }
            }
        }
        return secMax;
    }
}
