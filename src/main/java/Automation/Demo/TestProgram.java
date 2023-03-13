package Automation.Demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.Units;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProgram {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * driver= new ChromeDriver(); driver.get("https://www.amazon.in/");
		 * driver.findElement(By.linkText("Mobiles")).click();
		 * //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); WebElement
		 * mobileAcceceries= driver.findElement(By.linkText("Mobiles & Accessories"));
		 * Actions act = new Actions(driver); Thread.sleep(4000);
		 * act.moveToElement(mobileAcceceries).build().perform();
		 * driver.findElement(By.linkText("Samsung")).click();
		 * System.out.println("Sumsung link hasbeen clicked"); String
		 * title=driver.getTitle();
		 * 
		 * System.out.println(title);
		 * 
		 * 
		 */

		
		
		String team[]= {"Virat","Rohit"};
		
		 List<String> String= Arrays.asList(team);
		 System.out.println("Array without"+String);
		Collections.reverse(String);
		
		 String[] reversedArray = String.toArray(team);
		 System.out.println(Arrays.toString(reversedArray));
		
	}

}
