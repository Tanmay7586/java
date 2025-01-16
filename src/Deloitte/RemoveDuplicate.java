package Deloitte;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        int[] result = removeDuplicate(num);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    public static int[] removeDuplicate(int[] num) {
        List<Integer> result = new ArrayList<>();
        for (int value : num) {
            if (!result.contains(value)) {
                result.add(value);
            }
        }
        int[] uniqueArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArray[i] = result.get(i);
        }
        return uniqueArray;
    }
}
