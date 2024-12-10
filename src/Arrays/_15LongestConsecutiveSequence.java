package Arrays;

import java.util.HashSet;

public class _15LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};

        HashSet<Integer> a1 = new HashSet<>();

        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            a1.add(arr[i]);
        }

        for (int x : a1) {
            if (!a1.contains(x - 1)) {
                int count = 1;
                int ans = x;
                while (a1.contains(ans + 1)) {
                    ans++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}
