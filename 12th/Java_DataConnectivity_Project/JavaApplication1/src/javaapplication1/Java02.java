package javaapplication1;

import java.util.Scanner;

    //  02.
    //  Take two  Number from the user and print the Greatest Number

public class Java02 
{
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input First Numbers: ");
        num1 = input.nextInt();
        
        System.out.print("Input Second Numbers: ");
        num2 = input.nextInt();
      
        if (num1 == num2)
        {
            System.out.println("Both First and Second number are Equal = " + num1 + " = " + num2);
        }
        else if (num2 > num1)
            System.out.println("Second number = "  + num2 + " is the Greatest");
        else
            System.out.println("First number = "   + num1 + " is the Greatest");  
    }
}
        
        

        // using if else and ternary oprater        
        /*
        if (num1 != num2)
        {    
            String result = (
                              num2 > num1 
                              ? "First number"  + num2 + " is the Greatest" 
                              : "Second number" + num1 + " is the Greatest"
                            );
            System.out.println(result);
        }
        else
        {
            System.out.println("Both First and Second number are Equal" + num1 + " = " + num2);
        }
        */
        