package javaapplication1;

import java.util.Scanner;


    //  8. The user to type his own ID, if the ID is valid it will ask him to enter his password, 
    //     if the password is correct the program will print the name of the user, 
    //     otherwise ,the program will print Incorrect Password and if the ID does not exist , 
    //     the program will print Incorrect ID
 

public class Java08 
{
    public static void main(String[] args) 
    {
        //Constant User Info
        final int user_Id = 901;
        final int user_Password = 902785;
        final String user_Name = "Rahul Patel";

        int id;
        int password;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Your ID Number: ");
        id = input.nextInt();

        
        if (id != user_Id)
        {
            System.out.println("Incorrect ID, Your ID does nor Exist!!");
        }    
        else          
        {
        
            System.out.print("Enter Your PassWord: ");
            password = input.nextInt();
            
            if (password != user_Password)
            {
                System.out.println("Incorrect Password, Try again...");           
            }
            else
            {
                System.out.println("Login Successful!!");                
                System.out.println("User Name: " + user_Name);           
            }
            
        }
    }
}
        
