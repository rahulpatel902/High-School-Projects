package javaapplication1;
import java.util.Scanner;

//11. Write a program in Java to input 5 numbers from keyboard and find their sum and average. use all loops.

public class Java11 
{
    public static void main(String[] args) 
    {
        int i; 
        int numbers = 0; 
        int sum = 0;
        double avg;
        
        System.out.println("Enter any 5 numbers : ");
        
        
        for (i = 0; i < 5; i++) 
        {
            Scanner in = new Scanner(System.in);
            numbers = in.nextInt();

            sum = sum + numbers;
        }
        
        avg = sum / 5;
        System.out.println("The sum of 5 no is : " + sum);
        System.out.println("The Average is : " + avg);
    }
}
