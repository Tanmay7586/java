package Strings;

public class _20RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "caeab";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String ans = s + s;
        if (ans.contains(goal)) {
            return true;
        }
        return false;
    }
}
