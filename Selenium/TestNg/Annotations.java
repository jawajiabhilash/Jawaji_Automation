package TestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Annotations {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("From BeforeSuite");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("From BeforeClass");
	}

	@BeforeMethod
	public void BeforeMthod() {
		System.out.println("From BeforeMthod");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("From BeforeTest");
	}

	@Test
	void Test() {
		System.out.println("From Test");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("From AfterTest");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("From AfterMethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("From AfterClass");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("From AfterSuite");
	}
}
