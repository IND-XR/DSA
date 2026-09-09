













//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int factoar = 1;
//        int digi = 5;
//
//        for(int i = 1; i<=digi ;i++){
//            factoar = factoar * i;
//        }
//
//        System.out.println(factoar);
//
//    }
//}



//// 38  i want  a
//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int square = n * n ;
//
//        if(n < 10){
//            if(square % 10 == n){
//                System.out.println("Automophic");
//            }else {
//                System.out.println("Automophic");
//            }
//        }else{
//            if(square % 100 == n){
//                System.out.println("Automophic");
//            }else  {
//                System.out.println("Automophic");
//            }
//        }
//    }
//}


// one  more option

//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int copy = n;
//        int count = 0;
//        int a = 0;
//        int b = 0;
//        int s = 0;
//
//        while(n>0){
//            a = n % 10;
//            b = a;
//            n = n / 10;
//
//            s = s + b;
//            System.out.println(b);
//            System.out.println(s);
//
//        }

//        int sq  = copy*copy;
//
//        if ( sq % (int)Math.pow(10,count)== copy){
//            System.out.println("automorphic number");
//        }else{
//            System.out.println("not automorphic number");
//        }

//    }
//}




//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int copy = n;
//        int count = 0;
//
//        while(n>0){
//            count++;
//            n = n / 10;
//        }
//
//        int sq  = copy*copy;
//
//        if ( sq % (int)Math.pow(10,count)== copy){
//            System.out.println("automorphic number");
//        }else{
//            System.out.println("not automorphic number");
//        }
//
//    }
//}

















// // 37 accept a number and check  if it is a pallindromic number ( if number  and its reverse are equal)
//
//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int rev = n;
//        int sum = 0;
//        int stor = 0;
//
//        while (n > 0) {
//            sum = n % 10;
//            stor = stor * 10+sum;
//            n/=10;
//
//            System.out.print(sum);
//        }
//        if(rev == stor){
//            System.out.println("pallindrome");
//        }else{
//            System.out.println("not pallindrome");
//        }
//    }
//}


//

//// 37 accept a number and check  if it is a pallindromic number ( id number  and its reverse are  qeual)
//
//
//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int rev = n;
//        int sum = 0;
//        int stor = 0;
//
//        while (n > 0) {
//            sum = n % 10;
//            stor = stor * 10+sum;
//            n/=10;
//
//            System.out.print(sum);
//        }
//        if(rev == stor){
//            System.out.println("pallindrome");
//        }else{
//            System.out.println("not pallindrome");
//        }
//    }
//}


//        while (n > 0) {
//            sum = n % 10;
//             rev = (rev * 10)+sum;
//            n= n / 10;
//        }

// 36  Accept a number and  print  its reversc

//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int dig = 0;
//
//        while(n > 0){
//            dig  = n % 10;
//            n = n /10;
//
//            System.out.print(dig);
//        }
//    }
//}


// ************ 34  Seprate each digit of a number and print it on the new line  ex 123

//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int sum = 0;
//
//        while (n > 0) {
//            sum = n % 10;
//            n /= 10;
//
//            System.out.print(sum);
//        }
//
////       while(n>0){
////           System.out.print(n%10);
////           n = n /10;
////       }
//
//    }
//}
//













// ********  sum of digits of a number 936 = 18
//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int sum = 0;
//        int dig = 0 ;
//
//        while(n>0){
//            dig = n % 10;  1
//            sum = sum + dig; yv dc c
//            n = n/10;
//          }
//        System.out.println(sum);
//    }
//    }



//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int i =  10;
//
//        do{
//            System.out.println(i);
//            i++;
//        }while(i <= 11);
//
//        }
//    }


//import java.util.Scanner;
//
//public class Looop {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int i = sc.nextInt();
//
//        while(i < 10){
//            System.out.println(i);
//            i++;
//        }
//
//        }
//    }
