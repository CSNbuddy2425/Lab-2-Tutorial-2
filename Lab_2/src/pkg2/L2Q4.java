package pkg2;

import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int scd = sc.nextInt();
        
        //Separates hours
        int hours = scd/3600;
        
        /*
         *Separates minutes
         *%3600 can get the remainders after calculating hours
         */     
        int minutes = scd%3600/60;
        
        /*
         *Separates seconds
         *can't use %216000 since the number might < 216000
         */
        int seconds = scd%3600%60;
        
        System.out.println(scd+" seconds is "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds");
        
        sc.close();
    }
}
