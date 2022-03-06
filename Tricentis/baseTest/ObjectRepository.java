package baseTest;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Tricentis.pages.EnterInsuranceDataPage;
import com.Tricentis.pages.EnterProductDataPage;
import com.Tricentis.pages.EnterVehicleDataPage;
import com.Tricentis.pages.HomePage;
import com.Tricentis.pages.SelectPriceOptionPage;
import com.Tricentis.pages.SenQuotePage;
import com.Tricentis.utilities.XLReader;

public class ObjectRepository {
	public static WebDriver driver;
	public static WebElement wait;
	public static List<WebElement> waits;
	public static JavascriptExecutor js=(JavascriptExecutor)driver;
	public  EnterInsuranceDataPage enterInsuranceData;
	public EnterProductDataPage enterProductData;
	public  EnterVehicleDataPage enterVehicleData;
	public HomePage homePage;
	public  SelectPriceOptionPage selectPriceOption;
	public SenQuotePage senQuotePage;
	public XLReader xlReader;	
}
