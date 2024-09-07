package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertBox= driver.findElement(By.xpath("//*[text()='Show']"));
		alertBox.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmButton= driver.findElement(By.xpath("(//*[text()='Show'])[2]"));
		confirmButton.click();
		Alert confirmAlert= driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement promptBox= driver.findElement(By.xpath("(//*[text()='Show'])[5]"));
		promptBox.click();
		Alert promptAlert= driver.switchTo().alert();
		promptAlert.sendKeys("Found it");
		promptAlert.accept();

	}

}
