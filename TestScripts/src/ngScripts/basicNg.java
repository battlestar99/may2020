package ngScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicNg {
	
	
	

	int x; 
	
	
	@BeforeTest
	
	public void beforetest() {
		
		x=12;
		
	}
	
	@Test
	
	public void atest() {
		
		System.out.println(x);
	}
	
	
@AfterTest
	
	public void aftertest() {
		
	
		System.out.println("afte test");
		
	}
	
	
	

}
