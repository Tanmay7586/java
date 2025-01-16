package Deloitte;

import java.util.Scanner;

public class ClassMonitorSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int cuts = 0;
        int currentRank = Integer.MAX_VALUE;
        for(int rank: arr){
            if(rank < currentRank){
                ++cuts;
                currentRank = rank;
            }
        }
        System.out.println(cuts-1);
    }
}
