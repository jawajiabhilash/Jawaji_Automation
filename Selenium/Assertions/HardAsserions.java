package Assertions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserions {

	@Test
	public void hardAssertions() {
		System.out.println("Start");
		Assert.assertEquals("Abhilash", "Abhilash1", "Expected and actal are matched");
		System.out.println("Stop");
	}
}
