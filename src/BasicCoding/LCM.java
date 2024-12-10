package BasicCoding;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int hcf = findHcf(num1, num2);
        System.out.println("hcf is" + hcf);

        int lcm = (num1*num2)/hcf;
        System.out.println("lcm is" + lcm);
    }

    public static int findHcf(int num1, int num2){
        int min;
        int hcf = 0;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }

        for (int i = min; i >= 1; i--) {
            if(num1%i==0 && num2%i==0){
                hcf =i;
                break;
            }
        }
        return hcf;
    }
}
