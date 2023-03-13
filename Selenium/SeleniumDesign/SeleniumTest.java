package SeleniumDesign;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Webdriver_SD driver = new EdgeDriver();

		driver.get("https://www.google.com");
		driver.findElementBy("Xpath");
		driver.click();
		driver.close();
		driver.quit();

	}

}
