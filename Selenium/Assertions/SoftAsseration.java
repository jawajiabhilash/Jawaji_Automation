package Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsseration {

	@Test
	public void softAssertions() {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("Start");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
		Assert.assertEquals("Abhilash1", "Abhilash1", "Expected and actal are matched");
		softAssertion.assertAll();
		System.out.println("Stop");

	}

	@Test(enabled = false)
	public void softAssert() {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
	}

	@Test(enabled = false)
	public void hardAssert() {
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}
}
