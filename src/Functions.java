import java.util.*;

public class Functions {
    public static int sumOfTwo(int num1, int num2) {
        System.out.println("Sum " + (num1 + num2));
        return 1;
    }

    public static void findFact(int num1) {
        int temp = 1;
        if(num1==0){
            System.out.println(0);;
        }else{
        for (int i = num1; i >=1; i--) {
            temp = temp*i;
        }
        System.out.println(temp);
    }
    }
    public static void isPrime(int num1) {
        if (num1==0 || num1==1) {
            System.out.println("nor prime");
        }else{
            for (int i = 2; i <Math.sqrt(num1); i++) {
                if(num1%i==0){
                    System.out.println("notprime");
                }else{
                    System.out.println("prime");
                }
            }
        }
    }

    public static void fibonacci(int num) {
        int firstnum = 0, secondnum = 1;
        int nextnum;
        for (int i = 1; i <=num; i++) {
            System.out.println(firstnum);
            nextnum= firstnum+secondnum;
            firstnum= secondnum;
            secondnum=nextnum;
        }
    }

    public static void gcdLcm(int num1,int num2) {
        int on1= num1;
        int on2= num2;
        while(num1%num2 !=0){
            int rem = num1%num2;
            num1=num2;
            num2=rem;
        }
        int gcd = num2;
        System.out.println("gcd" +gcd);
        int lcm = (on1*on2)/gcd;
        System.out.println("lcm" +lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // sumOfTwo(num1, num2);

        // findFact(num1);
        // isPrime(num1);
        // fibonacci(num);
        gcdLcm(num1,num2);
    }

}
