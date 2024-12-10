package BasicCoding;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(findFactorial(num));

    }

    public static int findFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        for (int i = num - 1; i >= 1; i--) {
            num = num * i;
        }
        return num;
    }

}
//package BasicCoding;
//
//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input number from user
//        System.out.print("Enter a number to calculate its factorial: ");
//        int number = scanner.nextInt();
//
//        if (number < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            int factorial = calculateFactorial(number); // Call recursive method
//            System.out.println("The factorial of " + number + " is: " + factorial);
//        }
//
//        scanner.close();
//    }
//
//    // Recursive method to calculate factorial
//    public static int calculateFactorial(int n) {
//        if (n == 0 || n == 1) { // Base case: factorial of 0 or 1 is 1
//            return 1;
//        }
//        return n * calculateFactorial(n - 1); // Recursive step
//    }
//}
//
//
