package BasicCoding;

import java.util.Scanner;

//
//public class PalindromeCheck {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (isPalindrome(num)) {
//            System.out.println(num + "is palindrome");
//        } else {
//            System.out.println(num + "is not plaindrome");
//        }
//    }
//
//    public static boolean isPalindrome(int num) {
//        if (num < 0) {
//            return false;
//        }
//        int og_num = num;
//        int rev_num = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            rev_num = rev_num * 10 + digit;
//            num = num / 10;
//        }
//
//        return og_num == rev_num;
//    }
//}
//
//


public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        int ognum = num;
        int newnum = 0;

        while (ognum > 0) {
            int temp = ognum % 10;
            newnum = newnum * 10 + temp;
            ognum /= 10;
        }
        return num == newnum;
    }
}