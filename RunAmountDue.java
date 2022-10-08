
package amount_due;

import java.util.*;

class AmountDue{
    
    public double ComputeAmountDue(double Price){
       double Percent = Price * 0.12;
       double TotalDue = Price + Percent;
       return TotalDue;
    }
    
    public double ComputeAmountDue(double Price, int Quantity){
        double Percent = Price * Quantity * 0.12;
        double TotalDue = Price * Quantity + Percent;
        return TotalDue;
        
    }
    
    public double ComputeAmountDue(double Price, int Quantity, double Discount){
        double Percent = Price * 0.12;
        double TotalDue = Percent + (Price * Quantity) - Discount;
        return TotalDue;
    }
   
}

public class RunAmountDue {
	public static void main(String[] args) {
		AmountDue due = new AmountDue();
		Scanner scn = new Scanner(System.in);
                
		  System.out.println("Choose one number");
		System.out.println("1 - Price only");
		System.out.println("2 - Price and quantity");
		System.out.println("3 - Price, quantity and amount discount");
		System.out.println("---------------------");
		int num = scn.nextInt();
                
		boolean IsTrue = true;
		
            
                    switch(num){
                    case 1: 
                       
		    System.out.print("Enter the price of the item: ");
		    double FirstPrice = scn.nextDouble();
		    due.ComputeAmountDue(FirstPrice);
		    double FirstTotalDue = due.ComputeAmountDue(FirstPrice);
		    System.out.println("Amount Due is: " + FirstTotalDue);
                    break;
                    
                    case 2:
                       
		    System.out.print("Enter the price of the item: ");
		    double SecondPrice = scn.nextDouble();
		    System.out.print("Enter the quantity of the item: ");
		    int SecondQuantity = scn.nextInt();
		    due.ComputeAmountDue(SecondPrice, SecondQuantity);
		    double SecondTotalDue = due.ComputeAmountDue(SecondPrice, SecondQuantity);
		    System.out.println("Amount due is: " + SecondTotalDue);
                    break;
                    
                    case 3:  
                       
		    System.out.print("Enter the price of the item: ");
		    double ThirdPrice = scn.nextDouble();
		    System.out.print("Enter the quantity of the item: ");
		    int ThirdQuantity = scn.nextInt();
		    System.out.print("Enter discount amount: ");
		    double ThirdDiscount = scn.nextDouble();
		    
		    double ThirdTotalDue = due.ComputeAmountDue(ThirdPrice, ThirdQuantity, ThirdDiscount);
		    due.ComputeAmountDue(ThirdPrice, ThirdQuantity, ThirdDiscount);
		    System.out.println("Amount due is: " +ThirdTotalDue);
                    break;
                    
                    default: 
                        System.out.println("Enter 1-3 only");
                        
		    
                }
               
	}
}