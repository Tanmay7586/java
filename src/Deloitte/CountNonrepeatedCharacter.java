package Deloitte;

import java.util.*;

public class CountNonrepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print((countNonrepeatedCharacter(str)));
    }

    public static int countNonrepeatedCharacter(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int nonRepeated = 0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == ch) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                nonRepeated++;
            }
        }
        return nonRepeated;
    }
}
