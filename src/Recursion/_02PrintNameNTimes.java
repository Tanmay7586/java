package Recursion;


public class _02PrintNameNTimes {
    public static void main(String[] args) {
        String name = "YourName"; // Replace with your name
        int times = 1000000; // Number of times to print the name

        printName(name, times);
    }

    // Recursive method to print the name
    public static void printName(String name, int count) {
        if (count <= 0) {
            return; // Base case: Stop recursion
        }

        System.out.println(name);
        printName(name, count - 1); // Recursive call
    }
}

