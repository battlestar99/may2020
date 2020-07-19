package oop;

public class runTest12 {

	public static void main(String[] args) {
		
		
		int x = 10; 
		
		int y = 0; 
		
		
		int div; 
		div = 1;
		
		System.out.println("before  the exception");
		
		try {
		div = x/y; 
		}
		
		catch(ArithmeticException e){
			
		System.out.println(e.getMessage());	
			
		}
		
		finally {
			
			System.out.println("Enter an accpetable value");	
		}
		
		System.out.println(div);
		
		System.out.println("after the exception");

	}

}
