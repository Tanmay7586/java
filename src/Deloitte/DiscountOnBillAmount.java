package Deloitte;

import java.util.Scanner;

public class DiscountOnBillAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int sum = 0;
        while (amount > 0) {
            int lastDigit = amount % 10;
            if (lastDigit % 2 == 1) {
                sum += lastDigit;
            }
            amount = amount / 10;
        }
        System.out.println(sum);
    }
}
