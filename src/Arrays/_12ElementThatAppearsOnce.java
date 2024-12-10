//used xor in this problem

package Arrays;

import java.util.Scanner;

public class _12ElementThatAppearsOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int unique = 0;
        for (int x : arr) {
            unique = unique ^ x;
        }
        System.out.println(unique);
    }
}
