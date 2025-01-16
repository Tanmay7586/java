package Arrays;

public class _17PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        pairOfSum(arr);
        optimizedPairSum(arr);
    }

    static void pairOfSum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 6) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void optimizedPairSum(int[] arr) {
        int sum;
        int count = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == 6) {
                count++;
                start++;
                end--;
            } else if (sum > 6) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(count);
    }
}
