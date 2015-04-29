//Anna gillis Hw13 manipulating multidimensional arrays, in writing methods that have array parameters, and in searching and sorting arrays.

import java.util.Scanner; //necessary to use scanner class
import java.util.Random; //random numbers 

//name class
public class FourDwin{
  
  //make main method
  public static void main (String[] args){
    
    // get x and y inputs
    Scanner myScanner = new Scanner (System.in); //tells it will take input
        System.out.println("Enter lengths X and Y, array will be between X and Y long");
        int X= myScanner.nextInt(); //int x
        int Y= myScanner.nextInt(); //int y
        
        //check if x is greater than y
        if (X >= Y){
            System.out.println("X must be greater than Y");
            return;
        }
        // get random numbers between x and y 
        int random= (int)(Math.random()*(Y+1)) + X;
        
        //new array1
        double [] array1= new double [random];
       
       //fill arrays with random doubles 
        for (int row=0; row < array1.length; row++){
                array1[row]= (double)(Math.random() * 30); 
        }
        
        //new array2
        double [] array2= new double [random];
       
       //fill arrays with random doubles 
        for (int row=0; row < array2.length; row++){
                array2[row]= (double)(Math.random() * 30); 
        }
        
        
        //new array
        double [][] array= new double [] [] {array1, array2};
        
        //fill arrays with random doubles 
        for (int row=0; row < array.length; row++){
            for (int column=0; column < array[row].length; column++) {
                array[row][column]= (double)(Math.random() * 30); 
            }
        }
        
        //print array
        for (int row= 0; row < array.length; row ++){
            System.out.print("{");
            for (int column=0; column < array[row].length; column++){
                System.out.print(array[row][column] + ", ");
            }
            System.out.print("}");
        }
        
        //new array1a
        double [] array1a= new double [random];
       
       //fill arrays with random doubles 
        for (int row=0; row < array1a.length; row++){
                array1a[row]= (double)(Math.random() * 30); 
        }
        
        //new array2a
        double [] array2a= new double [random];
       
       //fill arrays with random doubles 
        for (int row=0; row < array2a.length; row++){
                array2a[row]= (double)(Math.random() * 30); 
        }
        
        
        //new arraya
        double [][] arraya= new double [] [] {array1a, array2a};
        
        //fill arrays with random doubles 
        for (int row=0; row < arraya.length; row++){
            for (int column=0; column < arraya[row].length; column++) {
                arraya[row][column]= (double)(Math.random() * 30); 
            }
        }
        
        //print arraya
        for (int row= 0; row < arraya.length; row ++){
            System.out.print("{");
            for (int column=0; column < arraya[row].length; column++){
                System.out.print(arraya[row][column] + ", ");
            }
            System.out.print("}");
        }
        
        //new array 
        double [] [] [] array4= new double [] [] [] {array, arraya};
        
        //print array
        for (int row= 0; row < array4.length; row ++){
            System.out.print("{");
            for (int column=0; column < array4[row].length; column++){
                System.out.print("{");
                for( int j=0; j < array4[column].length; j++){
                System.out.print(array4[row][column][j] + ", ");
                }
            System.out.print("}");
            }
            System.out.print("}");
        }


    
  }
}