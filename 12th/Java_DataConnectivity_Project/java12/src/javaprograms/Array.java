package javaprograms;

import java.util.Arrays;

public class Array {

    
    public static void main(String[] args) {
/*        
          //-Array 1D-// 
        
        int[] marks= new int [5];
        marks[0] = 23;
        marks[1] = 12;
        marks[2] = 56;
        marks[3] = 34;
        marks[4] = 99; 
        
            //-or-//
 */           
        int[] marks={23, 12, 56, 34, 99};     
        Arrays.sort(marks);
        
        for (int i = 0; i < marks.length; i++) {
            
            System.out.println(marks[i]);
            
        }
        
 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//----------------------------------------------------------        
/*
        double [] marks = {100, 200, 300, 400, 500};
        double  total_marks = 400;
        

        for (int i = 0; i < marks.length; i++) 
        {
            
            double  percentage = (marks[i] / total_marks) * 100;
            String result;
            if (percentage >= 40) 
            {
                result = "Passed";
            } 
            else 
            {
                result = "Failed";
            }
            System.out.print((i + 1) + "\t");
            System.out.print(marks[i]+"\t");
            System.out.print(percentage+"\t\t");
            System.out.println(result);    
        }
        
        
        
*///-------------------------------------------------------------
   }

    }
