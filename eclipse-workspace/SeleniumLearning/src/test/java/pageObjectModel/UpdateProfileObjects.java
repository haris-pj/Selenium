package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {
	
	@FindBy(xpath="//*[text()=' My Profile']")
	public static WebElement myprofile;
	
	@FindBy(xpath="//*[@id='Password']")
	public static WebElement passWord;
	
	@FindBy(id="Phone")
	public static WebElement phoneNumber;
	
	@FindBy(id="City")
	public static WebElement city;
	
	@FindBy(xpath="//*[@type='submit']")
	public static WebElement submit;
}
