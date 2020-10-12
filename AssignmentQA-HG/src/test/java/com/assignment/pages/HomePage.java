package com.assignment.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	

	@FindBy(css = "button[data-url*='/buy']")
	WebElement buyProperty;
	@FindBy(css = "button[data-url*='/rent']")
	WebElement rentProperty;
	@FindBy(css = "button[data-url*='/commercial_rent']")
	WebElement commercialProperty;
	
	
	@FindBy(css = " #nb-search-form-container div[id = 'nbCitySelector']")
	WebElement dropdown;
	@FindBy(css = "#nbCitySelector a[data-key = 'mumbai']")
	WebElement selectDrp;
	@FindBy(css = "#locationGoogleClickWrapper")
	WebElement searchClick;
	@FindBy(css = "#searchButtonHomePage")
	WebElement searchBtn;
	
	//Places webElement 

	//this will select if it is Buy/rent/commercial
	public void selectProductType(String selectProduct) {
		if(selectProduct == "Buy") buyProperty.click();
		else if (selectProduct == "Rent") rentProperty.click();
		else if(selectProduct == "Commercial") commercialProperty.click();
	}
	
	public void selectDropDown() {
		dropdown.click();
		selectDrp.click();
	}

	//it will enter the place name in search field
	public void selectFromPlace(String placeName) {
		
		
		searchClick.sendKeys("Whyy");
		
	}

	//selects the required place locator
	public void searchPlaces(String key) {
		
	}
	
	//click on search btn
	public void searchClickBtn() {
		searchBtn.click();
	}
	
	
}