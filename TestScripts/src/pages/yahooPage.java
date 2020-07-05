package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahooPage {
	
	
	
WebDriver driver; 
	
	public yahooPage(WebDriver x) {
		
		driver=x;
		
	}
	
	
public WebElement getfirstName() {
		
	WebElement firstName = driver.findElement(By.name("firstName"));
		return firstName; 
		
		
		
	}
	


public WebElement getPhoneDD() {
	
	WebElement dd = driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
	return dd; 
	
	
	
}

}
