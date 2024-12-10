package BasicCoding;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year from user
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        // Check leap year conditions
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Leap year if divisible by 400
            } else {
                return true; // Leap year if divisible by 4 but not by 100
            }
        }
        return false; // Not a leap year
    }
}
