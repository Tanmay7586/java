public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {9,12,4,8,6,3,21,5};
        System.out.println(findSecondLarge(arr));
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
