package Arrays;

import java.util.HashSet;

public class _4CommonElementInTwoArrays {
    public static void main(String[] args) {
        int[] a1 = {8, 15, 6, 21, 25, 20};
        int[] a2 = {3, 8, 9, 15, 21};

        HashSet<Integer> hs = new HashSet<>();
        for (int num : a1) {
            hs.add(num);
        }

        for (int num : a2) {
            if (hs.contains(num)) {
            System.out.println(num);
                hs.remove(num);
            }


        }

//        for (int i = 0; i < a1.length; i++) {
//            for (int j = 0; j < a2.length; j++) {
//                if(a1[i]==a2[j]){
//                    System.out.println(a1[i]);
//                }
//            }
//        }
    }
}
