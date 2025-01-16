package Strings;

public class _23StringtoInteger {
    public static void main(String[] args) {
        String s = "-1337c0d3";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if (s == null) return 0;
        s = s.trim();
        if (s.length() == 0) return 0;
        int sign = +1;
        long ans = 0;
        int i = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');

            if (sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * ans);
    }
}
