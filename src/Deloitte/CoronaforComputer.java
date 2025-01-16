package Deloitte;

import java.util.Scanner;

public class CoronaforComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int spikes = sc.nextInt();

        for (int i : arr) {
            System.out.println(i >> spikes);
        }
    }
}
