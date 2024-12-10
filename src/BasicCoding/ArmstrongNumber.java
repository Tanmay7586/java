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
        int originalNumber = num;
        int result = 0;
        int digits = String.valueOf(num).length(); // Find the number of digits

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            result += Math.pow(digit, digits); // Add the power of the digit
            num /= 10; // Remove the last digit
        }

        return result == originalNumber; // Check if the result equals the original number
    }
}
