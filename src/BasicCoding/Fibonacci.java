package BasicCoding;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first_num = 0;
        int sec_num = 1;
        int nextnum;

        for (int i = 1; i <= num; i++) {
            System.out.println(first_num);
            nextnum = first_num + sec_num;
            first_num = sec_num;
            sec_num = nextnum;
        }
    }
}

//
//public class Fibonacci{
//    public static void main(String[] args) {
//        System.out.println(fib(3));
//    }
//    static int fib(int n){
//        if(n<=1) return n;
//        return fib(n-1)+fib(n-2);
//    }
//}
