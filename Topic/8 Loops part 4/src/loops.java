//*****




// 44 Project Guess Game
import java.util.Scanner;
import java.util.Random;
public class loops {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       Random random = new Random();

       int a ;
       int number;

       do{
           a  = sc.nextInt();

            number = random.nextInt(10)+1;
           if(a == number){
               System.out.println("your  guess was right "+number );
           }
       }while(true);
   }
}


//*****

//41  Make a choice based calculator using do while
//import java.util.Scanner;
//public class loops {
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        int first;
//        int second;
//
//        do{
//            System.out.print("Enter 1 for addition\n"+
//                    "Enter 2 for substraction\n"+
//                    "Enter 3 for multiplication\n "+
//                    "Enter 4 for Division\n"+
//                    "Enter 5 for exiting the loop");
//
//            n = sc.nextInt();
//            if( n == 1 ){
//                first = sc.nextInt();
//                second = sc.nextInt();
//                System.out.println("add :- "+(first+second));
//            }else if( n == 2 ){
//                first = sc.nextInt();
//                second = sc.nextInt();
//                System.out.println("sub"+(first - second));
//            }else if( n == 3 ){
//                first = sc.nextInt();
//                second = sc.nextInt();
//                System.out.println("multi"+first*second);
//            }else if( n == 4 ){
//                first = sc.nextInt();
//                second = sc.nextInt();
//                if(second == 0 ){
//                    System.out.println("Not Defined");
//                }else{
//                    System.out.println("add"+first/second);
//                }
//            }else if( n == 5 ){
//                break;
//            }
//        }while (true);
//    }
//}



//*****

// 40 Print \hello\" until user gives wrong input using do while"
//import java.util.Scanner;
//public class loops {
//
//   public static void main(String[] args){
//
//
//       Scanner sc = new Scanner(System.in);
//
//       int n;
//       do{
//           System.out.print("Enter a number: ");
//           n = sc.nextInt();
//           if( n == 1 ){
//               System.out.println("Hello");
//           }
//       }while(n == 1);
//   }
//}
