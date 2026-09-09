import java.util.Scanner;

public class switchyield {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    };
}




//import java.util.Scanner;
//
//public class switchyield {
//
//    public static void main(String[] args){
//
//        Scanner sc =  new Scanner(System.in);
//        int  num = 5 ;
//
//        String day = switch (num){
//            case 1 , 2  -> "Small";
//            case 3 , 4  -> "Medium";
//            case 5 -> {
//                int square = num * num;
//                int cube = num * num * num ;
//                System.out.println("square " + square );
//                System.out.println("cube " + cube );
//                yield "large";
//            }
//            default -> "Unknown";
//        };
//
//        System.out.println("Result :" + day);
//    }
//}
