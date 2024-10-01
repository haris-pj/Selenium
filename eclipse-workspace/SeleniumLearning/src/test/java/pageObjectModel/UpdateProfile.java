package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UpdateProfile {
	
	@Test
	public void updateProfile() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		
		UpdateProfileObjects.myprofile.click();
		UpdateProfileObjects.phoneNumber.clear();
		UpdateProfileObjects.phoneNumber.sendKeys("1234567");
		UpdateProfileObjects.city.clear();
		UpdateProfileObjects.city.sendKeys("kings");
		UpdateProfileObjects.passWord.sendKeys("demouser");
		UpdateProfileObjects.submit.click();
		driver.quit();
	}

}
