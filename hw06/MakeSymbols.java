// anna gillis hw 06 make ymbols

public class MakeSymbols {
    public static void main(String [] args){
        
        int number= (int)(Math.random() * 100);
 
 
        System.out.println(number);
        System.out.print("The output pattern:");
        
        int i=0;
        
        if (number%2 == 0) {
        
            do {
                System.out.print("*");
                i++;
            
            }
            while (i<number);
        }
        
        else {
            do {
                System.out.print("&");
                i++;
            
            }
            while (i<number);
        }
        
        System.out.println(" ");
        
        
    }
}