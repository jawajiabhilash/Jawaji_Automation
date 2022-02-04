package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	public static WebDriver driver;

	@BeforeTest(enabled=false)
	public void Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	}

	@Test(dataProvider = "LoginData")
	public void LoginApp(String userName, String passWord) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}

	@DataProvider(name = "LoginData")
	public Object DataSupplier() {

		Object testData[][] = new Object[2][2];
		testData[0][0] = "Admin";
		testData[0][1] = "admin123";
		testData[1][0] = "Admin1";
		testData[1][1] = "admin123";

		return testData;
	}

	
	  @AfterTest (enabled=false)
	  public void Quit() 
	  { driver.quit(); }
	
}
