import java.lang.*;
import java.util.Scanner;

public class HelloWorld{
    public static void line(){
        int i=0;
        System.out.println();
        while(i<50){
            System.out.print("-");
            i++;
        }
    }

    public static void main(String[] args){
        int i,n=5;
        System.out.print("Hello World");

        line();

        for(i=1;i<n;i++){
            System.out.printf("\nPrinting %d",i);
        }

        line();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a Number (J): ");

        int j= sc.nextInt();
        System.out.print("\nEnter a Number (K): ");
        int k=sc.nextByte();

        if(j>20 && k<10){
            System.out.printf("\n I value is greater than 20 \n Value is %d",j);
        } else if (k>10 || j<20) {
            System.out.println("\nTest Case in Else-if Passed");
        } else{
            System.out.printf("\n I value is less than 20 \n Value is %d",j);
        }
        line();


    }
}