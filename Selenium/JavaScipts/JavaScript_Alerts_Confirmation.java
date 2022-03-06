package JavaScipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Alerts_Confirmation {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ClickForJSAlert=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement ClickForJSConfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement ClickForJSPrompt=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		
		
		ClickForJSAlert.click();
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		ClickForJSConfirm.click();
		al.dismiss();
		ClickForJSPrompt.sendKeys("Test is passed");
		al.accept();
	}
}
