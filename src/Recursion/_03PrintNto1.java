package Recursion;

public class _03PrintNto1 {
    public static void main(String[] args) {
        int n = 5;
        printN(1, n);
    }

    static void printN(int i, int n) {
        if(i > n)  return;
        System.out.println(n);
        printN(i, n-1);
    }
}
