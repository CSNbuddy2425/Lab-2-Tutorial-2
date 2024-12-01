package pkg2;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Enter all the data
        System.out.print("Enter the amount of water in gram: ");
        double gram = sc.nextInt();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double init = sc.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double fnl = sc.nextDouble();
        
        //Change the unit
        double M = gram/1000;
        double init_Celsius = (init-32)/1.8;
        double fnl_Celsius = (fnl-32)/1.8;
        double Q = M*(fnl_Celsius-init_Celsius)*4184;
        
        System.out.println("The energy needed is "+Q);
        
        //%.6e can change the format to scinetific notation
        System.out.printf("The energy needed is %.6e",Q);
        
        sc.close();
    }
}
