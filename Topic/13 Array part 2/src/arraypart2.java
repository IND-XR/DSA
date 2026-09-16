
// 55)  QS 1 56) Find the second greatest element (Ex: {2, 96, 69, 77, 145, 20} = Second greatest element = 96)

//import java.util.Scanner;
//
//public class arraypart2 {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] array  = new int[5];
//
//        int gerat  = 0 ;
//        int second = 0;
//
//        for(int i = 0 ; i < array.length ; i++){
//            array[i] = sc.nextInt();
//
//            if(array[i] > gerat ){
//                second = gerat;
//                gerat = array[i];
//
//            }else if (array[i] > second ){
//                second = array[i];
//            }
//        }
//        System.out.println("Second greatest element :- "+second);
//        System.out.println("greatest element :-" + gerat);
//
//    }
//}

// same question  another  option
//import java.util.Scanner;
//
//public class arraypart2 {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] array  = new int[5];
//
//        array[0] = sc.nextInt();
//        array[1] = sc.nextInt();
//
//        int gerat  =  Math.max(array[0],array[1]) ;
//        int second =  Math.min(array[0],array[1]);
//
//        for(int i = 2 ; i < array.length ; i++){
//            array[i] = sc.nextInt();
//
//            if(array[i] > gerat ){
//                second = gerat;
//                gerat = array[i];
//
//            }else if (array[i] > second && array[i] != gerat){
//                second = array[i];
//            }
//        }
//        System.out.println("Second greatest element :- "+second);
//        System.out.println("greatest element :-" + gerat);
//
//    }
//}

// 57)  Check if array is sorted in increasing order or not.

import java.util.Scanner;

public class arraypart2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] array  = new int[5];

//        array[0] = sc.nextInt();
//        array[1] = sc.nextInt();
//
//        int gerat  =  0 ;
        //int second =  M
        boolean isSorted = true;

        for(int i = 0 ; i < array.length-1; i++){
            array[i] = sc.nextInt();

            if(array[i] > array[i+1] ){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted?"sorted":"not sonted");
    }
}