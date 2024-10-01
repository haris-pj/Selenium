package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	@Test
	public void login() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://phptravels.net/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
	}

}
