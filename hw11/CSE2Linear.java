// anna gillis hw11 april 14 2015


    import java.util.Scanner;
    
    public class CSE2Linear{
        
        public static void main(String [] args){
            
            int [] myList= new int [15]; //create array
            
            java.util.Scanner input= new java.util.Scanner(System.in);
            System.out.print("Enter " + myList.length + " values:");
            int num= 0; 
            for (int i=0; i< myList.length; i++) {
                int temp= num;
                num=input.nextInt();
                
                if (num < temp){
                    System.out.println ("Number not greater than or equal to last number");
                    return;                          //checks number is greater than or equal to last number
                }
                
                if (num > 100 || num < 0){
                    System.out.println("Number out of range");
                    return;                          //checks if between 0=100
                }
                
                if (num != (int)num){
                    System.out.println("Number is not an int");
                    return;                         //check if number is an int
                }
                
                myList[i]= num;           //initilize array with input values
            }
            
            
            System.out.print("The grades, sorted, are: ");
            for (int i=0; i < myList.length; i++) {
                System.out.print(myList[i] + " ");
            }                           //prints array
            System.out.println(" ");
            
            System.out.println("Enter a grade to search for");
            
            int entergrade = input.nextInt();
            int grade = binarySearch(myList, entergrade);
            
            if (grade == 8)
                System.out.println(entergrade+ " was found with no iterations");
            else if (grade == 4 || grade == 12)
                System.out.println(entergrade+ " was found with 1 iterations");
            else if (grade == 2 || grade == 6 || grade == 10 || grade == 14)
                System.out.println(entergrade+ " was found with 2 iterations");
            else 
                System.out.println(entergrade+ " was found with 3 iterations"); //checking for iterations
             
            if (grade < 0)
                System.out.println(entergrade+ " was not found with 4 iterations"); 
            
            int newmyList [];
            newmyList= shuffle(myList); //calling new methods
            
            System.out.println("Scrambled:");
            for (int i=0; i < newmyList.length; i++) {
                System.out.print(newmyList[i] + " ");
            }                                   //prints array
            System.out.println(" ");
            
            System.out.println("Enter a grade to search for");
            
            int entergrade2= input.nextInt();
            int grade2= linearSearch(newmyList, entergrade2); //calling new methods
            int grade3= grade2 + 1; 
            
            if (grade2 < 0)
                System.out.println(entergrade2 + " was not found with 16 iterations");
            else
                System.out.println(entergrade2 + " was found with "+ grade3 + " iterations"); //checking for iterations
            
            
        }
    
        public static int binarySearch( int[] myList, int key){
            int low= 0;
            int high= myList.length- 1;
            
            while (high >= low) {
                int mid = (low +high) / 2 ;
                if (key < myList [mid] )
                    high = mid - 1;
                else if (key == myList [mid])
                    return mid;
                else
                    low = mid + 1;
            }
            return -low - 1;  //binaray search 
        }
        
        public static int [] shuffle(int [] myList){
            for (int i= myList.length - 1; i >0; i--) {
                int j= (int)(Math.random() * (i + 1));
                int temp= myList[i];
                myList[i]= myList[j];
                myList[j]=temp;
            }
            return myList;  //scarmabeles list
        }
        
        public static int linearSearch( int[] newmyList, int key){
            for (int i= 0; i < newmyList.length; i++) {
                if (key == newmyList[i])
                    return i; //linear search
            }
            return -1;
        }
            
    }
        