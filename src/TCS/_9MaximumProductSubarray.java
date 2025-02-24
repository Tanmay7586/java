package TCS;

import java.util.*;

public class _9MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxProductSubarray(arr));
    }

    public static int maxProductSubarray(int[] arr) {
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= arr[i];
            rightProduct *= arr[i];
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }
}
