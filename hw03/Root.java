//Anna Gillis
//CSE 2
//hw 03 root
//Write a program that prompts the user to enter a double and then prints out a crude estimate of the cube root of the number and the value of this crude guess when cubed.

import java.util.Scanner; //necessary to use scanner class

public class Root {
        //main method required for ever java program
        public static void main(String[ ] args) {
            
            Scanner myScanner; //decalre instance of scanner object
            myScanner = new Scanner (System.in); //tells it will take input
            
            System.out.print("Enter a double, and I print its cube root-") ; //print out
            double number = myScanner.nextDouble (); //accept next double
            
            double guess1;
            
            guess1=(number/3); //divide by three
            
            double guess2;
            
            guess2=(2*guess1*guess1*guess1+number)/(3*guess1*guess1); //more acurate
            
            double guess3;
            
            guess3=(2*guess2*guess2*guess2+number)/(3*guess2*guess2); //more acurate
            
            double guess4; 
            
            guess4=(2*guess3*guess3*guess3+number)/(3*guess3*guess3); //more acurate
            
            double guess5; 
            
            guess5=(2*guess4*guess4*guess4+number)/(3*guess4*guess4); //more acurate
            
            double guess6;
            
            guess6=(2*guess5*guess5*guess5+number)/(3*guess5*guess5); //more acurate
            
            
            System.out.println ("The cube root is"+ guess6); //print
            
            System.out.println (guess6+"*"+guess6+"*"+guess6+"="+guess6*guess6*guess6); //print
            
        }
}
     