package Arrays;

import java.util.Arrays;

public class _6RemoveDuplicateCharsFromArray {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A", "C", "B", "A", "D"};

        Arrays.sort(arr);

        String[] temp = new String[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (!arr[i].equals(arr[i + 1])) {
                temp[j] = arr[i];
                j++;
            }
        }

        temp[j++] = arr[arr.length - 1];

        String[] removedDuplicateString = Arrays.copyOf(temp, j);

        System.out.println(Arrays.toString(removedDuplicateString));

    }
}
