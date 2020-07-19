package oop;

public class chromeDriver implements WebDriver {

	@Override
	public void sendKeys(String x) {
		System.out.println("this is chromedriver sendkeys");
		
	}

	@Override
	public void findElement(String x) {
		System.out.println("this is chromedriver findelement");
		
	}

	@Override
	public void click() {
		System.out.println("this is chromedriver click");
		
	}
	
	

}
