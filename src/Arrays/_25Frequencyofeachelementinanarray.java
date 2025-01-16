package Arrays;

import java.util.HashMap;
import java.util.Map;

public class _25Frequencyofeachelementinanarray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 20, 10, 10};
        countFreq(arr);
        System.out.println("-----------------------------------");
        countFreqUsingHashMap(arr);
    }

    private static void countFreqUsingHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void countFreq(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i] == true) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }

    }
}