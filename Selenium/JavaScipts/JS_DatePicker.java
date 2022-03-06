package JavaScipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_DatePicker {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement userName= driver.findElement(By.id("txtUsername"));
		WebElement password= driver.findElement(By.id("txtPassword"));
		WebElement submit= driver.findElement(By.id("btnLogin"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value=arguments[1]",userName,"Admin" );
		js.executeScript("arguments[0].value='admin123'",password );
		js.executeScript("arguments[0].click()",submit );
		
		driver.close();
	}
}
