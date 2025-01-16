package Deloitte;

import java.util.*;

public class CountOddEvenDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(countOddEvenDifference(size, arr));
    }

    public static int countOddEvenDifference(int size, int[] arr) {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }
        return oddCount - evenCount;
    }
}
