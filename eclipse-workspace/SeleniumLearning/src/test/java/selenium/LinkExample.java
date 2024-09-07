package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01rjvue5dremqa13k978yinu65j5950266.node0");
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.quit();

	}

}
