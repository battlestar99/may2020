package ngScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicNg {
	
	
	

	int x; 
	
	
	@BeforeTest
	
	public void beforetest() {
		
		System.out.println("This is beforetest");
		
	}
	
	
	@Test (priority=1)
	
	public void validateBrowser() {
		
		System.out.println("This is Atest");
		Assert.assertEquals("Test", "Test12");
	}
	
	
	@Test(priority=4)
	public void validateUrl() {
		
		
		System.out.println("This is Btest");
		
		
		Assert.assertEquals(true, true);
		
		
		
	}
	
	@Test(priority=3)
	public void validateSignUP() {
		
		
		System.out.println("This is validatesignup");
		Assert.assertEquals(15, 15, "Testing validatesignip");
	}
	
	@Test(priority=2)
	public void validatedisplay() {
		
		
		System.out.println("This is validatedisplaye");
		Assert.assertTrue(true);
	}
	
	
@AfterTest
	
	public void aftertest() {
		
	
		System.out.println("afte test");
		
	}
	
	
	

}
