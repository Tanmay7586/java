package Strings;

public class _17LargestOddNumberinString {
    public static void main(String[] args) {
        String s = "202";
        System.out.println(largestOddNumber(s));
    }

    public static String largestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            if (d % 2 != 0) {
                return s.substring(0, i + 1);
            }

        }
        return "";
    }
}
