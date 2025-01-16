package Deloitte;

import java.util.*;

public class TotalMomentum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalMomentum = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int v = sc.nextInt();
            totalMomentum += (m * v);
        }
        System.out.print(totalMomentum);
    }
}
