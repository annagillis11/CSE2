//anna gillis hw 08 game

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    public static String getInput(Scanner scan, String string){
        string= input.nextString (); //accepts string as input
        if (string != 'c' && string != 'C'){ //if string does not equal c and does not equal C
            System.out.println("Yea right LOSER!"); //print yea right
            System.exit(0); //maybe wrong //quit
        }
    }
    
    public static String getInput(Scanner scan, String string, int trial){
        scan= new Scanner(System.in); //possible add scanner //adds new scanner
        string= input.nextString(); //accepts string as input
        trial= 0;
        int hits= (int)(Math.random()*10);
        
        if (string != 'A' && string != 'a' && string != 'B' && string != 'b'){
            System.out.println ("Executed by the GIANT! Game Over!");
        }
        
        if (string = 'a' || string = 'A'){
            if (hits<5){
                System.out.println("Critical hit!");
            }
            else 
                System.out.println("Miss! U R A Loser!");
        }
        
        while (trial<10){
                if (hits<5) {
                    trial= trial++;
                }
        }
        
        if (string = 'e' || string = 'E'){
            int escape= (int)(Math.random()*10);
            if (escape<5){
                System.out.println("You escaped!");
                break;
            }
            else 
                System.out.println("You didn't escape! Fight again!");
        }
        
    }
    
    public static String getInput(Scanner scan){
        scan= new Scanner(System.in); //adds new scanner
        int box= input.nextInt(); //accepts input
        switch (box) {
            case 1: System.out.println("You have recieved an A in CSE002!"); break;
            case 2: System.out.println("You have recieved a peanut!"); break;
            case 3: System.out.println("You have recieved a sword"); break;
            default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL"); break;
        }
    }
   
   
   
   
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
     public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
}
    