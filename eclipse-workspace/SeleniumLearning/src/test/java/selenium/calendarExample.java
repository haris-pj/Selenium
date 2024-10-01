package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		
		WebElement next =driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();
		WebElement calendar =driver.findElement(By.xpath("//*[@data-date='2024-10-10']"));
		calendar.click();
		Thread.sleep(2000);
		WebElement title =driver.findElement(By.id("j_idt87:title"));
		title.sendKeys("Nothing");
		Thread.sleep(2000);
		WebElement reset =driver.findElement(By.id("j_idt87:j_idt100"));
		reset.click();
		driver.close();

	}

}
