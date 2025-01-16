package Deloitte;

import java.util.ArrayList;
import java.util.List;

public class FindNumberswithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {123, 4567, 89, 1001, 22};
        List<Integer> al = new ArrayList<>();
        for (int num : arr) {
            int count = 0;
            int tempNum = num;
            while (tempNum > 0) {
                tempNum /= 10;
                count++;
            }

            if (count % 2 == 0) {
                al.add(num);
            }
        }
        System.out.println(al);
    }
}
