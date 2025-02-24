package BasicCoding;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int ans = 0;
        int digitCount = 0;
        while (originalNum != 0) {
            originalNum /= 10;
            digitCount++;
        }
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            ans += Math.pow(digit, digitCount);
            temp /= 10;
        }
        return ans == num;
    }
}
