package JavaScipts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_Alerts_Creation {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Alert
		js.executeScript("alert('welcome to selenium world')");
		// Prompt
		js.executeScript("promt('how are you')");
		// Confirm
		js.executeScript("alert('Are you Sure')");

		driver.close();
	}

}
