package javaapplication1;
import java.util.Scanner;

    // 05. Write a Java program that keeps a number from the user and generates 
    //     an integer b/w 1 and 7 and displays the name of the weekday.

public class Java05 
{
    public static void main(String[] args) 
    {
        int weekday;
        String dayname;
        
        System.out.print("Enter a Number B/W (1 to 7): ");    
        Scanner input = new Scanner(System.in);
        weekday = input.nextInt();
        
        switch (weekday)
        {
            case 1: dayname = "Monday"; break;
            case 2: dayname = "Tuesday"; break;
            case 3: dayname = "Wednesday"; break;
            case 4: dayname = "Thrusday"; break;
            case 5: dayname = "Friday"; break;
            case 6: dayname = "Saturday"; break;
            case 7: dayname = "Sunday"; break;
            default : dayname = "Entered Invalid Weekday number";       
        }         
        System.out.println(dayname);
    }
}
        
