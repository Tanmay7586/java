package BitManipulation;

public class _02DecimalToBinary {
    public static void main(String[] args) {
        int decimalNum = 42;
        StringBuilder sb = new StringBuilder();
        while (decimalNum > 0) {
            sb.append(decimalNum % 2);
            decimalNum /= 2;
        }
        sb.reverse();
        System.out.println(sb);
    }
}
