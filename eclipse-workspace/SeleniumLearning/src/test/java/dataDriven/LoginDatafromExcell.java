package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginDatafromExcell {
	
	String [][] data= null;
	WebDriver driver;
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data=getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel =new FileInputStream("C:\\Users\\haris\\Documents\\TestData.xls");
		Workbook workbook =Workbook.getWorkbook(excel);
		Sheet sheet =workbook.getSheet(0);
		int rowCount =sheet.getRows();
		int columnCount =sheet.getColumns();
		String testData[][] =new String[rowCount-1][columnCount];
		for(int i=1; i<rowCount;i++){
			for(int j=0; j<columnCount;j++) {
				testData[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}
	
	@BeforeTest
	public void beforeTest() {
		driver =new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@Test(dataProvider = "loginData")
	public void loginWithBothCorrect(String uName, String pword) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement userName =driver.findElement(By.name("username"));
		userName.sendKeys(uName);
		WebElement password =driver.findElement(By.name("password"));
		password.sendKeys(pword);
		WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}

}
