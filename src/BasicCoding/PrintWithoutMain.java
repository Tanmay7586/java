package BasicCoding;

public class PrintWithoutMain {
    static {
        System.out.println("Hello, this is printed before main method execution!");
    }

    public static void main(String[] args) {
        // This ensures JVM doesn't complain about the missing main method
    }
}
