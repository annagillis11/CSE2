// anna gillis lab 06 generate smiles april 17 2015


public class SmileGenerator{
    
    public static void main(String [] args){
        
        String smile= ":)";
        for (int i=0; i<5; i++)
            System.out.print(smile);
            
        System.out.println(" ");
        
        int random= (int) Math.floor(Math.random()*101); 
        for (int i=0; i< random; i++)
            System.out.print(smile);
            
        
    }
}