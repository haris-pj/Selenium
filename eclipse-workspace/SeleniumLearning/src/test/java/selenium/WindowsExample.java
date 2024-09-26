package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0jkcsydmsw683tsqu9pi2d4pr6912433.node0");

		String oldWindow =driver.getWindowHandle();
		WebElement firstButton =driver.findElement(By.xpath("//*[text()='Open']"));
		firstButton.click();
		Set<String> handles =driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement homeButton =driver.findElement(By.id("message"));
		homeButton.sendKeys("Hello");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple =driver.findElement(By.id("j_idt88:j_idt91"));
		openMultiple.click();
		int numberOfWindows =driver.getWindowHandles().size();
		System.out.println("No of windows opened:"+ numberOfWindows);
		
		WebElement dontCloseMe =driver.findElement(By.xpath("//*[text()='Close Windows']"));
		dontCloseMe.click();
		Set<String> newWindowHandles =driver.getWindowHandles();
		for (String allWindows : newWindowHandles) {
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
		driver.quit();
	}

}
