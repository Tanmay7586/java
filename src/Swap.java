import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Arrays.toString(swap(num1, num2)));

    }

    private static int[] swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        int[] result = {num1, num2};
        return result;
    }
}
