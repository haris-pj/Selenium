package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void openGoogle() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
	}
	
	@Test
	public void openBing() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
		
	}

}
