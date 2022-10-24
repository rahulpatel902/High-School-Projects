
package java_cc;
        
import java.util.Scanner;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;

import java.util.Date;

public class Java_cc {

    public static void main(String[] args) {


  

        
  // 01.Premitive type   
  /* 01     
  // variable 
  
        int age = 30;
        age = 35;
        int myage = 17;
        int herage = myage;


        
  //print      
  
        System.out.println("helloworld");
        System.out.println(age);
        System.out.println(myage);
        System.out.println(herage);
        

   01 

    
        byte age = 30;
        int viewcount =  123_456_789;
        long viewscount = 3_123_456_789L; // need to use L in long
        
        double price = 10.55;  //By Default java reads decimal value as double
        float price2 = 10.55F;  //need to use F in float
        
        char letter = 'A';
        boolean canrun = true;
        boolean cannot = false;
     
    */

    // 02.Refrence type   
 

//      Date now = new Date();
//      System.out.println(now);
      
    
    /* primitive type vs Refrence type*/
    
        // premitive type 
        
    /*  byte x = 2;
        byte y = x;
        x = 3;
        
        System.out.println(y);
        System.out.println(x);    
     */
    
        // refrence type 
       /*              
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);
        */
      
       
       //03  STRINGS
  /*     
       String text = "Helloworld" + "!!";
       text.endsWith("!!");
       System.out.println(text);
       
       System.out.println(text.endsWith("!!"));
       System.out.println(text.startsWith("!!"));
       
       System.out.println(text.length());
       
       System.out.println(text.indexOf("H"));
       
       System.out.println(text.indexOf("r"));
       
       System.out.println(text.indexOf("not"));
       
 //change but in another string created 
       System.out.println(text.replace("!", "*"));
 // original string can be changed in java 
       System.out.println(text);
 //lower case
        System.out.println(text.toLowerCase());
 // upper case 
        System.out.println(text.toUpperCase());
 // trim unnessary spaces
        String text1 = "   new world  ";
        System.out.println(text1.trim());
    
    */
  /*
  // 04.Escape sequence
  
 // to add single or doubl quotes 
    String text = "Hello \"World\"";
    System.out.println(text);
  
 // to add back slash
     String text1 = "C:\\windows\\..";
     System.out.println(text1);
  
 // to add new line 
     String text2 = "my\nworld";
     System.out.println(text2);
  
 // to add tab-space    
     String text3 = "\tyour\tworld";
     System.out.println(text3);
        
  */
  
 // 05. Arrays
 // old method   
 /*
   int[] numbers = new int[5];
   numbers[0] = 1;
   numbers[1] = 2;
   numbers[2] = 3;
   System.out.println(numbers);
   System.out.println(Arrays.toString(numbers));
*/
 
 //new method  
 /*       
    int[] numbers = {2, 3, 4, 5, 1, 6};
    Arrays.sort(numbers);  // to shot arrays
    System.out.println(numbers.length);
    System.out.println(Arrays.toString(numbers));    
                           // to convert list address into the actual list
        
*/
 



 // 5.1 Multi-dimentional arrays
 /*
  // old method  
  //2d
        int [][] numbers = new int [2][2];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
  //3d      
        int [][][] numbers2 = new int [3][3][3];
        numbers2[0][0][0] = 1;
        numbers2[1][1][1] = 2;
        numbers2[2][2][2] = 3;
        System.out.println(Arrays.deepToString(numbers2));
   // new method
   //2d
        int [][] numbers3 = {{1, 2, 3, 4}, {2, 3, 4, 5}};
        System.out.println(numbers3.length);
        System.out.println(Arrays.deepToString(numbers3));
   //3d   
        
         int [][] numbers4 = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 5, 6, 8}};
         
        System.out.println(numbers4.length);
        System.out.println(Arrays.deepToString(numbers4));
   */     
        
       
// 06. Constant
// ones fanal is used the valu of PI can be changed

//        final float PI = 3.14F;
        
// 07. Aritmatic expression
/*
// add
      int result = 10 + 3;
      System.out.println(result);
// minnus    
      int result1 = 10 - 3;
      System.out.println(result1);
//multiply
      int result2 = 10 * 3;
      System.out.println(result2);
//divide      
      int result3 = 10 / 3;
      System.out.println(result3);
      
      double result31 = (double)10 /(double)3;
      System.out.println(result31);
      
//remainder            
      int result4 = 10 % 3;
      System.out.println(result4);
  */    
// increment oprators
//1
/*
       int x = 1;
       x++;
       x--;
       x++;
       --x;
       ++x;
       System.out.println(x);
 */

//1.1       
 /*      int a = 2;
       int b = a++;
       System.out.println(a);
       System.out.println(b);
       
 //1.2
       int c = 2;
       int d = ++c;
       System.out.println(c);
       System.out.println(d);
*/
//1.3 to add more numbers
 // first method
 /*
       int x = 1;
       x = x + 2;
       System.out.println(x);
 // second method
 // add
       int a = 1;
       a += 2;  // a = a + 2;
       System.out.println(a);
 // minus      
       int b = 1;
       b -= 2;  // b = b - 2;
       System.out.println(b);
       
// multiply
       int c = 2;
       c *= 2;
 //    c = c * 2;
       System.out.println(c);
       
// divide
       int d = 4;
       d /= 2;  // d = d / 2
 //    c = c * 2;
       System.out.println(d);

// remainder or modulus
       int e = 5;
       e %= 2;  // d = d % 2
 //    c = c * 2;
       System.out.println(e);

*/       
/*
// 8.order of operators  [() > / > * > +> -]
// bodmas (first multiply then add)
      int x = 10 + 3 * 2;
      System.out.println(x);
      
// brackets first      
      int y = (10 + 3) * 2;
      System.out.println(y);
*/

// 09.Casting and type c onversion    
//implicit casting
//byte > short > int > long > float > double
/*
         short x = 1;
         int y = x + 2;
         System.out.println(y);
//2
         double a = 1.1;
         double b = a + 2; // auto = 2.0
         System.out.println(b);
//2.1
         double c = 1.1;
         int d = (int)c + 2; // 
         System.out.println(d);
//2.2
         String e = "1";
         int f = Integer.parseInt(e) + 2;  // string is converted into intger;
         System.out.println(f);
//2.3
         String g = "1.1";
         float h = Float.parseFloat(g) + 2;  // string is converted into float;
         System.out.println(h);
//2.4
         String i = "2.1";
         double j = Double.parseDouble(i) + 2;  // string is converted into float;
         System.out.println(j);
*/
// 10.maths class
//1.1
/*
       int result = Math.round(1.1F);    
       System.out.println(result);        // double to int
 //1.2
       int result2 = (int)Math.ceil(1.1);  // get gratest or equal
       System.out.println(result2);            
//1.2
       int result3 = (int)Math.floor(1.1);   // get smallest or equal
       System.out.println(result3); 
 //2   
       int result4 = Math.max(10, 2);    // print the max number
        System.out.println(result4);
//2.1   
       int result5 = Math.min(10, 2);    // print the min number
        System.out.println(result5);
    */   

//int x;
//System.out.println("Enter First Number: ");
//Scanner input = new Scanner(System.in);
//x = input.nextInt();
//
//int b;
//System.out.println("Enter Second Number: ");
//Scanner input2 = new Scanner(System.in);
//b = input2.nextInt();
//
//int result = Math.max(x, b);
//
//System.out.println("Max Number is: " + result);





//3   
/*
        double result6 = Math.random();    // print or generate a randam number from 0 to 1
        System.out.println(result6);     // every time we run we get different value 
//3.1   
        double result7 = Math.random() * 100;    // print or generate a randam number from 0 to 100
        System.out.println(result7);     // every time we run we get different value 
//3.1   
        int result8 = (int)( Math.random() * 100);    // print or generate a randam number from 0 to 100
        System.out.println(result8);     // every time we run we get different value 
*/

// 11. Formatting numbers  
/*
//method-1
// 1.1 currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345678.95);
        System.out.println(result);
//1.2 percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.2);
        System.out.println(result1);
//method-2

        String result2 = NumberFormat.getPercentInstance().format(0.3);
        System.out.println(result2);
*/

//12.Reading input
/*
//for byte
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are "+ age);
         
//for float and double

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Your percentage ");
        float percent = scanner1.nextFloat();
        System.out.println(percent + "%");
        */
//for string
/*
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What's your name ");
        String name = scanner2.nextLine().trim();      // nextLine() = use for to get use's all line
        System.out.println("Your name is " + name);     // trin() = is used here to trim all unnessary spasec
*/
/*
//Project : Mortgage Calculator
//constant
      final byte MONTH_IN_YEARS = 12;
      final byte PERCENT = 100;
      
      Scanner scanner = new Scanner(System.in);
//principle     
        System.out.println("Principle: ");
        int principle = scanner.nextInt();
//anu intrest rate
        System.out.println("Annual Intrest Rate: ");
        float anualInterest = scanner.nextFloat();
        float monthlyIntrest =  anualInterest / PERCENT / MONTH_IN_YEARS;
// period
        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_IN_YEARS;
//montagage 
        
       
    double  mortgage = principle *(monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments))
                           /(Math.pow(1 + monthlyIntrest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(12345678);
        System.out.println("Mortage: " + mortgageFormatted);
*/
//13. control flow  
// 1.1comparision operators  
// boolean expression
/*
        int x = 1;
        int y= 2;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x <= y);
        System.out.println(x >= y);
 */
 //1.2 logical oprators
 //01.(&&/or) oprator
 /*       int temprature = 22;
        int temprature1 = 12;
        boolean iswarm = temprature > 20 && temprature < 30;
        boolean iswarm1 = temprature1 > 20 && temprature1 < 30;
        System.out.println(iswarm);
        System.out.println(iswarm1);
*/        
//02 (||/or)  operator
// true 
  /*       boolean hashighIncome = true;
         boolean hasgoodcradit = true;
         boolean isEligible = hashighIncome || hasgoodcradit;
   /*      System.out.println(isEligible);

 //false   
/*
         boolean hashighIncome1 = true;
         boolean hasgoodcradit1 = false;
         boolean hascriminalrecord = true;
         boolean isEligible1 = (hashighIncome1 || hasgoodcradit1) && !hascriminalrecord;
         System.out.println(isEligible1);
*/    
//14. if statement

/*  01. Question
        if, temprature is greater then 30;
           It's a hot day
           Drink plenty of water
        otherwise, if, themprature is between 20 and 30;
          It's a nice day;
        otherwise 
          it's a cold day
*/
//solve
/*
        int temp = 10;
        if (temp > 30)
        {
            System.out.println("It's a hot day ");
            System.out.println("Drink Water  "); 
        }
        else if(temp >= 20 && temp <= 30){
            System.out.println("It's a nice day");
        }
        else 
        {
            System.out.println("It's cold");
        } 
*/
// method to simplyfy if statement
//01  
/*
      int income = 120_000;
      if (income > 100_000){
          boolean hasHighIncome = true;
      }
        System.out.println(hasHighIncome); //error
 */
//02
 /*     int income1 = 120_000;
      boolean hasHighIncome1 = true;
      if (income1 > 100_000){
          hasHighIncome1 = true;
      }
        System.out.println(hasHighIncome1);  //fixed
  */      
//02.1
 /*    
      int income2 = 20_000;
      boolean hasHighIncome2;
      if (income2 > 100_000){
          hasHighIncome2 = true;
      }
      else  
        hasHighIncome2 = false;
        System.out.println(hasHighIncome2); 
 */
//02.2
/*
      int income = 12_000;
      boolean hasHighIcome = (income > 100_000);

      System.out.println(hasHighIcome);
*/

//15. Ternary Operator  (? :)
/*
      int income3 = 20_000;
      String rankName = (income3 > 100_000 ? "First " : "Last");
      System.out.println(rankName);
*/
//16. Switch Statement
//01 one way
/*      String role = "admin";
      if (role == "admin")
            System.out.println("You're a admin");
      else if (role == "moderator")
            System.out.println("You're a modrator");
      else 
      System.out.println("You're a guest");
*/
//02 secont way
/*
         Scanner scanner = new Scanner(System.in);
         System.out.println("What's your position");
         int position = scanner.nextInt();
         
         switch (position){
             case 1: 
                 System.out.println("You're in top");
                 break;
             case 2: 
                 System.out.println("You're in center");
                 break;
             default: 
                 System.out.println("You're in bottom");
         }
*/

//17  excersize fizzbuzz   
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scanner.nextInt();
        
         if (num % 5 == 0 && num % 3 == 0){
              System.out.println("FizzBuzz");   
         }
         else if (num % 5 == 0){
               System.out.println("Fizz");
         }
         else if (num % 3 == 0){
               System.out.println("Buzz");    
         } 
         else{
             System.out.println(num);
         }
*/
//18. loops
//1.1
  /*
             for (int r = 0; r < 5; r++)
             System.out.println("helloworld " + r);
             
             for(int p = 5; p >= 0; p--)
                System.out.println("hi" + p);
 */            
 //18.2 while loops            
   /*          
             int a = 0;
             while (a <= 5){
                 System.out.println(a);
                 a--;
             }
     */        
  // a example program    
  /*
             Scanner scanner = new Scanner(System.in);
             String input = "";
             
             while(!input.equals("quit")){
                 System.out.println("Input: ");
                 input = scanner.next().toLowerCase();
                 System.out.println(input);      
             }        
  */
  //19 Do.. While loop
  /*
             Scanner scanner = new Scanner(System.in);
             String input2 = "";
             
             do{
                 System.out.println("Input: ");
                 input2 = scanner.next().toLowerCase();
                 System.out.println(input2);      
             }
             
             while(!input2.equals("quit"));
 */               
             
//20. break and continue
  
  // first method
 /* 
             Scanner scanner = new Scanner(System.in);
             String input = "";
             
             while(!input.equals("quit")){
                 System.out.println("Input: ");
                 input = scanner.next().toLowerCase();
                 
                 if (!input.equals("quit"))
                     
                     System.out.println(input);
             } 
             
   */          
  // 2nd method  break and continue statement
 /*  
  
         Scanner scanner = new Scanner(System.in);
         String input = "";
         
         while(true){
               System.out.println("input: ");
               input = scanner.next().toLowerCase();
               if(input.equals("pass"))
                   continue;
               if(input.equals("quit"))
                   break;
                System.out.println(input);
         
         
         }
         
         
  
  */
  
  
 //21 for - each loop 
  
   //    String [] fruits = {"Apple", "Mango", "Orange"};
       
//01. using for loop  01   
 //       for (int i = 0; i < fruits.length; i++)
 //       System.out.println(fruits[i]);
   
// 02.using for -each loop  
    //    for(String fruit :  fruits)
   //     System.out.println(fruit); 
   
   
//22. project  mortgage calculator

//Project : Mortgage Calculator
//constant
/*
      final byte MONTH_IN_YEARS = 12;
      final byte PERCENT = 100;
      
      int principle = 0;
      float monthlyIntrest = 0;
      int numberOfPayments = 0;

      
      Scanner scanner = new Scanner(System.in);
//principle  
      while(true){
        System.out.println("Principle: ");
        principle = scanner.nextInt();
        if(principle >= 1000 && principle <= 1_000_000)
            break;
          System.out.println("Enter value bettween 1000 an 1_000_000");
      }
//anu intrest rate
      while(true){
        System.out.println("Annual Intrest Rate: ");
        float anualInterest = scanner.nextFloat();
        if(anualInterest >= 1 && anualInterest <= 30){
          monthlyIntrest =  anualInterest / PERCENT / MONTH_IN_YEARS;
          break;
         }
        
          System.out.println("Enter A Value between 1 and 30");
      }
// period
      while(true){
        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        if(years >= 1 && years <=30){
        numberOfPayments = years * MONTH_IN_YEARS;
            break;
        }
            System.out.println("Enter years between 1 and 30");   
        }
//montagage 
        
       
    double  mortgage = principle *(monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments))
                           /(Math.pow(1 + monthlyIntrest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(12345678);
        System.out.println("Mortage: " + mortgageFormatted);
    
    
 */   

   }  
} 
        
        
        
        
        
        
       
