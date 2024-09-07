package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement Basic= driver.findElement(By.xpath("//*[text()='Basic']"));
		Basic.click();
		
		WebElement verifyBox= driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]"));
		boolean selected= verifyBox.isSelected();
		System.out.println(selected);

	}

}
