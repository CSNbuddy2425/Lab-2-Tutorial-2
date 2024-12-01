package pkg2;

import java.util.Scanner;

public class L2Q1 {

    public static void main(String[] args) {
        //import input
        Scanner sc = new Scanner(System.in);
        
        //Users input data
        System.out.print("Enter the Degree Fahrenheit: ");
        double Fahrenheit = sc.nextFloat();
        sc.nextLine();
        double Celsius = (Fahrenheit-32)/1.8;
        
        /*
         *printf which means print in format
         *'%' is to call function
         *'f' means float
         *'.2' means after decimal point have how many numbers
         */
        System.out.printf("Degree Celsius: %.2f\n",Celsius);
        
        sc.close();
    }
}
