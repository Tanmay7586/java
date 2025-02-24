package BasicCoding;

public class SwapThreeNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a + " " + b + " " + c);
        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
        System.out.println(a + " " + b + " " + c);

    }
}
