package WindowHandles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	}

	@Test(enabled = true)
	public void Method1() throws InterruptedException {
		Set<String> windowIds = driver.getWindowHandles();
		for (String winIds : windowIds) {
			String title = driver.switchTo().window(winIds).getTitle();
			System.out.println("Page Titles are " + title);
			// OrangeHRM OrangeHRM HR Software | Free & Open Source HR Software | HRMS |
			// WindowCDwindow-8EC6901E77A4C0A8181D23520A0B1F6E
			// WindowCDwindow-1EBD1CF493951BF921F96B84A18F3298
			// HRIS
			/*
			 * if (title.equals("OrangeHRM")) { driver.close(); }
			 */
			Thread.sleep(2000);
			if (winIds.equals("1EBD1CF493951BF921F96B84A18F3298")) {
				driver.close();
			}

			// System.out.println("OrangeHRM HR Software been closed");
			// System.out.println(driver.getTitle());

		}

	}

	@Test(enabled = false)
	public void Method2() throws InterruptedException {
		Set<String> windowIds = driver.getWindowHandles();
		windowIds.stream().forEach(v -> System.out.println(driver.switchTo().window(v).getTitle()));
		windowIds.stream().filter(v -> driver.switchTo().window(v).getTitle().equals("OrangeHRM"))
				.forEach(v -> driver.close());

		// driver.close();
	}

	@Test(enabled = false)
	public void getWindowIds() {
		Set<String> windowIds = driver.getWindowHandles();
		Iterator it = windowIds.iterator();
		while (it.hasNext()) {
			System.out.println("Window" + it.next());
		}
	}

}
