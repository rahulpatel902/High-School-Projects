package javaapplication1;

import java.util.Scanner;

public class Java12 {

    public static void main(String[] args) {

        int i; 
        int num;

        System.out.print("Enter number: ");
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (i = 1; i <= num; i++) 
        {
           System.out.println("cube of " + i + " is : " + (i * i * i));
        }

    }

}
