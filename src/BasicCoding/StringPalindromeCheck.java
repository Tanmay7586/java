package BasicCoding;

import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome ");
        } else {
            System.out.println(str + " is not a plaindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String og_str = str;
        String rev_str = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev_str = rev_str + str.charAt(i);
        }

        return og_str.equals(rev_str);
    }
}
