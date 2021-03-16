package org.report;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	
	public static void JVMReportGeneration(String json) {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\adactinreport");
	Configuration con = new Configuration(f, "karthi");
	con.addClassifications("platform name", "windows");
	con.addClassifications("platform version", "10");
	ArrayList<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(json);
	ReportBuilder r = new ReportBuilder(jsonFiles, con);
	r.generateReports();
	
	}

}
