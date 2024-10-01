package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how=How.ID,using = "email")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id = "submitBTN")
	public static WebElement loginButton;
}
