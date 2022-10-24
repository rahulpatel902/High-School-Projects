package javaapplication1;

import java.util.Scanner;




public class Java10 
{
    public static void main(String[] args) 
    {
        
  // 01. Using While loop
        
        int n;
        int a = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of terms: ");
        n = input.nextInt();
        
        System.out.println("Natural Number till " + n + "th terms: ");
        while (a <= n) 
        {
            System.out.println( a );
            a++;
        }
        
        
        
  // 02. Using Do..While loop

                
        int m;
        int b = 1;
        
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Enter the number of terms: ");
        m = input2.nextInt();
        
        System.out.println("Natural Number till " + m + "th terms: ");
        
        do{
            System.out.println( b );
            b++;
        }while (b <= m); 
        
        
  // 03. Using For loop

        int l;
        int i;
        
        Scanner input3 = new Scanner(System.in);
        
        System.out.println("Enter the number of terms: ");
        l = input3.nextInt();
        
        System.out.println("Natural Number till " + m + "th terms: ");
        for (i = 1; i <= l; i++)
        {
            System.out.println(i);
        
        };
        
        
    }
}
        
