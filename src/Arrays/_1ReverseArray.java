package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _1ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));





//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int start = 0;
//        int end = num - 1;
//
//        int[] arr = new int[num];
//        System.out.println("Enter " + num + " elements:");
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//        System.out.println("Reversed array:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }
}
