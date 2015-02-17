// anna gillis
//lab 4 bringing cookies to an event

import java.util.Scanner; //set up scanner class

public class Cookies{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
   			    Scanner myScanner; //decalre instance of scanner object
   			    myScanner = new Scanner( System.in ); //ready to accet input
   			    int people;
   			    int cookies;
   			    int cookies1;
   			    int cookies2;
   			    int cookies3; 
   			    
   			    System.out.println("Enter the number of people:");
            
            
                if(myScanner.hasNextInt()) {
                     people = myScanner.nextInt ();    //accept user input
                     
                     if (people<0) {//people less than 0
                        System.out.println("You did not enter a positive number");
                        return; //leave program
                     }
                }
                else{
                System.out.println("You did not enter an int");
                return;    //leaves the program, i.e.
                            //the program terminates
                     }
                     
            
   		
                System.out.println("Enter the number of cookies:");
            
            
                if(myScanner.hasNextInt()) {
                     cookies = myScanner.nextInt ();    //accept user input
                     
                     if (cookies<0) { //people less than 0
                        System.out.println("You did not enter a positive number");
                        return; //leave program
                     }
                }
                else{
                System.out.println("You did not enter an int");
                return;    //leaves the program, i.e.
                            //the program terminates
                     }
                     
                System.out.println("How many cookies do you want each person to have?");
                
                if(myScanner.hasNextInt()) {
                     cookies1 = myScanner.nextInt ();    //accept user input
                     
                     if (cookies1<0) {//people less than 0
                        System.out.println("You did not enter a positive number");
                        return; //leave program
                     }
                     
                     if (cookies<people) {
                         System.out.println ("You do not have enough cookies. Go buy more!");
                         return;
                     }
                     else{
                         System.out.println("You have enough cookies");
                     }
                     
                     cookies3= (cookies/people);
                     
                     if (cookies3<cookies1) {
                         System.out.println( "You do not have enough cookies");
                     }
                     
                     cookies2= (cookies%people); //divide cookies by people
                     
                     if (cookies2==0) {
                         System.out.println("Your cookies will divide evenly");
                     }
                     else {
                         System.out.println("Your cookies will not divide evenly");
                         return; //leave
                     }
                     
                    
                }
                else{
                System.out.println("You did not enter an int");
                return;    //leaves the program, i.e.
                            //the program terminates
                     }
                     
            


}  //end of main method   
  	} //end of class
