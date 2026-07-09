// ************ 34  Seprate each digit of a number and print it on the new line  ex 123

import java.util.Scanner;

public class Looop {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

       while(n>0){
           System.out.println(n%10);
           n = n /10;
       }

    }
}















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
//        while(n>0) {
//            int digi = n % 10;
//            sum = sum + digi;
//
//            n = n / 10;
//        }
//            System.out.println(sum);
//
//        }
//    }
//
