package Recursion;

public class _06ReverseString {
    public static void main(String[] args) {
        String str = "Tanmay";
        System.out.print("reverse: " + reverse(str));
    }

    public static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
