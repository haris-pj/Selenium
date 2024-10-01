package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement downloadLink =driver.findElement(By.id("j_idt93:j_idt95"));
		downloadLink.click();
		Thread.sleep(3000);
		
		File fileLocation =new File("C:\\Users\\haris\\Downloads");
		File[] totalFiles =fileLocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			}
		}
		driver.close();

	}

}
