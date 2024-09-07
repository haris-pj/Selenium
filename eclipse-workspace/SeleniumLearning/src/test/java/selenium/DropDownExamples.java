package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dropDown1= driver.findElement(By.className("ui-selectonemenu"));
		
		Select select = new Select(dropDown1);
		select.selectByIndex(1);
		
		select.selectByVisibleText("Cypress");
		
		List <WebElement> listOfOptions= select.getOptions();
		int size= listOfOptions.size();
		System.out.println("Number of elements :"+ size);
		
		dropDown1.sendKeys("Playwright");

	}

}
