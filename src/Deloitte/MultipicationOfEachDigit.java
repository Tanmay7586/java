package Deloitte;

import java.util.Scanner;

public class MultipicationOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mult = 1;
        while (num != 0) {
           int rem = num %10;
            mult *= rem;
            num /= 10;
        }
        System.out.println(mult);
    }
}
