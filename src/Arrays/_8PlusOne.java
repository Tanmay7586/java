package Arrays;

import java.util.Arrays;

public class _8PlusOne {
    public static void main(String[] args) {
        int[] digits = {0, 9, 8};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;

//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] != 9) {
//                digits[i]++;
//                break;
//            } else {
//                digits[i] = 0;
//            }
//        }
//        if (digits[0] == 0) {
//            int res[] = new int[digits.length + 1];
//            res[0] = 1;
//            return res;
//        }
//        return digits;

    }
}
