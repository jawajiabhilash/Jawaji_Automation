package TestNg;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "Sanity")
	public void m1() {
		System.out.println("Sanity1");
	}

	@Test(groups = "Sanity")
	public void m2() {
		System.out.println("Sanity2");
	}

	@Test(groups = "Regression")
	public void m3() {
		System.out.println("Regression1");
	}

	@Test(groups = "Regression")
	public void m4() {
		System.out.println("Regression2");
	}

	@Test(groups = "Regression")
	public void m5() {
		System.out.println("Regression3");
	}

	@Test(groups = {"Regression","Sanity"})
	public void m6() {
		System.out.println("Regression and Sanity");
	}

}
