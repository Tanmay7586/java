package oops;

public class Demo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(1, 2);
        System.out.println(r1);
    }
}


class Calculator {
    int num;   //this is instance variable
    public int add(int num1, int num2) {    // int num1, int num2 is local variable
        return num1 + num2;
    }
}