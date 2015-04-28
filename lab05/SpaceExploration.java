// anna gillis
//lab 5 run switch statement
import java.util.Random; //random numbers 

public class SpaceExploration {
    
    public static void main(String [] args){
        int year= (int)(Math.random()*11) + 2000; //make random number between 2000 2010
        
        System.out.println("Here is a timeline of space exploration events from " +year + " to 2000");
       
        int number= year - 2000;
        System.out.println(number);
        
        while (number>=0){
            switch (number){
                case 0: System.out.println ("2000: First spacecraft orbits an asteriod"); break;
                case 1: System.out.println ("2001: First spacecraft lands on an asteriod");break;
                case 2: System.out.println ("2002: N/A");break;
                case 3: System.out.println ("2003: Largerst infared telescope release");break;
                case 4: System.out.println ("2004: N/A");break;
                case 5: System.out.println ("2005: Spacecraft collides with comet");break;
                case 6: System.out.println ("2006: Spacecraft returns with collections from a comet");break;
                case 7: System.out.println ("2007: N/A");break;
                case 8: System.out.println ("2008: Kepler launched to study deep space");break;
                case 9: System.out.println ("2009: N/A");break;
                case 10: System.out.println ("2010: SpaceX sucessfully sends spacecraft to orbit and back");break;
            }
            number= number - 1;
        }
        
    }
}