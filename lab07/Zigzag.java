// anna gillis lab 07 write while loops and use a break statement. 

public class Zigzag{
   
    public static void main(String [] args){
        
        int nStars= 10;
        int i=0;
        int k=0;
        int j=1;
        
        while (i!= nStars){
            while (k!= j){
                System.out.print(" ");
                k++;
            }
            System.out.println("*");
            i++;
        }
        
        
        
        
    }
    
}