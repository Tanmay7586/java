package Deloitte;

import java.util.Scanner;

public class FindTotalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findTotalSum(arr, k));
    }

    public static int findTotalSum(int[] arr, int k) {
        int sum = 0;
        int diff = 0;
        for (int i = k - 1; i < arr.length-1; i++) {
            diff = Math.abs(arr[i] - arr[i + 1]);
            sum += diff;
        }
        return sum;
    }
}
