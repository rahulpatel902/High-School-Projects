package javaapplication1;

import java.util.Scanner;

    //  01.
    //  Write a Java program to get a Number from the user and print whether
    //  it's positive or negetive.

public class Java01 
{
    public static void main(String[] args) 
    {
        
        int num;
        
        System.out.print("Enter a Interger Number: ");
        
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        String result = (num < 0 ? "it's a Negative Number" : "it's a Postive Number");
        
        System.out.println(result);
        
    }
}
