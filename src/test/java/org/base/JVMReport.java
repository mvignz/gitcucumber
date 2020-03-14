package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {
	public static void generateJVMReport(String jsonFile ) {
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports");
		Configuration c= new Configuration(loc,"AutomationTesting");
	c.addClassifications("OS", "Windows 10");
	c.addClassifications("Browsername", "Chrome");
	c.addClassifications("Version", "79");
	c.addClassifications("Sprint", "27");
	List<String> jsonFiles= new ArrayList<String>();
			jsonFiles.add(jsonFile);
			ReportBuilder b = new ReportBuilder(jsonFiles,c);
	
	b.generateReports();
	}

}
