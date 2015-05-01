// anna gilis lab 09 methods 


import java.util.Random; //random int

public class Methods{
    
    public static void main(String [] args){
        String adjective= adjectives();
        String adjective2= adjectives();
        String adjective3= adjectives();
        String subject= subject();
        String verb= verbs();
        String object= object();
        
        System.out.print("The " + adjective+ " " + adjective2+ " "+ subject+ " " + verb + " the " + adjective3+ " " + object);
    }
    
    public static String adjectives(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String adj= "No"; 
        
        switch (randomInt){
            case 0: adj= "happy"; break;
            case 1: adj= "sad"; break;
            case 2: adj= "slow"; break;
            case 3: adj= "wet"; break;
            case 4: adj= "dry"; break;
            case 5: adj= "stupid"; break;
            case 6: adj= "fat"; break;
            case 7: adj= "dumb"; break;
            case 8: adj= "quick"; break;
            case 9: adj= "yellow"; break;
        }
        return adj; 
    }
    
    public static String subject(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String subj= "No"; 
        
        switch (randomInt){
            case 0: subj= "cat"; break;
            case 1: subj= "dog"; break;
            case 2: subj= "wagon"; break;
            case 3: subj= "cook"; break;
            case 4: subj= "lady"; break;
            case 5: subj= "whale"; break;
            case 6: subj= "bunny"; break;
            case 7: subj= "king"; break;
            case 8: subj= "person"; break;
            case 9: subj= "teacher"; break;
        }
        return subj; 
    }
    
    public static String verbs(){Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String verb= "No"; 
        
        switch (randomInt){
            case 0: verb= "talked to"; break;
            case 1: verb= "walked"; break;
            case 2: verb= "slapped"; break;
            case 3: verb= "fell on"; break;
            case 4: verb= "tripped"; break;
            case 5: verb= "cried to"; break;
            case 6: verb= "sang about"; break;
            case 7: verb= "laughed at"; break;
            case 8: verb= "dropped"; break;
            case 9: verb= "yelled at"; break;
        }
        return verb; 
    }
    
    public static String object(){Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String obj= "No"; 
        
        switch (randomInt){
            case 0: obj= "cat"; break;
            case 1: obj= "dog"; break;
            case 2: obj= "wagon"; break;
            case 3: obj= "cook"; break;
            case 4: obj= "lady"; break;
            case 5: obj= "whale"; break;
            case 6: obj= "bunny"; break;
            case 7: obj= "queen"; break;
            case 8: obj= "person"; break;
            case 9: obj= "teacher"; break;
        }
        return obj; 
    }
}