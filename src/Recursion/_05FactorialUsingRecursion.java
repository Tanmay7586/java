package Recursion;

import java.util.Scanner;

public class _05FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(fact(num));

    }

    static int fact(int num) {
        if (num == 1) {
            return num;
        }
        return num * fact(num - 1);
    }
}
