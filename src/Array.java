// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         for (int i = 0; i <size; i++) {
//             number[i] = sc.nextInt();
//         }

//         System.out.println("enter the number to find");
//         int numToFind = sc.nextInt();

//         for (int i = 0; i <size; i++) {
//             if(numToFind == number[i]){
//                 System.out.println("number found at index" + i);
//             }
//         }

//     }
// }

// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[] = new String[size];

//         //input
//         for(int i=0; i<size; i++) {
//             names[i] = sc.next();
//         }

//         //output
//          for(int i=0; i<names.length; i++) {
//              System.out.println("name " + (i+1) +" is : " + names[i]);
//          }

//     }
// }

// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         for (int i = 0; i <size; i++) {
//             number[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i <number.length; i++) {
//             if(number[i] < min){
//                 min = number[i];
//             }

//             if(number[i] > max){
//                 max = number[i];
//             }

//         }
//         System.out.println("min " +min);
//         System.out.println("max " +max);
//     }
// }

 import java.util.Scanner;

 public class Array {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int number[] = new int[size];

         for (int i = 0; i <size; i++) {
             number[i] = sc.nextInt();
         }

         boolean isAscending = true;

         for (int i = 0; i < number.length-1; i++) {
             if (number[i] > number[i+1]) {
                 isAscending = false;
             }
         }

         if(isAscending){
             System.out.println("asc");
         }else{
             System.out.println("not");
         }
     }
 }

// import java.util.Scanner;
//
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int number[][] = new int[row][col];
//
//         for (int i = 0; i <row; i++) {
//             for (int j = 0; j <col; j++) {
//                 number[i][j] = sc.nextInt();
//             }
//         }
//
//         int numToFind = sc.nextInt();
//
//         for (int i = 0; i <row; i++) {
//             for (int j = 0; j <col; j++) {
//                 if(number[i][j]==numToFind){
//                     System.out.println("number find at (" +i+","+j+")");
//                 }
//             }
//         }
//
//     }
//
// }

// import java.util.Scanner;
//
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int number[][] = new int[row][col];
//
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 number[i][j] = sc.nextInt();
//             }
//         }
//
//         System.out.println("Transpose");
//         for (int j = 0; j < col; j++) {
//             for (int i = 0; i < row; i++) {
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }
//
//     }
//
// }

//import java.util.Scanner;
//
//public class Array {
//    public static void main(String[] args) {
//        int[] nums = {1,2,1};
//        int n = nums.length;
//        int[] ans = new int[2*n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = nums[i];
//            ans[i+n] = nums[i];
//        }
//return ans;
//}
//
//}