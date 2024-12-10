package Strings;

import java.util.Scanner;

public class _01StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("tanmay"));
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char left = str.charAt(i);
            char right = str.charAt(j);

            if (left != right) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

//
//import java.util.Scanner;
//
//public class _01StringPalindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        if (isPalindrome(str)) {
//            System.out.println(str + " is palindrome ");
//        } else {
//            System.out.println(str + " is not a palindrome");
//        }
//    }
//
//    public static boolean isPalindrome(String str) {
//        String og_str = str;
//        String rev_str = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev_str = rev_str + str.charAt(i);
//        }
//
//        return og_str.equals(rev_str);
//    }
//}
