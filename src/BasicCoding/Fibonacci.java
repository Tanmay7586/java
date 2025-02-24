package BasicCoding;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first_num = 0;
        int sec_num = 1;
        System.out.print(first_num + " " + sec_num);
        int nextnum;

        for (int i = 3; i <= num; i++) {
            nextnum = first_num + sec_num;
            System.out.print(" "+nextnum + " ");
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
