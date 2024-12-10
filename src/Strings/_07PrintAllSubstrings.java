package Strings;

public class _07PrintAllSubstrings {
    public static void main(String[] args) {
//        showSubstirngs1("abc");
        showSubstirngs2("abc");
    }

    static void showSubstirngs1(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.println(str.substring(i, j + 1));
            }
        }
    }

    static void showSubstirngs2(String str) {
        for (int i = 0; i < str.length(); i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = i; j < str.length(); j++) {
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }
    }
}
