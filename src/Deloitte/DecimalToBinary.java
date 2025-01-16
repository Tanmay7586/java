package Deloitte;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int binaryNum = num % 2;
            sb.append(binaryNum);
            num /= 2;
        }
        System.out.println(sb.reverse());
    }
}
