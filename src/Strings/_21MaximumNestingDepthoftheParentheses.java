package Strings;

import java.util.Map;

public class _21MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int maxOpen = 0;
        int countOpen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                countOpen++;
            } else if (s.charAt(i) == ')') {
                countOpen--;
            }
            maxOpen = Math.max(maxOpen, countOpen);
        }
        return maxOpen;
    }
}

