package Strings;

public class _09CheckPangram {
    public static void main(String[] args) {
        System.out.println(isPanagram("The  brown fox jumps over the lazy dog"));
    }

    static boolean isPanagram(String str) {
        boolean[] result = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                ch = Character.toUpperCase(ch);
                int index = ch - 'A';
                result[index] = true;
            }
        }
        for (boolean x : result) {
            if (x == false) {
                return false;
            }
        }
        return true;
    }
}
