// anna gillis hw06 runfactorial

import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please enter an integer that is between 9 and 16:");
        
        int number= input.nextInt();
        int factorial= 1; //intilize not at 0
        
        while (number<9 || number>16) { //while number is less than 9 or greater than 16
            System.out.println("Invalid input, enter again");
            number= input.nextInt(); //then accept next number
        }
        
        int i=1; 
        while (i <= number) { //while i is less than or equal to the number
            factorial *=i; //times is in increments
            i++;
        }
        
        System.out.println("Input accepted");
        System.out.println(number +"!= " +factorial);
        
    }
}