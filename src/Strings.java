//import java.util.Scanner;
//
//public class Strings {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String[] arr = new String[size];
//
//        int length = 0;
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.next();
//            length += arr[i].length();
//        }
//        System.out.println(length);
//    }
//}


// import java.util.Scanner;
//
// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String string = sc.next();
//         String result = "";
//
//         for (int i = 0; i < string.length(); i++) {
//             if(string.charAt(i) == 'e'){
//                 result += "i";
//             }else{
//                 result += string.charAt(i);
//             }
//         }
//
//         System.out.println(result);
//     }
// }

// import java.util.Scanner;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String string = sc.next();

//         String username = "";

//         for (int i = 0; i < string.length(); i++) {
//             if(string.charAt(i) == '@'){
//                 break;
//             }else{
//                 username += string.charAt(i);
//             }
//         }
//         System.out.println(username);
//     }
// }

//import java.util.Scanner;
//
//public class Strings {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder("hello");
//
//        for (int i = 0; i < str.length()/2; i++) {
//            int front = i;
//            int back = str.length()-1-i;
//
//            char frontChar = str.charAt(front);
//            char backChar = str.charAt(back);
//
//            str.setCharAt(front, backChar);
//            str.setCharAt(back, frontChar);
//        }
//
//        System.out.println(str);
//       }
//}


// -------------------------------------------------REVISION---------------------------------------------

//import java.util.Scanner;
//
//public class Strings {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String str[] = new String[num];
//        int length = 0 ;
//        for (int i = 0; i < num; i++) {
//            str[i] = sc.next();
//            length+= str[i].length();
//        }
//        System.out.println(length);
//    }
//}


import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == i) {
                result += "e";
            } else {
                result += str.charAt(i);
            }
        }
        System.out.print(result);
    }
}
