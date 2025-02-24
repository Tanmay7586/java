package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class _3Frequencyofeachelementinanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countFreqUsingHashMap(arr);
    }

    private static void countFreqUsingHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            System.out.println(i + ":" + map.get(i));
        }
    }

}