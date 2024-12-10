package BasicCoding;

import java.util.Scanner;

public class LiftManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize the positions of both lifts (both start at the ground floor)
        int liftA = 0; // Ground floor
        int liftB = 0; // Ground floor

        while (true) {
            System.out.println("\nEnter the lift to move (A or B) and the destination floor (0-9): ");
            char lift = sc.next().charAt(0);
            int floor = sc.nextInt();

            if (floor < 0 || floor > 9) {
                System.out.println("Invalid floor. Please enter a floor between 0 and 9.");
                continue;
            }

            if (lift == 'A' || lift == 'a') {
                if (liftA == 0) { // If Lift A is at the ground floor
                    System.out.println("Lift A is moving to floor " + floor);
                    liftA = floor;

                    if (liftB != 0) {
                        liftB = 0; // Ensure Lift B moves to ground floor
                        System.out.println("Lift B is now at the ground floor.");
                    }
                } else {
                    System.out.println("Lift A cannot leave, as Lift B is not at the ground floor.");
                }
            } else if (lift == 'B' || lift == 'b') {
                if (liftB == 0) { // If Lift B is at the ground floor
                    System.out.println("Lift B is moving to floor " + floor);
                    liftB = floor;

                    if (liftA != 0) {
                        liftA = 0; // Ensure Lift A moves to ground floor
                        System.out.println("Lift A is now at the ground floor.");
                    }
                } else {
                    System.out.println("Lift B cannot leave, as Lift A is not at the ground floor.");
                }
            } else {
                System.out.println("Invalid input. Please enter 'A' or 'B' for the lift.");
            }

            // Display the current positions of the lifts
            System.out.println("Current position of Lift A: Floor " + liftA);
            System.out.println("Current position of Lift B: Floor " + liftB);
        }
    }
}
