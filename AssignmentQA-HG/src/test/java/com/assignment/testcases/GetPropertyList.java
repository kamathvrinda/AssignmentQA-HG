/**
 * 
 */
package com.assignment.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.assignment.utility.BrowserFactory;

/**
 * @author Vrinda Kamath
 *
 */
public class GetPropertyList {
	WebDriver driver;
	@Test
	public void startBrowser() {
		driver = BrowserFactory.startBrowser(driver, "Chrome", "https://www.nobroker.in/");
		
		System.out.println(driver.getTitle());
		
		
	}
	

}
