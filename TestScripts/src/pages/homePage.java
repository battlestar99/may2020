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
	
public WebElement getmonth() {
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]")); 
		return month; 
		
		
		
	}

public WebElement getday() {
	
	WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]")); 
	return day; 
	
	
	
}
	
	
public WebElement getyear() {
	
	WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]")); 
	return year; 
	
	
	
}
	
	
	
	
	
	
	
	

}
