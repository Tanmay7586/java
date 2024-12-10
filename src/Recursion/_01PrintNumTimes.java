package Recursion;

public class _01PrintNumTimes {
    public static void main(String[] args) {
        int n = 5;
        printN(1, n);
    }

    static void printN(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        printN(++i, n);
    }
}
