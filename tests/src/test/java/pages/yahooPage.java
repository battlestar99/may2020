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
		
	WebElement firstName = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
		return firstName; 
		
		
		
	}

public WebElement getlastName() {
	
	WebElement lastName = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]"));
		return lastName; 
		
		
		
	}

public WebElement getEmailaddress() {
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		return email; 
		
		
		
	}


public WebElement getPassword() {
	
	WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
		return password; 
		
		
		
	}





public WebElement getPhoneDD() {
	
	WebElement phonedd = driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
	return phonedd; 
	
	
	
}

public WebElement getBirthMonthDD() {
	
	WebElement monthdd = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
	return monthdd; 
	
	
	
}

public WebElement getcontinueButton() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]"));
	return x; 
	
	
	
}
















}
