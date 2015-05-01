// anna gillis lab 13

import java.util.Random; 

public class arrays{
    public static void main(String [] args){
        
        int [] [] raggedarray= new int [5][];
        raggedarray[0]= new int [5];
        raggedarray[1]= new int [8];
        raggedarray[2]= new int [11];
        raggedarray[3]= new int [14];
        raggedarray[4]= new int [17];
        
        for (int row=0; row < raggedarray.length; row ++){
            for (int column=0; column < raggedarray[row].length; column++){
                raggedarray[row][column]= (int)(Math.random()*39);
            }
        }
        
        for (int i = 0; i < raggedarray.length; i++) {
            for (int j = 0; j < raggedarray[i].length; j++) {
                System.out.print(raggedarray[i][j] + " ");
            }
            System.out.println();
        }
    
        
        
    }
}