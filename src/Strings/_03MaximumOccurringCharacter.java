package Strings;

import java.util.Scanner;

public class _03MaximumOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(highestOccuringChar(str));
    }

    static char highestOccuringChar(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] += 1;
        }
        int max = -1;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        return c;
    }
}
