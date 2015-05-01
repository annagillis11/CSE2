// anna gillis lab 06 generate smiles april 17 2015

import java.util.Random; //random numbers 

public class SmileGenerator{
    
    public static void main(String [] args){
        
        int i=0; 
        String smile= ":)";
        
        for (i=0; i<5; i++)
            System.out.print(smile);
            
        System.out.println();
        
        while (i<5){
            System.out.print(smile);
            i++;
        }
        
        System.out.println();
        
        int random= (int) Math.floor(Math.random()*101); 
        int k=0;
        
        for (int j=0; j< random; j++){
            System.out.print(smile);
            k++; 
            while (k==30){
                System.out.println();
                k=0;
            }
        }
            
        System.out.println();
        
        //int random2= (int) Math.floor(Math.random()*101); 
        //int num=0;
        //int g= 1; 
        
       // while (g<random){
        //    System.out.print(smile);
         //   num++; 
        //    if (num > k){
       //         System.out.println();
       //         g++;
       //     }
       // }
        
        int smiles = 1; // first row has one smile
        int rows=6; 
        
        for(int p = 0; p < rows; p++){

        for(int j= smiles; j>0; j--){ //this one prints smiles
           System.out.print(":)");
        }
        System.out.println(); //go to new row
        smiles += 1; // increase amount of smiles
        }
    
            
        
    }
}