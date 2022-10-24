
package javaapplication1;

public class Book {
    
    
    static int rec_area (int x, int y)
    {
        return (x * y);
    
    }
    
    void mess (String message)
    {
         System.out.println("The message is: " + message);
    }
    
 public static void main(String[] args)        
  {
    int a = 20;
    int b = 30;
    
    int c = rec_area(a, b);
    System.out.println("Hello World" + c);
 

    
  }   
}
