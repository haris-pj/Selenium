package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement favBrowser= driver.findElement(By.xpath("//*[text()='Chrome']"));
		favBrowser.click();
		
		WebElement unselected= driver.findElement(By.xpath("//*[text()='Chennai']"));
		boolean status1= unselected.isSelected();
		System.out.println(status1);
	}

}
