package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		
		
		// any functions interacting with browser comes from webdriver interface - and any browser class 
		
		// will start chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1=new ChromeDriver();
		
		// navigating to an url 
		
		driver.get("https://www.ebay.com/deals");
		
		driver1.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title = driver.getTitle();
		
		

		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		driver1.quit();
		

	}

}
