// anna gillis hw10 april 7 2015


    import java.util.Scanner;
    
    public class RemoveElements{
  
        public static void main(String [] arg){
    	    Scanner scan=new Scanner(System.in);
            int num[]=new int[10];
            int newArray1[];
            int newArray2[];
            int index,target;
        	String answer="";
    	    do{
            	System.out.print("Random input 10 ints [0-9]");
      	        num = randomInput();
      	        String out = "The original array is:";
      	        out += listArray(num);
      	        System.out.println(out);
     
              	System.out.print("Enter the index ");
              	index = scan.nextInt();
              	newArray1 = delete(num,index);
              	String out1="The output array is ";
              	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
              	System.out.println(out1);
     
                System.out.print("Enter the target value ");
              	target = scan.nextInt();
              	newArray2 = remove(num,target);
              	String out2="The output array is ";
              	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
              	System.out.println(out2);
              	 
      	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            	answer=scan.next();
            	}while(answer.equals("Y") || answer.equals("y"));
             }
     
         public static String listArray(int num[]){
        	String out="{";
            for(int j=0;j<num.length;j++){
              	if(j>0){
                	out+=", ";
              	}
                 out+=num[j];
            	}
            out+="} ";
            return out;
        }
        
        public static int[] randomInput(){
            int [] myList= new int[10];
            for (int i= 0; i< myList.length; i++) {
                myList[i]= (int)Math.random()*10;
            }
            return myList;
        }
        
        public static int [] delete(int[] list, int pos){
            int index = pos;
            if (pos < list.length){
                for (int c= pos; c< list.length- 1;  c++){
                    list [c]= list[c+1];
                }
                
            }
            else {
                System.out.println("Number bigger than list length");
            }
            return list;
        }
        
        public static int [] remove( int [] list, int target){
            int key=target;
            for (int i=0; i< list.length; i++){
                if (key==list[i])
                    list[i]=list[i-1];
            }
            return list; 
        }
}
