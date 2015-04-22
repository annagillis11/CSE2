// anna gillis hw 12 This homework gives you practice in manipulating multidimensional arrays, 
//and in writing methods that have array parameters april 21 2015



import java.util.Scanner;                                               //inport scanner

public class Multiply {
    
    public static void main(String [] args){
        
        Scanner input= new Scanner(System.in);                          //sets up scanner
        
        System.out.println("Enter width and height of first matrix");   //promt
        
        int width= input.nextInt();                                     //accept next int for width
            while (width <= 0){                                         //check if width is less than zero
                System.out.println("The number must be greater than zero");
                width= input.nextInt();                                 //reaccept next int for width
            }
        
        int height=input.nextInt();                                     // accept next int for height
            while (height <= 0){                                        //check if height is less than zero
                System.out.println("The number must be greater than zero");
                height= input.nextInt();                                //reaccept next int for height
            }
        
        System.out.println("Enter width and height of second matrix");  //promt
        
        int width2= input.nextInt();                                    //accept next int for width2
            while (width2 <= 0){                                        //check if width2 is less than zero
                System.out.println("The number must be greater than zero");
                width2= input.nextInt();                                //reaccept next int for width2
             }
        
        int height2= input.nextInt();                                   // accept next int for height2
            while (height2 <= 0){                                       //check if height2 is less than zero
                System.out.println("The number must be greater than zero");
                height2= input.nextInt();                               //reaccept next int for width
            }
            
        while (width != width2 || height != height2){                   //check matrices are equal dimensions
            System.out.println("These dimensions are not ocmpatible for matrix multiplication. Enter again");
            width= input.nextInt();                                     //accept next int for width
            height=input.nextInt();                                     // accept next int for height
            width2= input.nextInt();                                    //accept next int for width2
            height2= input.nextInt();                                   // accept next int for height2
        }
        
        int [][] matrix1= randomMatrix(height, width);                  //get matrix
        
        int [][] matrix2= randomMatrix(height2, width2);                //get another matrix
        
        int [][] matrix1times2= matrixMultiply(matrix1, matrix2);       //get new product matrix
        
        for(int row=0; row < matrix1.length; row++){
            for (int column=0; column< matrix1[row].length; column++){
                System.out.print(matrix1[row][column]+ " "); 
            }
            
            System.out.println(); 
        }                                                            //print out matrix 1
             
        System.out.println();
            
        for(int row=0; row < matrix2.length; row++){
            for (int column=0; column< matrix2[row].length; column++){
                System.out.print(matrix2[row][column]+ " "); 
            }
        
            System.out.println(); 
        }                                                           //print out matrix 2
            
        System.out.println();
            
        for(int row=0; row < matrix1times2.length; row++){
            for (int column=0; column< matrix1times2[row].length; column++){
                System.out.print(matrix1times2[row][column]+ " "); 
            }
            
            System.out.println(); 
        }                                                           //print out matrix 2
    }

    public static int [ ] [ ] randomMatrix(int height3, int width3){ //method to make array with random nums
        int [ ] [ ] matrix= new int [height3] [width3];             //initialze matrix
        
        for(int row=0; row < matrix.length; row++){
            for (int column=0; column< matrix[row].length; column++){
                matrix[row][column]= -10+ (int)(Math.random() * ((10- (-10))+ 1));
            }
        }                                                           //generete matrix with random number between -10 and 10 
        
        return matrix;                                          //put back in 
    }
    
    public static int [] [] matrixMultiply(int [] [] matrix1, int [] [] matrix2){ //method to multiply arrays accept matrix and matrix 1
        int rows1= matrix1.length;
        int columns1= matrix1[0].length;
        int rows2= matrix2.length;
        int columns2= matrix2[0].length;                        //getting lengths of rows and columns
        
        if (columns1 != rows2) {
            System.out.println("Number of columns in first matrix does not equal number of rows in second matrix");
            return null;                                        //check to make sure they are all equal
        }
        
        int [] [] newmatrix= new int [rows1][columns2]; 
        for (int i=0; i< rows1; i++) {                                   //row 1
            for (int j=0; j <columns2; j++) {                       // Column2
                for (int k=0; k <columns1; k++) {                   // column1
                newmatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }       
        }                                                               //multiplying the matrices toghether
    return newmatrix;
    }
    
    
}