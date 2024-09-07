package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("Duck");
		
		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys(" city");
		
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearText.clear();
		
		WebElement getTextBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		
		driver.close();

	}

}
