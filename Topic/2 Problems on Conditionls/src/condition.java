

// Discount program    shop Discount / payable
import java.util.Scanner;

public class condition {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        String in = sc.nextLine();
        String  dis = " " ;

        if(amount >= 0 && amount <= 2.0) dis = "Flop";
        else if(amount >= 2.1 && amount <= 3.4) dis = "semni-hit" ;
        else if(amount >= 3.5 && amount <= 4.5) dis = "hit";
        else if(amount >= 4.6 && amount <= 5.0) dis = "Super Hit";
       else dis = "Super super Hit";

       System.out.println("name"+in);
       System.out.println(dis);
    }
}


//
// Discount program    shop Discount / payable
//import java.util.Scanner;
//
//public class condition {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        int amount = sc.nextInt();
//        int dis = 0 ;
//
//        if(amount >= 0 && amount <= 5000) dis = 0;
//            else if(amount >= 5000 && amount <= 70000) dis = 5;
//                else if(amount >= 70000 && amount <= 90000) dis =10;
//                    else dis = 20;
//
//
//        System.out.println( amount - (dis * amount)/100);
//
//}
//}


        //  normal  code
//        Scanner sc = new Scanner(System.in);
//        int amount = sc.nextInt();
//
//        if(amount >= 0 && amount <= 5000){
//
//            System.out.println( amount - (0 * amount)/100);
//
//        }else if(amount >= 5000 && amount <= 70000){
//            System.out.println( amount - (5 * amount)/100);
//        }else if(amount >= 70000 && amount <= 90000){
//            System.out.println( amount - (10 * amount)/100);
//        }else if(amount >= 90000){
//            System.out.println( amount - (20 * amount)/100);
//        }












