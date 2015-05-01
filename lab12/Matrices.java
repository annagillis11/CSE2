// anna gillis lab 12 implemetnting matrices


import java.util.Scanner;

public class Matrices {
    
    public static void main(String [] args){
        
        int [][] matrix= increasingMatrix(); //get array
        
        for(int row=0; row < matrix.length; row++){
            for (int column=0; column< matrix[row].length; column++){
               System.out.print(matrix[row][column]+ " "); 
            }
            
            System.out.println(); 
        } //print out matrix
    }
    
    public static int [ ] [ ] increasingMatrix(){
        Scanner input= new Scanner(System.in); //sets up scanner
        
        System.out.println("Enter width"); //ppromt
        int width= input.nextInt(); //accept next int
        
        System.out.println("Enter height");  //promt
        int height= input.nextInt();  // accept next int
        
        System.out.println("Enter true for row-major representation, false for column-major"); //promt
        boolean format= input.nextBoolean();
        
        int [ ] [ ] matrix= new int [height] [width]; //initialze matrix
        int number= 0; 
        
        if (format== true){
            for(int row=0; row < matrix.length; row++){
                for (int column=0; column< matrix[row].length; column++){
                     matrix[row][column]= number++;
                }
            } //increase each element of matrix by 1
        } //format row-major representation 
        
        else {
            for (int column=0; column< matrix[width].length; column++){
                for(int row=0; row < matrix[column].length; row++){
                     matrix[column][row]= number++;
                }
            } //increase each element of matrix by 1
        }
       
       return matrix;          
    }
    
    
}
