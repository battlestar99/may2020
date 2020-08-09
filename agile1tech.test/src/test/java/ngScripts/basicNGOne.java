package ngScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicNGOne {
	
	
	
	@BeforeTest
	public void bftest() {
		
		System.out.println("it is beforetest");
		
	}
	
	
	@BeforeMethod
	
	public void bformethod() {
		
		System.out.println("it is bforemethod");
		
	}
	
@AfterMethod
	
	public void afmethod() {
		
		System.out.println("it is aftermethod");
		
	}
	
	
	@Test(priority=1)
	public void validateTitle() {
		
		System.out.println("it is priority 1");
		
	}
	
	@Test(priority=2)
	
	public void validateUrl() {
		
		System.out.println("it is priority 2");
		
	}
	
	
	
	
	
	@AfterTest
	
	public void aftest() {
		
		System.out.println("it is aftertest");
		
	}
	
	
	
	
	

}
