package Ajaxcall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");
		Thread.sleep(3000);
		List<WebElement> listOfSuggestion = driver
				.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//li[@class='sbct']"));

		System.out.println(listOfSuggestion.size());
		Thread.sleep(3000);

		listOfSuggestion.stream().forEach(v -> System.out.println(v.getText()));

		try {
			listOfSuggestion.stream().filter(v -> v.getText().contentEquals("javascript")).forEach(v -> v.click());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		Thread.sleep(3000);
		System.out.println("completed");
		driver.quit();
	}

}
