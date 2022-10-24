package javaapplication1;

import java.util.Scanner;

    //  03.
    //  Take Three  Number from the user and print the Greatest Number

public class Java03 
{
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        int num3;
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input First Numbers: ");
        num1 = input.nextInt();
        
        System.out.print("Input Second Numbers: ");
        num2 = input.nextInt();
        
        System.out.print("Input Third Numbers: ");
        num3 = input.nextInt();
      
        if (num1 == num2 && num1 == num3)
            System.out.println("All First, Second and Third number are Equal = " + num1 + " = " + num2 +" = " + num3);
        else if (num3 > num2 && num3 > num1)
            System.out.println("Third number = "  + num3 + " is the Greatest");
        else if (num2 > num1)
            System.out.println("Second number = "  + num2 + " is the Greatest");
        else
            System.out.println("First number = "   + num1 + " is the Greatest");  
    }
}
        
