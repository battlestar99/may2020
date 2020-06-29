package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	WebDriver driver; 
	
	public homePage(WebDriver x) {
		
		driver=x;
		
	}
	
	
	
	public WebElement getMessangerLink() {
		
		WebElement messanger = driver.findElement(By.linkText("Messenger")); 
		return messanger; 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
