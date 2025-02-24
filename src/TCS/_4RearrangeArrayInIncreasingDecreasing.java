package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class _4RearrangeArrayInIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrangeArray(arr, n);
    }

    public static void rearrangeArray(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
