package BasicCoding;

import java.util.Arrays;
import java.util.Scanner;

public class AnagrmasCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("are anagrams");
        } else {
            System.out.println("are not anagrams");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort((arr1));
        Arrays.sort((arr2));

        return Arrays.equals(arr1, arr2);
    }
}

