package Strings;

import java.util.Scanner;

public class _06RunningNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(addRunningNumbers(str));
    }

    static String addRunningNumbers(String str) {
        int count = 1;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += count;
            count++;
        }


        return result;
    }
}