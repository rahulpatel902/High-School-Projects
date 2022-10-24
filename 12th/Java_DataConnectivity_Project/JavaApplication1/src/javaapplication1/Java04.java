package javaapplication1;

import java.util.Scanner;

    //  04.
    //  Write a Java program that reads a floting-point number and prints "Zero" if the number is zero. 
    //  otherwise print "positive" or "negetive". 

public class Java04 
{
    public static void main(String[] args) 
    {
        double num;
        
        System.out.print("Enter a Floting point Number: ");
        
        Scanner input = new Scanner(System.in);
        num = input.nextDouble();
        
        if (num != 0.0)
        {
            String result = (num < 0.0 ? "it's a Negative Number = " : "it's a Postive Number = ");
            System.out.println(result  + num); 
        }
        else 
            System.out.println("The Number is Zero = " + num);
        

    }
}
        
