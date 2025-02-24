package TCS;

import java.util.*;

public class _11SortElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        sortByFrequency(arr);
    }

    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        list.sort((a, b) -> {
                    int freqCompare = map.get(b) - map.get(a);
                    return freqCompare;
                }
        );

        for (int num : list) {
            System.out.print(num + " ");
        }

    }
}
