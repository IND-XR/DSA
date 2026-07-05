
// 33 write a  program to take  two inputs a, b & find the value of a raised to the power of b;
//import java.util.Scanner;
//
//public class loopQS {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int a =  sc.nextInt();
//        int b =  sc.nextInt();
//
//        int power = (int)Math.pow(a,b);
//        System.out.print(power);

//        int result = 1;
//        for(int i = 1 ; i <= power ; i++){
//            result *=i;
//        }
//

//    }
//}

// ***************** IMP
import java.util.Scanner;

public class loopQS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        if(n <= 1){
            System.out.println(" frist is also not prime ");
        } else if( n == 2){
            System.out.println(" second  is also not prime");
        } else if(n % 2 == 0 ){
            System.out.println(" third  is also not prime");
        } else {
            boolean isPrime = true;
            for(int i = 3;i<=(int)Math.sqrt(n);i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println(" prime number");
            }else{
                System.out.println(" not prime ");
            }
        }
    }
}


//import java.util.Scanner;
//
//public class loop {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n =  sc.nextInt();
//
//        int count=0;
//        for(int i =1 ; i<=n; i++){
//            if(n % i == 0){
//                count++;
//            }
//        }
//        if(count == 2){   // check  factor  Kyun count == 2?
//            System.out.println("prime");
//        }else {
//            System.out.println("not prime");
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class loop {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n =  sc.nextInt();
//
//        int count=0;
//        for(int i =1 ; i<=n/2; i++){
//            if(n % i == 0){
//                count++;
//            }
//        }
//        if(count == 1){
//            System.out.println("prime");
//        }else {
//            System.out.println("not prime");
//        }
//    }
//}
