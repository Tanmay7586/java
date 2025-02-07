package Strings;

import java.util.Scanner;

public class _05CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] result = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    static int[] countVowelsAndConsonants(String str) {
        int countVowels = 0;
        int countConsonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowels++;
            } else {
                countConsonants++;
            }
        }
        return new int[]{countVowels, countConsonants};
    }
}
