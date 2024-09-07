package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement getPosition = driver.findElement(By.xpath("//*[text()='Submit']"));
		Point xypoint = getPosition.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is :"+ xValue+"Y value is :"+yValue);
		
		WebElement colorButton = driver.findElement(By.xpath("//*[text()='Save']"));
		String color = colorButton.getCssValue("background");
		System.out.println("Button color is :"+color);
		
		WebElement sizeButton= driver.findElement(By.xpath("(//*[text()='Submit'])[2]"));
		int height= sizeButton.getSize().getHeight();
		int width= sizeButton.getSize().getWidth();
		System.out.println("Height is :"+ height+"Width is :"+width);
		
		WebElement homeButton= driver.findElement(By.id("j_idt88:j_idt90"));
		homeButton.click();
		
		driver.close();

	}

}
