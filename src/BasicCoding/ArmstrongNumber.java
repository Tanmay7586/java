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
        int digits = 0;
        int temp = num; // Store the original number to count digits

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num; // Reset num to original value for digit processing

        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            result += Math.pow(digit, digits); // Add the power of the digit
            temp /= 10; // Remove the last digit
        }

        return result == originalNumber; // Check if the result equals the original number
    }
}
