package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExamples {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		Thread.sleep(1000);
		WebElement deleteaRow =driver.findElement(By.xpath("(//*[@title='delete'])[3]"));
		deleteaRow.click();
		Thread.sleep(1000);
		WebElement deleteAnother =driver.findElement(By.xpath("(//*[@title='delete'])[3]"));
		deleteAnother.click();
		
		List<WebElement> columns =driver.findElements(By.tagName("th"));
		int columnCount =columns.size();
		System.out.println("Number of columns "+columnCount);
		
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		int rowCount =rows.size();
		System.out.println("Number of columns "+rowCount);
		
		WebElement getAge =driver.findElement(By.xpath("//td[normalize-space()='Cantrell']//following::td[1]"));
		String age =getAge.getText();
		System.out.println("Alden Cantrell Age is "+age);
		
		List<WebElement> allSalary =driver.findElements(By.xpath("//td[5]"));
		List<Integer> numberList =new ArrayList<Integer>();
		for (WebElement webElement : allSalary) {
			String individualValue =webElement.getText();
			numberList.add(Integer.parseInt(individualValue));
		}
			System.out.println("Final list "+numberList);
			int smallValue =Collections.min(numberList);
			System.out.println("The minimum salary is "+smallValue);
			driver.close();

	}

}
