package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");
		
		WebElement input =driver.findElement(By.id("tags"));
		input.sendKeys("j");
		Thread.sleep(2000);
		List<WebElement> optionsList =driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		for (WebElement webElement : optionsList) {
			if (webElement.getText().equals("Java")) {
				webElement.click();
				Thread.sleep(1000);
				break;
			}
		}
		driver.close();

	}

}
