package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDatagivenhere {
	
	String [][] data= {
			{"Admin1","admin"},
			{"Admin1","dummy"},
			{"Admin","admin"},
			{"Admin","admin1"}
	};
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void loginWithBothCorrect(String uName, String pword) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		WebElement userName =driver.findElement(By.name("username"));
		userName.sendKeys(uName);
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys(pword);
		WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		driver.quit();
	}

}
