//anna gillis
//hw 06 get integers

import java.util.Scanner;

public class GetIntegers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please enter 5 non-negative integers:");
        int number=0;  
        int sum= 0; //initliaze sum
        int i=0; 
        
        
        
        for (i=0; i<5; i++) { //for i starting at 0 to i = 5 add one to i
            number= input.nextInt (); //reenter a number
                if (number<0){ //if number is less than 0 print
                    System.out.println("Invalid input, enter again");
                }
            sum += number; //do this every time 5 times 
        }
        
        System.out.println("Sum is" + sum); 
        
        
    }
}