
package javaprograms;

import java.util.Scanner;


public class Java1 {

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

      int marks = input.nextInt();
      double total_marks = 500;
      
      double pergentage = marks / total_marks * 100;
       
      System.out.println(pergentage);
    
    }
    
}
