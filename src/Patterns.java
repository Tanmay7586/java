// import java.util.*;

// public class Patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int c = sc.nextInt();
//         int r = sc.nextInt();
//         for (int i = 1; i <=r; i++) {
//             for (int j = 1; j <=c; j++) {
//             System.out.print("*");
//             }
//         System.out.println("");
//         }
//         }
//         }        

// *****
// *****
// *****
// *****

// import java.util.*;

// public class Patterns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int c = sc.nextInt();
//         int r = sc.nextInt();
//         for (int i = 1; i <=r; i++) {
//             for (int j = 1; j <=c; j++) {
//             if(i==1 || i==r || j==1 || j ==c){
//                 System.out.print("*");
//             }else{
//                 System.out.print(" ");
//             }
//             }
//         System.out.println("");
//         }
//         }
//         }  

// *****
// *   *
// *   *
// *   *
// *   *
// *   *
// *****
//
// import java.util.*;
//
// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j =1; j <= r+1-i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }
// ****
// ***
// **
// *
//
// import java.util.*;
//
// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <=n; i++) {
//             for (int j = 1; j <=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

//    *
//   **
//  ***
// ****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <=n; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
// }

// 1
// 12
// 123
// 1234
// 12345

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = n; i >=1; i--) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println("");
//         }
//     }
// }

// 12345
// 1234
// 123
// 12
// 1

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println("");
//         }
//     }
// }

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=i; j++) {
//                 int sum = i + j;
//                 if(sum%2==0){
//                     System.out.print("1");
//                 }else{System.out.print("0");}
//                 System.out.print(" ");
//             }
//             System.out.println("");
//         }
//     }
// }

// 1  
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//           int spaces = n-i;
//           for (int j = 1; j <=spaces; j++) {
//             System.out.print(" ");
//           }
//           for (int j = 1; j <=n; j++) {
//             System.out.print("*");
//           }
//           System.out.println("");
//         }
//     }
// }

//     *****
//    *****
//   *****
//  *****
// *****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5 

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j>=1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <=i;  j++) {
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }

//     1 
//    212
//   32123
//  4321234
// 543212345

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (2 * i) - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//         *    
//        ***   
//       *****  
//      ******* 
//     *********
//     *********
//      *******
//       *****
//        ***
//         *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = n-1; i >= 1; i--) {
//             for (int j = 1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = n-i; j >=1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//     *
//    **
//   ***
//  ****
// *****

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = n - i; j >= 1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = n-1; i >=1; i--) {
//             for (int j = n - i; j >= 1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//        * 
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *

//    import java.util.*;

//    public class Patterns {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            for (int i = 1; i <= n; i++) {
//             for (int j = n-i; j>=1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >=1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <=i; j++) {
//              System.out.print(j);   
//             }
//             System.out.println();
//            }
//            for (int i = n-1; i >=1; i--) {
//             for (int j = n-i; j>=1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >=1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <=i; j++) {
//              System.out.print(j);   
//             }
//             System.out.println();
//            }

//        }
//    }      

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int size = 2 * n - 1;

//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 // Calculate the value based on the row (i) and column (j)
//                 int value = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
//                 System.out.print(value + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             int space  = 2*(n-i);
//             for (int j = 1; j <=space; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         for (int i = n; i>=1; i--) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             int space  = 2*(n-i);
//             for (int j = 1; j <=space; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");   
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");   
//                 }else{
//                     System.out.print(" ");
//                 }            }
//             System.out.println();
//         }
//         for (int i = n; i >=1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");   
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 if (j==1 || j==i) {
//                     System.out.print("*");   
//                 }else{
//                     System.out.print(" ");
//                 }            }
//             System.out.println();
//         }
//     }
// }

// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * *
// **      **
// *        *

//import java.util.*;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == 5) {
//                    System.out.print("*");
//                } else {
//                    if (j == 1 || j == n) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//---------------------------------------------REVESION--------------------------------------------------


//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        for (int i = 1; i <=row ; i++) {
//            for (int j = 1; j <= col ; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= col; j++) {
//                    if(i==1 || i==row || j==1 || j==col ){
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//            }
//            System.out.println("");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for (int i = row; i >= 1  ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for (int i=1; i<=row; i++){
//            for (int j = 1; j <=row-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}



//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Patterns {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        for (int i = row; i >= 1  ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}