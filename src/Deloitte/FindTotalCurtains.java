package Deloitte;

import java.util.Scanner;

public class FindTotalCurtains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findTotalCurtains(arr));
    }

    public static int findTotalCurtains(int[] arr) {
        int sum = 0;
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            rem = arr[i] / 12;
            sum = sum + rem;
        }
        return sum;
    }
}
