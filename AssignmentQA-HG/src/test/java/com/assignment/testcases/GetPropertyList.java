/**
 * 
 */
package com.assignment.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.assignment.pages.BaseClass;
import com.assignment.pages.HomePage;

/**
 * @author Vrinda Kamath
 *
 */
public class GetPropertyList extends BaseClass {
	

	@Test
	public void selectRequiredProductType() throws InterruptedException {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
				
//		homePage.selectProductType("Buy");
//		homePage.selectDropDown();
		homePage.selectFromPlace("Mumbai");
//		homePage.searchClickBtn();
		
		Thread.sleep(4000);
		
		
		
	}

}
