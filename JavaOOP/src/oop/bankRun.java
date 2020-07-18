package oop;

public class bankRun {

	public static void main(String[] args) {
		
		bankAccount john = new bankAccount("john");
		
		bankAccount Michael;
		
		Michael = new bankAccount("john");
		
		john.firstName="John";
		
		System.out.println(Michael.firstName);
		
		Michael.firstName="Michael";
		
		Michael.deposit();
		
		System.out.println(Michael.emailaddress);
		
		
		bankAccount.resetAccount();
		
		bankAccount.numberofAccount=1000;
		

	}

}
