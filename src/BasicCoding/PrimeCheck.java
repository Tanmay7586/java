package BasicCoding;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime ");
        } else {
            System.out.println((num + "is not a prime"));
        }
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}





































