//anna gillis
//CSE 2
//Lab 10
// familiar with declaring, allocating and initializing one-dimensional arrays.

import java.util.Scanner;

public class Arrays{ //the class begins here
     
     public static void main(String[] args){ //the main method begins here
          //get size of array
          System.out.println("Enter length of array");
          int length= input();
        
          //make array with input values
          int [] myList= new int [length];
          System.out.println("Enter " + myList.length+ " values: ");
          for (int i=0; i< myList.length; i++)
               myList[i]= input();
               
          //print array
          for (int i=0; i<myList.length; i++)
               System.out.print(myList[i] + " ");
          
     }
     
     public static int input(){
          Scanner scan=new Scanner(System.in);
          int input2= scan.nextInt();
         
          if(scan.hasNextInt()) {
               input2 = scan.nextInt();
          }  
          else{
               System.out.println("Not an int. Enter again");
               input2= scan.nextInt();
          }
         
          if (input2 < 0){
               System.out.println("Enter a positive int");
               input2=scan.nextInt();
          }
          return input2;
     }
          
} //the class ends here