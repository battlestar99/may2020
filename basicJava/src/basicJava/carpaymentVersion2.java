package basicJava;

import java.util.Scanner;

public class carpaymentVersion2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base car price");
		double carprice = sc.nextDouble(); 
		
		System.out.println("Enter the downpayment");
	    double downpayment = sc.nextDouble(); 
		
	    System.out.println("Enter the admin fee");
		double adminfee = sc.nextDouble();  
		
		System.out.println("Do you want to get warrenty?");
		
		boolean iswarrenty = sc.nextBoolean();
		
	
		double warrenty = 1200;  
		
		double TaxRate = 5;  
		double apr = 4;  
		
		System.out.println("Enter number of installment");
		int numberofInstallment = sc.nextInt();  
		
		
		double finalcarprice; 
		double carpriceWithInterest;
		double carpricewithTax; 
		
		
		if(iswarrenty) {
			
			finalcarprice = (carprice-downpayment) + adminfee + warrenty; 
			
		}
		
		else {
			
			
			finalcarprice = (carprice-downpayment) + adminfee; 
		}
		
		
		
		
		
		
		
		
		
		
		//System.out.println("Final car price");
		//System.out.println(finalcarprice);
		
		carpriceWithInterest = finalcarprice + finalcarprice*(apr/100);
		//System.out.println("car price with interest");
		//System.out.println(carpriceWithInterest);
		
		carpricewithTax = carpriceWithInterest+carpriceWithInterest*(TaxRate/100);
		
		//System.out.println("car price with tax");
		//System.out.println(carpricewithTax);
		
		double monthlyPayment; 
		
		
		monthlyPayment=carpricewithTax/numberofInstallment;
		
		System.out.println("monthly installment of the car");
		System.out.println(monthlyPayment);
		

	}

}
