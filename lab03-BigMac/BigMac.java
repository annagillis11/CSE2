//Anna Gillis
//CSE 2
//Lab 03 Big Mac
//Write a program that computes the cost of buying a some Big Macs.  It uses 
//the Scanner class to obtain from the user how many Big Macs, the cost per Big 
//Mac, and the percentage tax (which depends on the state; 6% in PA, 8% in MA, etc). 
//It then displays the total cost.

import java.util.Scanner; //necessary to use scanner class

public class BigMac {
        //main method required for ever java program
        public static void main(String[ ] args) {
            
            Scanner myScanner; //decalre instance of scanner object
            myScanner = new Scanner (System.in); //tells it will take input
            
            System.out.print (
                "Enter the number of Big Macs (an integer >0) : "); //prompt user
                
            int nBigMacs = myScanner.nextInt ();    //accept user input
            
            System.out.print("Enter the cost per Big Mac as" +
            " a double (in the form xx.xx) : " ) ; //print out
            double bigMac$ = myScanner.nextDouble (); //accept next double
            
            System.out.print("Enter the percent tax as a whole numer (xx) : "); //prompt user to enter percent
            double taxRate = myScanner.nextDouble ();
            taxRate/=100; //user enters percent, but i want proportion
            
            double cost$;
            int dollars, //whole dollar amount of cost
                dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //get teh whole amount, dropping decimal fraction
            dollars=(int)cost$;
            //get dimes amount, eg,
            // (int)(6.73* 10) % 10 -> 67 % 10 -> 7
            // where the % (mod) operator returns the remainer
            //after the division: 583%100 -> 83, 27%5 -> 2
            dimes=(int)(cost$*10)%10;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of " +nBigMacs
            +" BigMacs, at $"+bigMac$ +" per bigMac, with a "+
            "sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+ '.' 
            +dimes+pennies) ; //print out cost
        } //end of main method
} //end of class