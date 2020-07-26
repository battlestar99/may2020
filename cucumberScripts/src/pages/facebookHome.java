package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookHome {
	
	
	WebDriver driver; 
	
	public facebookHome(WebDriver x) {
		
		driver=x;
		
	}
	
	
public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")); 
		return x; 
		
		
		
	}

public WebElement getlastName() {
	
	WebElement x= driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")); 
	return x; 
	
	
	
}


public WebElement getemail() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")); 
	return x; 
	
	
	
}

}
