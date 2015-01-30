// Anna Gillis
//CSE 2
//January 30
/*My bicycle cyclometer (meant to measure speed, distance, etc.)
records two kinds of data, the time elapsed in seconds, and the number of rotations
of the front wheel during that time. For two trips, given time and rotation count, this program should
a. print the number of minutes for each trip
b. print the number of counts for each tirp
c. print the distance of each trip in miles
d. print the distance for the two trips combined*/

//
public class Cyclometer {
    //main method required for every Java program
    public static void main (String [] args) {
        // our input data. document your variables by placing your // comemments after the "//". state the prupose of each variable.
        
        int secsTrip1=480; //480 seconds for trip 1 used to counts minutes
        int secsTrip2=3220; //3220 seconds for trip 2 used to counts minutes
        int countsTrip1=1561; //counts for trip 1 1561 aka the wheel went around 1561 times
        int countsTrip2=9037; //counts for trip 2 9037 aka the wheel went around 9037 times
        
        // our intermediate variables and output data. Document!
        double wheelDiameter=27.0, //size of the wheel
        PI=3.14159, //pi to calcualte distance
        feetPerMile=5280, //feet to calculate distance
        inchesPerFoot=12, //inches to calcuaate distance
        secondsPerMinute=60; //seconds to calcualate time
        double distanceTrip1, distanceTrip2,totalDistance; // calcualting distances
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
            //run the calculations; store the values. document your
            //calcuation here. What are you calculating? calculating the seconds in trip 1 divided by the number of seconds
            //in  aminute. this will give us the time trip 1 took. then when add the counts of
            //trip 1 to counts and find the total counts.
            //same for trip 2 but with trip 2 instead of trip 1
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count a roation of the wheel travels the diameter
        //in tinches times pi)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
            //print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" Miles");
    }  //end of main method
}  //end of class