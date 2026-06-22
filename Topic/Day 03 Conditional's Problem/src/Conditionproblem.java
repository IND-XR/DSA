import java.util.Scanner;

public class Conditionproblem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int s = 0;

        if( amount <= 0 && amount >= 100 ){
            s = 4.2/amount;

        }else if(amount <= 101 && amount >= 200){
            s = 6/amount;
        }else if(amount <= 201 && amount >= 300){
            s = 8/amount;

        }else if( amount <= 400){
            s = 13/amount;
        }
        System.out.println(s);
    }




}
