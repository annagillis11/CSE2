// anna gillis
//hw 05
//convert decimal values to hexidecimal

import java.util.Scanner; //set up

public class ToHex {
    public static void main(String[ ] args)  {
        Scanner input= new Scanner(System.in); //accept input
        System.out.println("Please enter three numbers representing RGB values:"); //print
        
        int number1= input.nextInt(); //initliaze
        int number2= input.nextInt(); //initlialze
        int number3= input.nextInt(); //initialize
        
        int number1a=0;
        int number1b=0;
        int number1c=0;
        
        int number2a=0;
        int number2b=0;
        int number2c=0;
        
        int number3a=0;
        int number3b=0;
        int number3c=0;
        
        if (number1 >= 0 && number1 <= 255) { //if number1 is greater/equal than 0 and less than/equal 255
            
            
            if (number1 < 10) { //if number one is less than 10 aka 0-9
                number1a= number1;
            }
            
            else if (number1 > 9 && number1 < 16) { //if number1 is greater than 9 and less than 16 aka 10-15
                switch (number1) {
                   case 10: number1a= 'A'; break; //number is 10 then number1a= A
                   case 11: number1a= 'B'; break;
                   case 12: number1a= 'C'; break;
                   case 13: number1a= 'D'; break;
                   case 14: number1a= 'E'; break;
                   case 15: number1a= 'F'; break;
                }
            }
            
            else if (number1 >15) {
                switch (number1 % 16) {
                    case 0: number1a= 0; break;
                    case 1: number1a= 1; break;
                    case 2: number1a= 2; break;
                    case 3: number1a= 3; break;
                    case 4: number1a= 4; break;
                    case 5: number1a= 5; break;
                    case 6: number1a= 6; break;
                    case 7: number1a= 7; break;
                    case 8: number1a= 8; break;
                    case 9: number1a= 9; break;
                    case 10: number1a= 'A'; break;
                    case 11: number1a= 'B'; break;
                    case 12: number1a= 'C'; break;
                    case 13: number1a= 'D'; break;
                    case 14: number1a= 'E'; break;
                    case 15: number1a= 'F'; break;
                }
                switch (number1 / 16) {
                    case 0: number1a= 0; break;
                    case 1: number1a= 1; break; //if 16 goes into the number once then number1a is 1
                    case 2: number1a= 2; break;
                    case 3: number1a= 3; break;
                    case 4: number1a= 4; break;
                    case 5: number1a= 5; break;
                    case 6: number1a= 6; break;
                    case 7: number1a= 7; break;
                    case 8: number1a= 8; break;
                    case 9: number1a= 9; break;
                    case 10: number1a= 'A'; break;
                    case 11: number1a= 'B'; break;
                    case 12: number1a= 'C'; break;
                    case 13: number1a= 'D'; break;
                    case 14: number1a= 'E'; break;
                    case 15: number1a= 'F'; break;
                }
            }
        
        }
        
            if (number2 < 10) { //if number one is less than 10 aka 0-9
                number2a= number1;
            }
            
            else if (number2 > 9 && number2 < 16) { //if number1 is greater than 9 and less than 16 aka 10-15
                switch (number2) {
                   case 10: number2a= 'A'; break; //number is 10 then number1a= A
                   case 11: number2a= 'B'; break;
                   case 12: number2a= 'C'; break;
                   case 13: number2a= 'D'; break;
                   case 14: number2a= 'E'; break;
                   case 15: number2a= 'F'; break;
                }
            }
            
            else if (number2 >15) {
                
                switch (number2 % 16) {
                    case 0: number2a= 0; break;
                    case 1: number2a= 1; break;
                    case 2: number2a= 2; break;
                    case 3: number2a= 3; break;
                    case 4: number2a= 4; break;
                    case 5: number2a= 5; break;
                    case 6: number2a= 6; break;
                    case 7: number2a= 7; break;
                    case 8: number2a= 8; break;
                    case 9: number2a= 9; break;
                    case 10: number2a= 'A'; break;
                    case 11: number2a= 'B'; break;
                    case 12: number2a= 'C'; break;
                    case 13: number2a= 'D'; break;
                    case 14: number2a= 'E'; break;
                    case 15: number2a= 'F'; break;
                }
                switch (number2 / 16) {
                    case 0: number2a= 0; break; 
                    case 1: number2a= 1; break; //if 16 goes into the number once then number1a is 1
                    case 2: number2a= 2; break;
                    case 3: number2a= 3; break;
                    case 4: number2a= 4; break;
                    case 5: number2a= 5; break;
                    case 6: number2a= 6; break;
                    case 7: number2a= 7; break;
                    case 8: number2a= 8; break;
                    case 9: number2a= 9; break;
                    case 10: number2a= 'A'; break;
                    case 11: number2a= 'B'; break;
                    case 12: number2a= 'C'; break;
                    case 13: number2a= 'D'; break;
                    case 14: number2a= 'E'; break;
                    case 15: number2a= 'F'; break;
                }
            }    
            
            if (number3 < 10) { //if number one is less than 10 aka 0-9
                number3a= number3;
            }
            
            else if (number3 > 9 && number3 < 16) { //if number1 is greater than 9 and less than 16 aka 10-15
                switch (number3) {
                   case 10: number3a= 'A'; break; //number is 10 then number1a= A
                   case 11: number3a= 'B'; break;
                   case 12: number3a= 'C'; break;
                   case 13: number3a= 'D'; break;
                   case 14: number3a= 'E'; break;
                   case 15: number3a= 'F'; break;
                }
            }
            
            else if (number3 >15) {
                switch (number3 % 16) {
                    case 0: number3a= 0; break;
                    case 1: number3a= 1; break;
                    case 2: number3a= 2; break;
                    case 3: number3a= 3; break;
                    case 4: number3a= 4; break;
                    case 5: number3a= 5; break;
                    case 6: number3a= 6; break;
                    case 7: number3a= 7; break;
                    case 8: number3a= 8; break;
                    case 9: number3a= 9; break;
                    case 10: number3a= 'A'; break;
                    case 11: number3a= 'B'; break;
                    case 12: number3a= 'C'; break;
                    case 13: number3a= 'D'; break;
                    case 14: number3a= 'E'; break;
                    case 15: number3a= 'F'; break;
                }
                switch (number3 / 16) {
                    case 0: number3a= 0; break;
                    case 1: number3a= 1; break; //if 16 goes into the number once then number1a is 1
                    case 2: number3a= 2; break;
                    case 3: number3a= 3; break;
                    case 4: number3a= 4; break;
                    case 5: number3a= 5; break;
                    case 6: number3a= 6; break;
                    case 7: number3a= 7; break;
                    case 8: number3a= 8; break;
                    case 9: number3a= 9; break;
                    case 10: number3a= 'A'; break;
                    case 11: number3a= 'B'; break;
                    case 12: number3a= 'C'; break;
                    case 13: number3a= 'D'; break;
                    case 14: number3a= 'E'; break;
                    case 15: number3a= 'F'; break;
                }
            }
    
        else { //input wasnt in range
            System.out.println("Enter a number between 0 and 255"); //tell not in range
            return; //exit
        }
    
        System.out.println("The decimal numbers R: " + number1 + " G: " + number2+ " B: " + number3 +
        " is represented in hexadecimal as: "+ number1a +number2a+ number3a);
        
        
        
    }
}