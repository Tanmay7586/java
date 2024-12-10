package Arrays;

import java.util.ArrayList;

public class _13NoOfOddAndEven {
    public static void main(String[] args) {
        int[] arr = {8, 5, 10, 12, 3, 1, 4};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                al1.add(arr[i]);
                evenCount++;
            } else {
                al2.add(arr[i]);
                oddCount++;
            }
        }

        System.out.println(evenCount);
        System.out.println(oddCount);

//        for (int x : al1) {
//            System.out.println("even no" + x);
//        }
//
//        for (int x : al2) {
//            System.out.println("odd no" + x);
//        }
    }
}
