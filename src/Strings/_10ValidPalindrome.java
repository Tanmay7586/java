package Strings;

public class _10ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }

    static boolean isPalindrome(String str) {
        // Convert the string to lowercase
        str = str.toLowerCase();

        // Manually remove non-alphanumeric characters
        String newStr = "";
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                newStr += ch;
            }
        }

        // Check if the new string is a palindrome
        int i = 0;
        int j = newStr.length() - 1;
        while (i < j) {
            if (newStr.charAt(i) != newStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
