package javaapplication1;

import java.util.Scanner;

public class Java15 
{

    public static void main(String[] args) 
    {
        
        int n;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the nth term: ");
        n = input.nextInt();
        
        System.out.println(n + "th term of odd Natural Number: ");
        
        for(int i = 2; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
                sum = sum + i;
            }
        }
        
        System.out.println("Sum of " + n + "th term of odd Natural Number: " + sum);


    }

}
