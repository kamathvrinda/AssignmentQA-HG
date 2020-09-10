package com.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(css = "button[data-url*='/buy']")
	WebElement buyProperty;
	@FindBy(css = " #nb-search-form-container div[id = 'nbCitySelector']")
	WebElement dropdown;
	@FindBy(css = "#nbCitySelector a[data-key = 'mumbai']")
	WebElement selectDrp;
	@FindBy(css = "#locationGoogleClickWrapper")
	WebElement searchClick;
	@FindBy(css = "#searchButtonHomePage")
	WebElement searchBtn;

	public void selectProductType(String selectProduct) {
		
	}

	public void selectFromPlace(String placeName) {
		searchClick.click();
		searchClick.sendKeys(placeName);
	}

	public void searchPlaces(String key) {
		
	}
	
	public void searchClick() {
		searchBtn.click();
	}
	
	
}