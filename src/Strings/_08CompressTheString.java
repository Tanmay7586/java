package Strings;

public class _08CompressTheString {
    public static void main(String[] args) {
        compress("aaabbccdsa");
    }

    static void compress(String str) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int count = 0;
            while (i < str.length()) {
                if (ch == str.charAt(i)) {
                    i++;
                    count++;
                } else break;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
}