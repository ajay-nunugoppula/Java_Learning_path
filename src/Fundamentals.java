import java.lang.*;
import java.util.Scanner;

public class Fundamentals{
    //Function Declaration
    public static void line(){
        int i=0;
        System.out.println();
        //While Loop
        while(i<50){
            System.out.print("-");
            i++;
        }
    }

    //Main Function
    public static void main(String[] args){

        //Declaration of Variables
        int i,n=5;

        //Print Statement
        System.out.print("Hello World");

        //Function Calling
        line();

        //For Loop
        for(i=1;i<n;i++){
            System.out.printf("\nPrinting %d",i);
        }

        line();

        //Input From User
        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter a Number (J): ");

        int j= sc.nextInt();
        System.out.print("\nEnter a Number (K): ");
        int k=sc.nextByte();

    //iF,ELSE-IF,ELSE
        //AND statement
        if(j>20 && k<10){
            System.out.printf("\n I value is greater than 20 \n Value is %d",j);
        }
        //OR Statement
        else if (k>10 || j<20) {
            System.out.println("\nTest Case in Else-if Passed");
        }
        else{
            System.out.printf("\n I value is less than 20 \n Value is %d",j);
        }
        line();


    }
}
