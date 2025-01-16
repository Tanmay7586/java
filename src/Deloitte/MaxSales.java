package Deloitte;

import java.util.Scanner;

public class MaxSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int product = sc.nextInt();
        int[][] salesRecord = new int[days][product];
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < product; j++) {
                salesRecord[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < days; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < product; j++) {
                if (salesRecord[i][j] > max) {
                    max = salesRecord[i][j];
                }
            }
            System.out.println(max + " ");
        }
    }
}
