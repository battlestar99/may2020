package learningFunction;

public class runClass {

	public static void main(String[] args) {
	
		
		// to use a function, we need to create an object of the class 
		
	
		functionClass fc = new functionClass();
		
		testClass tc = new testClass(); 
		
		tc.getdata(12, 12.12);
		
		System.out.println("The value of x");
		int x = fc.addnumbers(12, 34);
		
		System.out.println(x);
		
		int y = fc.addnumbers(100, 200);
		
		System.out.println("The value of y");
		System.out.println(y);
		
		int z = fc.subtractNumbers(100, 90);
		System.out.println("The value of z");
		System.out.println(z);

	}

}
