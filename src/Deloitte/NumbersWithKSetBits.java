package Deloitte;

import java.util.*;

public class NumbersWithKSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<String> binaryNumbersWithKSetBits = new ArrayList<>();

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (Integer.bitCount(i) == k) {
                binaryNumbersWithKSetBits.add(Integer.toBinaryString(i));
                count++;
            }
        }
        System.out.println(count);
        System.out.println(binaryNumbersWithKSetBits);
    }
}