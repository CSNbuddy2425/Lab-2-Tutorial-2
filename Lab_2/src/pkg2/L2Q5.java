package pkg2;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(10001);
        int sum = 0;
        
        //Display number
        System.out.println("Random number: "+num);
        
        //build a loop for sum all digits in number
        for(int i=0;i<5;i++){
            
            //take the last digit for the number
            int digit = num%10;
            
            //Renew the number after taking the last digit
            num = num/10;
            
            //Sum the last digit when the loop proccessing
            sum+=digit;
        }
            System.out.println("Sum of all the digits: "+sum);
        
    }
}
