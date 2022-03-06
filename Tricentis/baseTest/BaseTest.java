package baseTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import com.Tricentis.pages.EnterInsuranceDataPage;
import com.Tricentis.pages.EnterProductDataPage;
import com.Tricentis.pages.EnterVehicleDataPage;
import com.Tricentis.pages.HomePage;
import com.Tricentis.pages.SelectPriceOptionPage;
import com.Tricentis.pages.SenQuotePage;
import com.Tricentis.utilities.ReadConfig;
import com.Tricentis.utilities.XLReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends ObjectRepository {

	public static void LaunchBrowserAndNavigate() throws Exception {
		String url = ReadConfig.getPropertyValueByKey("url");
		String browser = ReadConfig.getPropertyValueByKey("browser");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
	}

	@BeforeClass
	public void setUp() throws Exception {
		LaunchBrowserAndNavigate();
		homePage = new HomePage();
		enterInsuranceData = new EnterInsuranceDataPage();
		enterProductData = new EnterProductDataPage();
		enterVehicleData = new EnterVehicleDataPage();
		selectPriceOption = new SelectPriceOptionPage();
		senQuotePage = new SenQuotePage();
		xlReader= new XLReader();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public static void takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("path");
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}

	@DataProvider(name = "vehicledata")
	public Object[][] testDataSupplier() {

		Object[][] obj = new Object[xlReader.getRowCount()][1];
		for (int i = 0; i < xlReader.getRowCount(); i++) {
			HashMap<String, String> testData = XLReader.getTestDataIntoMap(i);
			obj[i-1][0] = testData;

		}
		return obj;

	}
}
