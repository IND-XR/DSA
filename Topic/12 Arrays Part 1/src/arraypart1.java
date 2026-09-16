// Qs 3 Find the greatest element (Ex: {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index)

import java.util.Scanner;

public class arraypart1 {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        int[] arr = new int[5];
        int max = arr[0] , index = 0;
        int n = 0;

        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();

            if(arr[i] > max){
                max = arr[i];
                index = i;

            }
        }
        System.out.println("max element = "+max+"found ar " + index + "index" );

    }
}






// QS 2

//import java.util.Scanner;
//
//public class arraypart1 {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[5];
//        int sum = 0;
//
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//        System.out.println("The sum is "+sum);
//
//    }
//}


//import java.util.Scanner;
//
//public class arraypart1 {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr = new int[5];
//
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i = 0 ; i < arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
//


//import java.util.Scanner;
//
//public class arraypart1 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//
//        int[] marks = new int[5];
//
//        System.out.println("Enter 5 marks");
//
//        for(int i = 0; i< marks.length; i++){
//            System.out.print("Enter marks for subject"+(i+1)+":");
//            marks[i] = input.nextInt();
//        }
//
//        System.out.println("your marks are:");
//
//        for(int i = 0; i< marks.length; i++){
//            System.out.print(marks[i]+" ");
//        }
//
//    }
//}
