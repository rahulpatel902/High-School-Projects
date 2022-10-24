package javaapplication1;

import java.util.Scanner;

    //  07.
    //  Write a java program to find the number of days in a month


public class Java07 
{
    public static void main(String[] args) 
    {

        int month;
        String days_In_a_month;
        
        System.out.print("Enter a Month Number B/W (1 to 12): ");
        
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
        
        switch (month)
        {
            case 1: days_In_a_month = "31 Days in Jan"; break;
            case 2: days_In_a_month = "28 Days in Feb"; break;
            case 3: days_In_a_month = "31 Days in March"; break;
            case 4: days_In_a_month = "30 Days in April"; break;
            case 5: days_In_a_month = "31 Days in May"; break;
            case 6: days_In_a_month = "30 Days in June"; break;
            case 7: days_In_a_month = "31 Days in July"; break;
            case 8: days_In_a_month = "31 Days in Aug"; break;
            case 9: days_In_a_month = "30 Days in Sep"; break;
            case 10: days_In_a_month = "31 Days in Oct"; break;
            case 11: days_In_a_month = "30 Days in Nov"; break;
            case 12: days_In_a_month = "31 Days in Dec"; break;
            default : days_In_a_month = "Entered Invalid Month number";       
        }    
        
        System.out.println(days_In_a_month);

    }
}
        
