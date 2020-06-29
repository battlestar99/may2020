package learningFunction;

public class home {
	
	
	// constructor overloading 
	public String address; 
	
	public home(String x) {
		
		address = x; 
	}
	

	
	public home(int x) {
		
		
		System.out.println(x);
		System.out.println("An object is created");
		
	}

	
	public home() {
		
		System.out.println("No input constructor");
		
	}
	
	
	// functions , properties 
	
	
	public void opendoor() {
		
		System.out.println("The door is opening");
		
	}
	
	
	public static void closedoor() {
		
		System.out.println("The door is opening");
		
	}

}
