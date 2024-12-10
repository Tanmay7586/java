package Strings;

public class _18ReverseWordsInString {
    public static void main(String[] args) {
        String sentence = "The  quick brown  fox";
        System.out.println(reversedString(sentence));
    }

    static String reversedString(String str) {
        String[] words = str.split("\\s+");

        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        return reverseString.toString();
    }
}
