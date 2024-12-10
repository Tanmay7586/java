package Strings;

import java.util.Scanner;

public class _05CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countVowels(str));
    }

    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
