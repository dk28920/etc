import java.util.Scanner;
public class vendingm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double count;
	     double total = 0;                                      
	     	int item;                                          
	     
		  
		    
	     Scanner input = new Scanner(System.in);
	     System.out.printf("Welcome to Dongho's Vending Machine!\n");
	     System.out.printf("1. Sprite%17s\n","$1.50");
	     System.out.printf("2. Diet Coke%14s\n","$1.50");   
	     System.out.printf("3. Zero Coke%14s\n","$1.50");
	     System.out.printf("4. Coke%19s\n","$1.50");
	     System.out.printf("5. Water%19s\n","$2.00\n");
	     System.out.println("We take coins, and  ONLY $1 and $5 bills.");
	     System.out.println("(Press 0 to Exit and select our product.)");
	     
	
	  do{
	         count = input.nextDouble();
	         total += count;
	 
	         if(count >= 0.01 && total <5){
	            System.out.printf("You just Entered Amount of: $%.2f\n You can enter more money."+"\n (Press 0 to Exit and select our product.)\n" , total);            
	        }
	         else if(count > 5){ 
	        	 
	                System.out.println("Please Enter Up To $5.00 ONLY!!!"+"\n We just return your money. Please re-enter money correctly.  ");
	                total = 0;
	         }
	         	
	         else
	             break;
	        }
	            while(count!=0 || count <= 5);               
	  
	  do{       
	         System.out.println("Please Enter Item Number (or Press 0 to exit):\t");      
	         item = input.nextInt();                                    
	 
	         switch(item){                 
	             case 1: total -= 1.50;
	             if (total <0){
	            	 total += 1.50;
	            	 System.out.printf("Sorry, insufficient fund to get this product.");}
	             else System.out.printf("%s%.2f\n","Amount remaining: $" , total); 
	                break;
	             case 2: total -= 1.50;
	             if (total <0){
	            	 total += 1.50;
	            	 System.out.printf("Sorry, insufficient fund to get this product.");}
	             else 
	                System.out.printf("Amount remaining: $%.2f\n" , total);  
	                break;               
	             case 3: total -= 1.50;
	             if (total <0){
	            	 total += 1.50;
	            	 System.out.printf("Sorry, insufficient fund to get this product.");}
	             else 
	                System.out.printf("Amount remaining: $%.2f\n" , total);                 
	                break;
	             case 4: total -= 1.50;
	             if (total <0){
	            	 total += 1.50;
	            	 System.out.printf("Sorry, insufficient fund to get this product.");}
	             else 
	                System.out.printf("Amount remaining: $%.2f\n" , total);  
	                break;
	             case 5: total -= 2.00;
	             if (total <0){
	            	 total += 2.00;
	            	 System.out.printf("Sorry, insufficient fund to get this product.");}
	             else 
	                System.out.printf("Amount remaining: $%.2f\n" , total);  
	                break;
	             case 0: System.out.println();
	                 break;
	         }
	     }
	             while(item!=0 && total > 0);                  
	 
	           System.out.printf("Change: $%.2f\n\n" , total);
	             
	           System.out.println("Thank you for buying our product. Have a nice day!");
	          
	          
	             
	        
	}

}
