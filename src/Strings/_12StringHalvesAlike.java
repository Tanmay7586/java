package Strings;

public class _12StringHalvesAlike {
    public static void main(String[] args) {
        System.out.println(areHalvesAlike("book")); // true
        System.out.println(areHalvesAlike("textbook")); // false
    }

    public static boolean areHalvesAlike(String s) {
        int mid = s.length() / 2;

        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);

        return countVowels(firstHalf) == countVowels(secondHalf);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
