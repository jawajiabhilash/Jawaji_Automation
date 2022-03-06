package com.Tricentis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Tricentis.utilities.CommonMthods;

public class HomePage extends CommonMthods {
	//public static CommonMthods cm= new CommonMthods();
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nav_automobile")WebElement AutomobileLink;
	@FindBy(id = "nav_truck")WebElement TruckLink;
	@FindBy(id = "nav_motorcycle")WebElement MotorCycleLink;
	@FindBy(id = "nav_camper")WebElement CamperLink;
	
	public void navigateAutomobile() {
		click(AutomobileLink, 5);
	};
	
	public void navigateTruck() {
		click(TruckLink, 5);
	};
	public void navigateMotorCycle() {
		click(MotorCycleLink, 5);
	};
	public void navigateCaper() {
		click(CamperLink, 5);
	};
	
}

