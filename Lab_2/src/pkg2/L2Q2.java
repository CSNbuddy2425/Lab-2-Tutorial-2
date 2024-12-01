package pkg2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        //import scanner
        Scanner sc = new Scanner(System.in);
        
        //Prompt Users for the data to be calculate
        System.out.print("The price of car: ");
        double P = sc.nextDouble();
        
        System.out.print("Down payment: ");
        double D = sc.nextDouble();
        
        System.out.print("Interest Rate in %: ");
        double R = sc.nextDouble();
        
        System.out.print("Loan duration in year: ");
        double Y = sc.nextDouble();
        
        double M=(P-D)*(1+R*Y/100)/(Y*12);
        
        System.out.printf("\nMonthly Payment: RM %.2f\n",M);
        
        sc.close();
    }
}
