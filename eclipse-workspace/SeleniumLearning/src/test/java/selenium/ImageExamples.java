package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
		
		WebElement brokenImage =driver.findElement(By.xpath("/html/body/main/div/div/div[2]/p[1]/img"));
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}else {
			System.out.println("The image is not broken");
		}
		
		driver.close();

	}

}
