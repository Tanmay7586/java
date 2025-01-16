package Strings;

import java.util.Scanner;

public class _14ReplaceVowelsConsonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                result.append('#'); // Replace vowels with #
            } else if (Character.isLetter(ch)) {
                result.append('!'); // Replace consonants with !
            } else {
                result.append(ch); // Keep non-alphabetic characters as they are
            }
        }

        System.out.println("Modified string: " + result.toString());
        sc.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }
}
