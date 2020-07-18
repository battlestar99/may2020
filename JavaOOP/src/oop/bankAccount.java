package oop;

public class bankAccount {
	
	// global variable, properties, attributes of the class 
	
	String emailaddress;
	String firstName; 
	String lastName; 
	int amountOfMoney; 
	String accountNumber; 
	static int numberofAccount;
	
	// constructor overloading 
	

	  public bankAccount() {
	 
	  System.out.println("Constructor is getting executed");
	  
	 }
	 
	public bankAccount(String accountNumber) {
		
		
		this.accountNumber=accountNumber; 
		System.out.println("2nd Constructor is getting executed");
		
	}
	
	/*
	 * public bankAccount(int x) {
	 * 
	 * System.out.println("3rd Constructor is getting executed");
	 * 
	 * }
	 */
	
	
	
	public static void resetAccount() {
		
		System.out.println("resetting account");	
	
		
	}
	
	// functiona overloading or method overaloading 
	
	public void deposit() {
		
		// local variable is only avialable within the function 
		
		String emailaddress = "test@email.com";
		this.emailaddress = "test@gmail.com";
		System.out.println("Deposit some money");
		
	}
	
	
	public int deposit(int x) {
		
		System.out.println("Deposit some money with input");
		
		return 10; 
	}
	
	public void withdraw() {
		
		System.out.println("withdrawing some money");
		
	} 
	
	
	
	
	
	
	
	

}
