package BasicCoding;

public class SwappNumberWithout3rdVariable {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println(a + " " +b);
    }
}
