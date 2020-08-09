package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class messangerPage {
	

WebDriver driver; 
	
	public messangerPage(WebDriver x) {
		
		driver=x;
		
	}
	
	
public WebElement getroomsmenua() {
		
		WebElement messanger = driver.findElement(By.linkText("Rooms")); 
		return messanger; 
		
		
		
	}
	


public WebElement getFeaturesMenu() {
	
	WebElement messanger = driver.findElement(By.linkText("Features")); 
	return messanger; 
	
	
	
}
	

public WebElement getPrivacyMenu() {
	
	WebElement messanger = driver.findElement(By.linkText("Privacy & Safety")); 
	return messanger; 
	
	
	
}
	
	
	
	
	
	
	

}
