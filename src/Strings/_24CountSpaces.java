package Strings;

import java.util.Scanner;

public class _24CountSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int spaces = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println(spaces);
    }
}
