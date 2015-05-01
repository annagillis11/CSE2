// anna gillis lab 07 write while loops and use a break statement. 


import java.util.Scanner; 

public class Zigzag{
   
    public static void main(String [] args){
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter an int between 3 and 33");
        int number= scan.nextInt();
        
        if (number > 33 || number < 3){
            System.out.println("Not between 3 and 33. Re-enter");
            number= scan.nextInt();
        }
        
        int nStars= number;
        
        for (int j= 1; j< number+ 1; j++ )
            System.out.print("*");
            
        System.out.println();  
        
        for (int x=1; x < nStars; x++){
            for (int y=0; y< x; y ++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int j= 1; j< number+ 1; j++ )
            System.out.print("*");
            
        System.out.println();
        
     
    
}
}