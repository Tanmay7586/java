package BitManipulation;

public class _01BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "111";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(binary.length() - 1 - i) - '0';
            decimal += (int) (bit * Math.pow(2, i));
        }
        System.out.println(decimal);
    }
}
