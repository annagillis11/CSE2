//anna gillis
//hw03 bicicycle
//calculate distance

import java.util.Scanner; //necessary to use scanner class

public class Bicycle {
        //main method required for ever java program
        public static void main(String[ ] args) {
            
            Scanner myScanner; //decalre instance of scanner object
            myScanner = new Scanner (System.in); //tells it will take input
            
            System.out.print (
                "Enter the number of seconds (an integer >0) : "); //prompt 
                int nSeconds = myScanner.nextInt ();    //accept user input
            
            System.out.print (
                "Enter the number of counts (an integer >0) : "); //prompt user
                int nCounts = myScanner.nextInt ();    //accept user input
            
                
                 // our intermediate variables and output data. Document!
            double wheelDiameter=27.0, //size of the wheel
            PI=3.14159, //pi to calcualte distance
            feetPerMile=5280, //feet to calculate distance
            inchesPerFoot=12, //inches to calcuaate distance
            secondsPerMinute=60; //seconds to calcualate time
            double totaltime, mph, distanceTrip1, distanceTrip1inch; // calcualting distances
        
        distanceTrip1inch=nCounts*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count a roation of the wheel travels the diameter
        //in tinches times pi)
        distanceTrip1=(distanceTrip1inch/inchesPerFoot)/feetPerMile; //gives distance in miles
        totaltime=nSeconds/secondsPerMinute;
        mph=distanceTrip1/(totaltime/60); 
        
            //print out the output data
        System.out.println("The distance was "+distanceTrip1+" miles and took " +
            totaltime+" minutes.");
        System.out.println("The average mph was "+mph);
        
        
        }
        
}