package pkg2;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        //import random number
        Random rd = new Random();
        
        //Declare varaible;
        int sum = 0;
        double avg;
        
        //Generate for 3 times
        for(int i=0;i<3;i++){
            //Generate number that the range between 10 to 50
            int num = rd.nextInt(41)+10;
            
            System.out.println("Random number "+(i+1)+": "+num);
            
            sum += num;
        }
            //Print the sum
            System.out.println("\nThe sum of 3 numbers: "+sum);
            
            //Print the average in 2 decimal places
            avg = sum/3;
            System.out.printf("The average of 3 numbers: %.2f",avg);
    }
}
