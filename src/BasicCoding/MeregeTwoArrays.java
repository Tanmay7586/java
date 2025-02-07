package BasicCoding;

import java.util.*;

public class MeregeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[] mergeArray = mergeArrays(arr1, arr2);
        System.out.print(Arrays.toString(mergeArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        return merged;
    }
}
