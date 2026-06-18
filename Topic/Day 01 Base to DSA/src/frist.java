// 19 Accept a year and check if it a leap year or not (google to find out what's a leap year)

import java.util.Scanner;

public class frist {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        if( (n % 4) == 0){
            System.out.println("YES");
        }else if( (n % 100) == 0){
            System.out.println("yes");
        }else if( (n % 400) == 0 ){
            System.out.println("yes");
        }else{
            System.out.println("year was not  leap  year");
        }
    }
}

// 16 Accept name and age from the user. Check if the user is a valid voter or not. (Valid - Hello Shery, You are a valid voter. Invalid - Sorry Shery, you can't cast the vote. Part 2 - Print after how many years the user will be eligible)

//import java.util.Scanner;
//
//public class frist {
//
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Age: ");
//        int age =sc.nextInt();
//
//        System.out.print("Name: ");
//        String name=sc.next();
//
//        if(age >= 18 ){
//            System.out.println(name+" you are eligible for vote ");
//        } else{
//            int n = (18 - age);
//            System.out.println(" you are eligible after "+ n +" year " );
//            System.out.println(name+" you are not 18 + eligible for vote ");
//        }
//    }
//}

// 13 Accept the gender from the user as char and print the respective greeting message (Ex - Good Morning Sir (on the basis of gender))
//import java.util.Scanner;
//
//public class frist {
//
//    public static void main(String[] args){
//
//         Scanner sc = new Scanner(System.in);
//
//         System.out.println("Enter gender : M or F");
//         char gender = sc.nextLine().charAt(0);
//
//        if( gender == 'M' || gender == 'm'){
//            System.out.println("Good moring sir!");
//        }else if(gender == 'F' || gender == 'f'){
//            System.out.println(" Good moring madam");
//        }else{
//            System.out.println("not male & not female");
//        }
//    }
//}



// 12.Accept two numbers and print the greatest between them
//import java.util.Scanner;
//
//public class frist {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter length od  rectangle");
//        int a = sc.nextInt();
//
//        System.out.println("Enter breadth rectangle");
//        int b = sc.nextInt();
//
////        System.out.println("Enter number ");
////        int c = sc.nextInt();
//
//        if(a>b){
//            System.out.println("Area is greater than breadth");
//        }else{
//            System.out.println("Area is less than breadth");
//        }
//
////       double ares = Math.sqrt(m*(m-a)*(m-b)*(m-c));
////
////        System.out.println(" Heron's Formula "+m);
////        System.out.println(" Heron's Area "+ares);
//
//
//    }
//}

// 8. Accept the three sides of triangle and calculate the area using Heron's formula
//import java.util.Scanner;
//
//public class frist {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter length od  rectangle");
//        int a = sc.nextInt();
//
//        System.out.println("Enter breadth rectangle");
//        int b = sc.nextInt();
//
//        System.out.println("Enter number ");
//        int c = sc.nextInt();
//
//        int  m =  ((a+b+c)/2);
//
//        double ares = Math.sqrt(m*(m-a)*(m-b)*(m-c));
//
//        System.out.println(" Heron's Formula "+m);
//        System.out.println(" Heron's Area "+ares);
//
//
//    }
//}


//import java.util.Scanner;
// 7. Accept the length and width of a rectangle. Calculate & print the area and perimeter.
//public class frist {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter length od  rectangle");
//        int len = sc.nextInt();
//
//        System.out.println("Enter breadth rectangle");
//        int breadth = sc.nextInt();
//
//        System.out.println("Perimter " +(2*(len+breadth)));
//        System.out.println("area"+(len*breadth));
//
//
//    }
//}

// swap of two number

// 2. Without Third Variable (Addition & Subtraction)
//public class frist {
//
//    public static void main(String[] args){
//
//        int  a = 10 ;
//        int b = 20 ;
//
//        a = a + b ;
//        b = a - b;
//        a = a - b;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}


//qs 1
//public class frist {
//
//    public static void main(String[] args){
//
//        int  a = 10 ;
//        int b = 20 ;
//
//        int tamp = a;
//        a = b ;
//        b = tamp;
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//}
//
//


// 1) What will be the  output of the following program?

//public class frist {
//
//    public static void main(String[] args){
//        int  i = 11;
//        i = i++ + ++i;
//        System.out.println(i);
//    }
//}








// 4. Accept the  User's name , age and print in following manner ( Ex - Hello Shery, you are 12 year old)
//
//import java.util.Scanner;
//
//public class frist {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Name: ");
//        String m = sc.nextLine();
//
//        System.out.print("Enter Age: ");
//        int age = sc.nextInt();
//
//
//
//        System.out.println( "Hello "+ m + ", you are " + age  +" years old ");
//    }
//}

// 3. Accept two integers from user and  print the sum ( Ex- the Sum of 45 & 12  = 57 )

//import java.util.Scanner;
//
//public class frist {
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//
//        System.out.println("The sum of"+ n + m );
//    }
//}
