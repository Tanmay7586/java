package Deloitte;

import java.util.Scanner;

public class FindDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDifference(arr));
    }

    public static int findDifference(int[] arr) {
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndex += arr[i];
            } else {
                oddIndex += arr[i];
            }
        }
        return Math.abs(evenIndex - oddIndex);
    }
}
