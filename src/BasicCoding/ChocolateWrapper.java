package BasicCoding;

import java.util.Scanner;

public class ChocolateWrapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input money, price per chocolate, and wrappers needed for a free chocolate
        System.out.println("Enter the amount of money you have:");
        int money = sc.nextInt();

        System.out.println("Enter the price of each chocolate:");
        int price = sc.nextInt();

        System.out.println("Enter the number of wrappers needed for a free chocolate:");
        int wrappersNeeded = sc.nextInt();

        // Calculate initial chocolates bought
        int chocolates = money / price;
        int wrappers = chocolates;

        // Calculate additional chocolates using wrappers
        while (wrappers >= wrappersNeeded) {
            int freeChocolates = wrappers / wrappersNeeded; // Free chocolates from wrappers
            chocolates += freeChocolates; // Add free chocolates to total
            wrappers = wrappers % wrappersNeeded + freeChocolates; // Update wrappers (leftover + new ones)
        }

        // Output the total chocolates
        System.out.println("Total chocolates you can get: " + chocolates);

        sc.close();
    }
}

