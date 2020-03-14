package com.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, 
glue = {"com.stepdefinition" }, monochrome = true, dryRun = false, 
plugin = {"pretty","json:src\\test\\resources\\reports\\Cucumber.json" })

public class TestRunnerClass {
	@AfterClass
	public static void afterclass() {
		JVMReport.generateJVMReport("E:\\Eclipse-workspace\\CucumberBase\\src\\test\\resources\\reports\\Cucumber.json");
	}
}
