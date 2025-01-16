package Arrays;

import java.util.HashSet;

public class _15LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 200, 2, 3, 4};

        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> a1 = new HashSet<>();
        int longest = 1;
        for (int i : arr) {
            a1.add(i);
        }

        if (arr.length == 0) {
            return 0;
        }

        for (int i : a1) {
            if (!a1.contains(i - 1)) {
                int count = 1;
                int ans = i;
                while (a1.contains(ans + 1)) {
                    ans++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;

//
//        int longest = 1;
//        for (int i = 0; i < arr.length; i++) {
//            a1.add(arr[i]);
//        }
//
//        for (int x : a1) {
//            if (!a1.contains(x - 1)) {
//                int count = 1;
//                int ans = x;
//                while (a1.contains(ans + 1)) {
//                    ans++;
//                    count++;
//                }
//                longest = Math.max(longest, count);
//            }
//        }
//        return longest;
    }
}
