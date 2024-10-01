package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement button1 =driver.findElement(By.id("Click"));
		button1.click();
		String text =driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames =driver.findElements(By.tagName("iframe"));
		int size= totalFrames.size();
		System.out.println(size);
		driver.close();

	}

}
