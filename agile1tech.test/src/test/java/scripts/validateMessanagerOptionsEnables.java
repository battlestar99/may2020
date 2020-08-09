package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.messangerPage;

public class validateMessanagerOptionsEnables {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.messenger.com/");
		
		messangerPage mp = new messangerPage(driver);
		
		boolean x = mp.getroomsmenua().isEnabled();
		boolean y = mp.getFeaturesMenu().isEnabled();
		boolean z = mp.getPrivacyMenu().isEnabled();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
