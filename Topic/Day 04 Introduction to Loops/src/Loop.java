// ************  32. check if the  number id prime or not

import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        boolean isPrime = true;

        if( n <= 1){
            System.out.println("  this is a Not  prime number");
        }else{
            for (int i = 2; i <= n; i++) {
                if(n % i == 0){
                    isPrime  = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("  This is a Prime Number");
        }else{
            System.out.println("  This is NOT a Prime Number");
        }



    }
}


//// ************  31. print the sum of all factors of a number (Ex. 50 -> 1+2+5+10+25 = 43)
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                System.out.println(i + " ");
//            }
//            System.out.print(n);
//        }
//    }
//}





//// ************  30. print   all the factors of a number;
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
//
//        for (int i  = 1; i <= n; i++) {
//            if ( n % i == 0) {
//                System.out.println(i + " ");
//            }
//            System.out.print(n);
//        }
//    }
//}



//// ************  29.  print number of all even & odd number in a range separately;
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
////        int even = 0;
////        int odd = 0;
//
//        System.out.println("Even Numbers:");
//        for (int i  = 1; i <= n ; i++) {
//            if (i  % 2 == 0) {
//                System.out.println(i);
//
//            }
//        }
//
//        System.out.println("Odd Numbers:");
//        for (int i  = 1; i <= n ; i++){
//            if(i % 2 != 0){
//                System.out.println(i);
//            }
//        }
//    }
//}
//
//



// ************  28.  Factorial of a number;
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
//        int fac = 1;
//
//        for(int i = 1; i <= n ;i++){
//            fac *= i;
//        }
//        System.out.println(fac);
//
//    }
//
//}


// ************  27.  sum up to n  terms.

//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for(int i = 1; i <= n ;i++){
//            sum =  sum + i;
//        }
//        System.out.println(sum);
//
//    }
//
//}



//// ************  26. Take  a  number  as input and  print its table ( ex 5*1 = 5 ... up to 10 ;)
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
//
//        for(int i = 1; i <= 10 ;i++){
//            int a = (i * n);
//            System.out.println(a);
//        }
//
//    }
//
//
//}


//// ************  25. Reverse for Loop. print n to 1;
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
//
//        for(int i = n; i >= 1 ;i--){
//            System.out.println(i);
//        }
//
//    }
//
//
//}


//// ***************  24. Print natural Number up to n
//
//import java.util.Scanner;
//public class Loop {
//    public static void main(String[] args){
//
//        Scanner sc  = new Scanner (System.in);
//
//        int n = sc.nextInt();
//
//        for(int i = 1; i <= n ;i++){
//            System.out.println(i);
//        }
//
//    }
//
//
//}
