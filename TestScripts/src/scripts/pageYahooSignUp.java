package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageYahooSignUp {
	
	
	WebDriver driver;
	
	//int count;
	
	
	public pageYahooSignUp (WebDriver x) {
		
		driver = x; 
		
		
	}
	
	
	
	// for each webelement we should have one function 
	
	// 50 web elements = 50 functions 
	
	public WebElement getMonth() {
		
		
		return driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
		//WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
		//return x; 
		
	}
	
	public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.id("usernamereg-day"));
		return x; 
		
	}

	public WebElement getGender() {
	
	WebElement x = driver.findElement(By.id("usernamereg-freeformGender"));
	return x; 
	
}


	public WebElement getSignInlink() {
	
	WebElement signInLink= driver.findElement(By.linkText("Sign in"));
	return signInLink; 
	
}
	

}
