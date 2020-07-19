package oop;

public class IEDriver implements WebDriver {

	@Override
	public void sendKeys(String x) {
		System.out.println("this is iedriver sendkeys");
		
	}

	@Override
	public void findElement(String x) {
		System.out.println("this is iedriver findelement");
		
	}

	@Override
	public void click() {
		System.out.println("this is iedriver click");
		
	}

}
