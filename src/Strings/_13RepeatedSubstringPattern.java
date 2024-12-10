package Strings;

import java.util.Scanner;

public class _13RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstring("abcabcabcabc"));
    }

    static boolean repeatedSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            String subsrting = str.substring(0, i + 1);
            if (str.length() % subsrting.length() == 0) {
                int noOfRepetiton = str.length() / subsrting.length();
                StringBuilder newStr = new StringBuilder();
                while (noOfRepetiton > 0) {
                    newStr.append(subsrting);
                    noOfRepetiton--;
                }
                if (newStr.toString().equals(str)) return true;
            }
        }
        return false;
    }
}
