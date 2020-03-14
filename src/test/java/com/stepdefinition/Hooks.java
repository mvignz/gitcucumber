package com.stepdefinition;

import org.base.BaseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends BaseClass{
	
	@Before
	
	public void beforeScenario() {
		
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");

		
	}
	
	@After
	public void afterScenario(Scenario sc) {
//
//		TakesScreenshot tk=(TakesScreenshot) driver;
//		
//	byte[] b = tk.getScreenshotAs(OutputType.BYTES);
//			
//		sc.embed(b, "images/png");
		
	}
	

}
