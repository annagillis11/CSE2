// anna gillis lab 11


import java.util.Random; 
import java.util.Scanner;

public class Arrays{
    
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in); //sets up scanner
        
        int [] array1= new int [50];
        int [] array2= new int [50];
        
        for (int i=0; i <array1.length; i++){
            array1[i]= (int)(Math.random()*100);
        }
        
        int max= array1 [0];
        for (int i=1; i <array1.length; i++){
            if (array1[i]> max) max= array1[i];
        }
        
        System.out.println("The maximum of array1 is:" + max);
        
        int min= array1[0];
        for (int i=1; i< array1.length; i++){
            if (array1[i]< min) min = array1[i];
        }
        
        System.out.println("The minimum of array1 is:" + min);
        
        array2[0]= (int)(Math.random()*100);
        
        for (int i=1; i<array2.length; i++){
            array2[i]=(int)(Math.random()*10000);
            while (array2[i]< array2[i- 1]){
                array2[i]=(int)(Math.random()*10000);
            }
        }
        
        int max2= array2 [0];
        for (int i=1; i <array2.length; i++){
            if (array2[i]> max2) max2= array2[i];
        }
        
        System.out.println("The maximum of array2 is:" + max2);
        
        int min2= array2[0];
        for (int i=1; i< array2.length; i++){
            if (array2[i]< min2) min2 = array2[i];
        }
        
        System.out.println("The minimum of array2 is:" + min2);
        
        System.out.println("Enter an interger >= 0");
        
        int number=scan.nextInt();
        
        if (number < 0){
            System.out.println("the number must be >= 0");
            number= scan.nextInt();
        }
        
        int result= binarysearch(array2, number);
        
        if (result>=0)
            System.out.println("Result was found");
       
        if(result<0) {
            System.out.println("Result was not found");
            int above= array2[result + 1];
            System.out.println("the number above was" + above);
            int below= array2[result - 1];
            System.out.println("the number below was" + below);
        }
        
    
    }
    
    public static int binarysearch(int [] array2, int key){
        
        int low= 0;
        int high= array2.length - 1;
        
        while (high>= low){
            int mid= (low + high)/2;
            if (key < array2 [mid])
            high= mid - 1;
            else if (key == array2 [mid])
                return mid;
            else
                low = mid+ 1;
        }
        return -low - 1; 
    }
    
}