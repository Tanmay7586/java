package Arrays;

import java.util.Scanner;

public class _2MaxAndMin {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, -6, 4};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);


//
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        int[] arr = new int[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println("max " + max + "," + "min " + min);
    }
}
