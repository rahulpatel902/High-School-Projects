package javaapplication1;

import java.util.Scanner;

public class Java13 
{

    public static void main(String[] args) 
    {

        int num;

        System.out.print("Enter the number: ");
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
           System.out.println(num + " x "+ i + " = " + (num * i));
        }

    }

}
