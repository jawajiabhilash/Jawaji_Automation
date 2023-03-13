package SeleniumDesign;

public class RemoteWebDriver_SD implements Webdriver_SD {

	@Override
	public void get(String URL) {
		System.out.println("The URL is" + URL);

	}

	@Override
	public void findElementBy(String Locator) {
		System.out.println("The Locator is" + Locator);

	}

	@Override
	public void click() {
		System.out.println("Clicked Sucessfully");
	}

	@Override
	public void close() {
		System.out.println("Closed Sucessfully");
	}

	@Override
	public void quit() {
		System.out.println("Quit Sucessfully");
	}

}
