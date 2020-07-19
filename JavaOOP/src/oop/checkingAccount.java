package oop;

public class checkingAccount extends bankAccount {
	
	
	
	
	
	public void getCheckingaccount() {
		
		System.out.println("get checking account");
		
	}
	
	
	public void deposit() {
		
		super.deposit();
		System.out.println("depositing checking account");
		
	}

}
