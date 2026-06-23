
import java.util.Scanner;

public class Conditionproblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        if( amount >= 500 ){
            int count = amount / 500;
            System.out.println("500 ek total : " + count + " note create kar sakte hai ");
            amount = amount - (count * 500);
            System.out.println( "remaining amount "+ amount);
        }
        if(amount >= 200){
            int count = amount / 200;
            System.out.println("200 ek total : " + count + " note create hai ");
            amount = amount - (count * 200);
            System.out.println("remaining amount "+ amount);
        }
        if(amount >= 100){
            int count = amount / 100;
            System.out.println("100 ek total : " + count + " note create hai ");
            amount = amount - (count * 100);
            System.out.println("remaining amount "+ amount);
        }
        if(amount >= 50){
            int count = amount / 50;
            System.out.println("50 ek total : " + count + " note create hai ");
            amount = amount - (count * 50);
            System.out.println("remaining amount "+ amount);
        }
        if(amount >= 10){
            int count = amount / 10;
            System.out.println("10 ek total : " + count + " note create hai ");
            amount = amount - (count * 10);
            System.out.println("remaining amount "+ amount);
        }if(amount >= 5){
            int count = amount / 5;
            System.out.println("50 ek total : " + count + " note create hai ");
            amount = amount - (count * 5);
            System.out.println("remaining amount "+ amount);
        }




    }
}





//  **********************************    optimize code
//import java.util.Scanner;
//
//public class Conditionproblem {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        double unit = sc.nextDouble();
//
//        int amount = 0 ;
//        if(unit > 400){
//            amount = (unit-400 )*13;
//            unit  = 400;
//        }
//        if(unit >200 &&  unit <= 400){
//            amount = amount + (unit - 200)*8;
//            unit = 200 ;
//        }
//        if(unit >100 &&  unit <= 200){
//            amount = amount + (unit - 100)*8;
//            unit = 100 ;
//        }
//        amount = amount + (unit*4.2);
//        System.out.println(amount);
//    }
//}


//  ************************************************      my given  my sir
//import java.util.Scanner;
//
//public class Conditionproblem {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int unit = sc.nextInt();
//
//        if( unit >= 0 && unit <= 100 ){
//            System.out.print(unit * 4.2);
//
//        }else if(unit >= 101 && unit <= 200){
//             System.out.println((100*4.2)+(unit-100)*6);
//
//        }else if(unit >= 201 && unit <= 400) {
//            System.out.println((100*4.2)+(100*6)+(unit-200)*8);
//        }else {
//            System.out.println((100*4.2)+(100*6)+ (200*8)+(unit-400)*13);
//        }
//    }
//}




// **************************************************  my  own  code  but  note working
//import java.util.Scanner;
//
//public class Conditionproblem {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int unit = sc.nextInt();
//        double s = 0;
//        float c = 0;
//        float a = 0;
//        float b = 0;
//        float d = 0;
//
//        if( unit >= 0 && unit <= 100 ){
//            s = ( unit * 4.2 );
//            System.out.print(s);
//
//        }else if(unit >= 101 && unit <= 200){
//            c = (unit - 100 ) ; // 160
//            a = ( c * 6);
//            s = a + c ;
//            System.out.println(s);
//
//        }else if(unit >= 201 && unit <= 400) {
//            c = (unit - 100); // 360
//            b = (c - 100);  //160
//            a = (b * 8);
//
//            s = c + a + b;
//            System.out.println(s);
//        }
//    }
//}
