// Anna Gillis
//CSE 2
//Feburary 2
/*You go shopping at Walmart’s and want to compute the cost of the items you 
bought, including the PA sales tax of 6%.*/

//
public class Arithmetic {
    //main method required for every Java program
    public static void main (String [] args) {
        // our input data. document your variables by placing your // comemments 
        //after the "//". state the prupose of each variable.
        
    //number of pairs of socks
    int nSocks=3;
    //cost per pair of socks
    //('$'is part of the variable name)
    double sockCost$=2.58;
    
    //number of drinking glasses
    int nGlasses=6;
    //cost per glass
    double glassCost$=2.29;
    
    //number of boxes of envelopes
    int nEnvelopes=1;
    //cost perbox of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    double totalSockCost$; //total cost of socks
    double totalGlassCost$; //total cost of glasses
    double totalEnvelopeCost$; //total cost of envelopes
    double totalPurchaseCostBeforeTax$; //total cost before tax
    double totaltax$;// total tax
    double totalPurchaseCostWithTax$; //total cost with tax
    
    System.out.println("You bought"+ 
        (nSocks)+ "socks for"+ 
        (sockCost$)+ "each");//item bought and how many
    System.out.println("You spent"+
        (sockCost$*nSocks)+"with a tax of"+
        ((sockCost$*nSocks)*taxPercent)); //calculate the cost of socks times the number 
        //of socks and print the cost and the tax
    
    System.out.println("You bought"+ 
        (nGlasses)+ "glasses for"+ 
        (glassCost$)+ "each");//item bought and how many
    System.out.println("You spent"+
        (glassCost$*nGlasses)+"with a tax of"+
        ((glassCost$*nGlasses)*taxPercent)); //calculate the cost of glasses times the number 
        //of glasses and print the cost and the tax
        
    System.out.println("You bought"+ 
        (nEnvelopes)+ "envelopes for"+ 
        (envelopeCost$)+ "each");//item bought and how many
    System.out.println("You spent"+
        (envelopeCost$*nEnvelopes)+"with a tax of"+
        ((envelopeCost$*nEnvelopes)*taxPercent)); //calculate the cost of envelopes times the number 
        //of envelopes and print the cost and the tax
        
    totalSockCost$=nSocks*sockCost$; //calculate total sock cost
    totalGlassCost$=nGlasses*glassCost$; //clalcuate total gasses cost
    totalEnvelopeCost$=nEnvelopes*envelopeCost$; //calc total envelope cost
    totalPurchaseCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; 
    //calculate total purchase before tax
    totaltax$=totalPurchaseCostBeforeTax$*taxPercent; //clacl total tax
    totalPurchaseCostWithTax$=totaltax$+totalPurchaseCostBeforeTax$;
    //tax plus before tax
    
    System.out.println("Total sock cost was" +(totalSockCost$)); //print sock cost
    System.out.println("Total glasses cost was" +(totalGlassCost$)); //print glasses cost
    System.out.println("Total envelope cost was" +(totalEnvelopeCost$)); 
    //print envelope cost
    System.out.println("Total cost before tax was" +(totalPurchaseCostBeforeTax$)); 
    //print cost before tax cost
    System.out.println("Total tax was" +(totaltax$)); //print tax
    System.out.println("Total cost with tax was" +(totalPurchaseCostWithTax$)); 
    //print cost with tax
    }
}