package TCS;

import java.util.*;

public class _10ReplaceElementsByItsRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rankedArr = replaceByItsRank(arr);
        System.out.print(Arrays.toString(rankedArr));
    }

    public static int[] replaceByItsRank(int[] arr) {
        int n = arr.length;
        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);

        HashMap<Integer, Integer> hm = new HashMap<>();
        int rank = 1;
        for (int num : copyArr) {
            if (!hm.containsKey(num)) {
                hm.put(num, rank++);
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = hm.get(arr[i]);
        }
        return result;
    }
}
