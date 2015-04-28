//Anna gillis Hw13 manipulating multidimensional arrays, in writing methods that have array parameters, and in searching and sorting arrays.

import java.util.Scanner; //necessary to use scanner class

//name class
public class FourDwin{
  
  //make main method
  public static void main (String[] args){
    
    //make four dimensional array
    double [][][][] testArray = new double [3][][][];
    
    //fill the first dimension
    for ( int i = 0; i<3; i++){
      
        Scanner myScanner = new Scanner (System.in); //tells it will take input
        System.out.println("Enter lengths X and Y, array will be between X and Y long");
        double X= myScanner.nextDouble(); //int x
        double Y= myScanner.nextDouble(); //int y
        //check if x is greater than y
        if (X >= Y){
            System.out.println("X must be greater than Y");
            return;
        }
        
        //fill the second dimension with a for loop using x and y 
        for ( int j = 0; j< Y- 1;j++){
          
            // new x and y for third dimension
            System.out.println("Enter lengths X and Y, array will be between X and Y long");
            double Xa= myScanner.nextDouble(); //int x
            double Ya= myScanner.nextDouble(); //int y
            //check if x is greater than y
            if (Xa >= Ya){
                System.out.println("X must be greater than Y");
                return;
            }
        
            //for loop to fill the third dimension
            for ( int k = 0; k<Ya- 1; k++){
          
            System.out.println("Enter lengths X and Y, array will be between X and Y long");
            double Xb= myScanner.nextDouble(); //int x
            double Yb= myScanner.nextDouble(); //int y
            //check if x is greater than y
            if (Xb >= Yb){
                System.out.println("X must be greater than Y");
                return;
            }
            
                //for loop to fill the fourth dimension
                for (int l= 0; l < Yb- 1; l++){
                //set the array equal to random numbers between 0.0 and 30
                 testArray[i][j][k][l] = Math.random() * 30;
                }
            }
        }
    }
    
    //print out all of the elements of teh three dimensional array
    for ( int i = 0; i<5; i++){
        for ( int j = 0; j<4;j++){
            for( int k = 0; k<3; k++){
                System.out.print(testArray[i][j][k][0]);
                System.out.print(" , ");
            }
        }
    }

    
  }
}