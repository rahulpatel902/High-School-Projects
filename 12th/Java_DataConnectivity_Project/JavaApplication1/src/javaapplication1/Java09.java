package javaapplication1;

public class Java09 
{
    public static void main(String[] args) 
    {
        
  // 01. Using While loop
        
        int a = 1;
        
        System.out.print("First 10 Natural Number: ");
        while (a <= 10) 
        {
            System.out.print( a );
            System.out.print(", ");
            a++;
        }

  // 02. Using Do..While loop
        System.out.println();
        
        int num = 1;
        
        System.out.print("First 10 Natural Number: ");
        
        do{
            System.out.print( num );
            System.out.print(", ");
            num++;
        } while (num <= 10);
        
        
  // 03. Using For loop
        System.out.println();
        

        System.out.print("First 10 Natural Number: ");
        
        for (int i = 1; i <=10; i++)
        {
            System.out.print(i);
            System.out.print(", ");
        }
        
        
        
        
    }
}
        
