package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookSignup {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		// entering first name
		driver.findElement(By.id("u_0_n")).sendKeys("Michael");

		Thread.sleep(1000);
		// enterting last name
		driver.findElement(By.id("u_0_p")).sendKeys("jordan");
		
		Thread.sleep(1000);
		// entering email
		driver.findElement(By.name("reg_email__")).sendKeys("jordan@test.com");
		
		// entering password 
		
		driver.findElement(By.id("u_0_x")).sendKeys("dfkjdjds++");
		
		Thread.sleep(1000);
		
		// clicking on radio button
		
		driver.findElement(By.id("u_0_7")).click();
		
		// reading from signup button 
		
		String buttonText = driver.findElement(By.id("u_0_14")).getText();
		
		boolean buttonDisplayed = driver.findElement(By.id("u_0_14")).isDisplayed();
		
		boolean buttonEnabled = driver.findElement(By.id("u_0_14")).isEnabled();
		
		System.out.println(buttonText);
		
		if(buttonDisplayed) {
			
			System.out.println("Button is displayed");
			
			
		}
		
      if(buttonEnabled) {
			
			System.out.println("Button is enabled");
			
			
		}
		
		
		
		//System.out.println(buttonEnabled);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
