package Strings;


import java.util.Scanner;
import java.util.Stack;

public class _16RemoveOutermostParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        System.out.println(removeOuterParentheses(ch));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (st.size() > 0) {
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if (st.size() > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

}