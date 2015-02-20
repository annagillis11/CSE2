// anna gillis
//hw 04
//Write a program that prompts the user to think of an int between 1 and 10 
//inclusive. Then the program proceeds to ask the user questions in an attempt to 
//guess what number the user is thinking of

import java.util.Scanner; //set up scanner class

public class WhichNumber{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
   			    Scanner input= new Scanner(System.in); //sets up scanner
   			  
   			    System.out.println("Think of a number between 1 and 10 inclusive"); //print
   			    
   			    System.out.println("Is your number even?"); //print
                  
                  String yesno= input.nextLine(); //accept character
                  char ch= yesno.charAt(0);
                    
                  if (ch == 'Y' ^ ch == 'y') {
                     System.out.println("Is it divisible by 3?");
                     String yesno1= input.nextLine(); //accept character
                     char ch1= yesno1.charAt(0);
                  
                     if (ch1 == 'Y' ^ ch1 == 'y') {
                        System.out.println("Your number is 6");
                     }
                     
                     else if (ch1 == 'N' ^ ch1 == 'n') {
                        System.out.println("Is the number divisible by 4?");
                        String yesno2= input.nextLine(); //accept character
                        char ch2= yesno2.charAt(0);
                           if (ch2 == 'Y' ^ ch2 == 'y'){
                              System.out.println("Is the number divided by 4 greater than 1?");
                              String yesno3= input.nextLine(); //accept character
                              char ch3= yesno3.charAt(0);
                                 if (ch3== 'Y' ^ ch3 == 'y') {
                                    System.out.println ("Your number is 8");
                                 }
                                 else {
                                    System.out.println("Your number is 4");
                                 }
                                 
                              }
                           else if (ch2 == 'N' ^ ch2== 'n') { 
                              System.out.println("Is it divisible by 5?");
                              String yesno4= input.nextLine(); //accept character
                              char ch4= yesno4.charAt(0);
                                 if (ch4 == 'Y' ^ ch4== 'y') {
                                    System.out.println("Your number is 5");
                                 }
                                 else {
                                    System.out.println("Your number is 2");
                                 }
                                 
                           }
                        }   
                     }
                  
                     else if (ch == 'N' ^ ch == 'n') {
                        System.out.println("Is it divisible by 3?");
                        String yesno5= input.nextLine(); //accept character
                        char ch5= yesno5.charAt(0);
                        if (ch5 == 'Y' ^ ch5 == 'y') {
                           System.out.println("When divided by 3 is the result greater than 1?");
                           String yesno6= input.nextLine(); //accept character
                           char ch6= yesno6.charAt(0);
                           if (ch6 == 'Y' ^ ch6== 'y') {
                              System.out.println("Your number is 9");
                           }
                           else {
                              System.out.println("your number is 3");
                           }
                        }
                        else if (ch5== 'N' ^ ch5== 'n'){
                           System.out.println("Is it greater than 6?");
                           String yesno7= input.nextLine(); //accept character
                           char ch7= yesno7.charAt(0);
                              if (ch7 == 'Y' ^ ch7 == 'y') {
                                 System.out.println("your number is 7");
                              }
                              else if (ch7== 'N' ^ ch7 == 'n') {
                                 System.out.println("is it less than 3?");
                                 String yesno8= input.nextLine(); //accept character
                                 char ch8= yesno8.charAt(0);
                                 if (ch8== 'Y' ^ ch8=='y') {
                                    System.out.println("your number is 1");
                                 }
                                 else
                                    System.out.println ("your number is 5");
                              }
                        }
                     }
                  
            
               

}  //end of main method   
  	} //end of class
