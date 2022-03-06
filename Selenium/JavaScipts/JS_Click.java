package JavaScipts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_Click {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("login-username")).sendKeys("test123");
		Thread.sleep(3000);
		WebElement staySignIn=driver.findElement(By.id("persistent"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('persistent').click()");
		js.executeScript("arguments[0].click()",staySignIn);
		
		Thread.sleep(3000);
		System.out.println("Completed");
		driver.quit();

	}

}
