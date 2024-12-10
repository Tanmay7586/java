package Strings;

import java.util.Scanner;

public class _02StringLapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int mid = len/2;

        String firstHalf = str.substring(0, mid);
        String secondHalf = str.substring(len - mid);

        String reverseSecondHalf = new StringBuilder(secondHalf).reverse().toString();

        if(firstHalf.equals(reverseSecondHalf)){
            System.out.println("lapindrome");
        }else{
            System.out.println("not");
        }
    }
}
