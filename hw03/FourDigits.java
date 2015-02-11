//Anna Gillis
//CSE 2
//hw 03 fourdigits
//Write a program that prompts the user to enter a double and  then prints out 
//the first four digits to the right of the decimal point.

import java.util.Scanner; //necessary to use scanner class

public class FourDigits {
        //main method required for ever java program
        public static void main(String[ ] args) {
            
            Scanner myScanner; //decalre instance of scanner object
            myScanner = new Scanner (System.in); //tells it will take input
            
            System.out.println("Enter a double and I display the four digits to the right of the decimal point-") ; //print out
            double number = myScanner.nextDouble (); //accept next double
            
            int number1= (int)(number); //turns number into an int called number1
            
            int number2= (int)(number*10000); //makes number2 into the non decimal of number 
            
            int number3= (int)(number1*10000); //makes number3 into big number of int
            
            int number4= (int)(number2-number3); //subtracts number3 from number2 
            
            System.out.println ("The four digits are "+ number4); //print
            
        }
        
}
            
            