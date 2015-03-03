// anna gillis hw06 runfactorial

import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please enter an integer that is between 9 and 16:");
        
        int number= input.nextInt();
        int factorial= 1;
        
        while (number<9 || number>16) {
            System.out.println("Invalid input, enter again");
            number= input.nextInt();
        }
        
        int i=1;
        while (i <= number) {
            factorial *=i;
            i++;
        }
        
        System.out.println("Input accepted");
        System.out.println(number +"!= " +factorial);
        
    }
}