package com.Tricentis.utilities;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import baseTest.BaseTest;

public class CommonMthods extends BaseTest
{
	// Select Values from dropdown
	public static void selectDropDown(WebElement e, int time,String value) {
		wait= new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(e));
		Select dropdown= new Select(e);
		List<WebElement> drp=  dropdown.getOptions();
		drp.stream().filter(a->a.getText().equals(value)).forEach(a->a.click());
		
	}
	
	//enter value into text box
	public static  void enterText(WebElement e, int time, String value) {
		wait = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(value);
	}
	//Click on button or links
	public static  void click(WebElement e, int time) {
		wait = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(e));
		e.click();;
	}
	
	// Click Single checkbox
	public static void clickcheckBox(WebElement e, int time) {
		wait = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(e));
		e.click();;
	}

	// Click multiple checkbox
	public static void clickcheckBoxes(List<WebElement> e, int time,String value) {
		waits = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfAllElements(e));
		e.stream().filter(a->a.getText().equals(value)).forEach(a->a.click());
	}
	// Click Single radio button
	public static void clickRadioButton(WebElement e, int time) {
		wait = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(e));
		e.click();;
	}

	// Click multiple radio buttons
	public static  void clickRadioButtons(List<WebElement> e, int time,String value) {
		waits = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfAllElements(e));
		e.stream().filter(a->a.getText().equals(value)).forEach(a->a.click());
	}
	
	public static  void scollUpByJs( ) {
		
		js.executeScript("window.scrollBy(0,350)");
	}
	
	public static  void datePickerByJS(WebElement e, int time,String value) {
		waits = new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfAllElements(e));
		js.executeScript("arguments[0].value=arguments[1]", e,value);
	}
	


}
