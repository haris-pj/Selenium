package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/list.xhtml");
		
		List<WebElement> selectable =driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		int listSize =selectable.size();
		System.out.println(listSize);
		
		Actions actions =new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
		driver.close();

	}

}
