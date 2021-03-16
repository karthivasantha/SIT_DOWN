package org.Stepdefinitionadactin;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base1.Baseclass;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import net.masterthought.cucumber.json.Output;
public class Hook extends Baseclass {

@io.cucumber.java.Before
public void beforeScenario() {
	chromeBrowser1();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@After
public void Afteradactin(Scenario s) throws IOException, InterruptedException {
	
	if (s.isFailed()) {
		screenShot();
		screenshotfail("fail2");
		
		//TakesScreenshot t=(TakesScreenshot) driver;
		//byte[] shot = t.getScreenshotAs(OutputType.BYTES);
		//s.embed(shot, "image/png");
		//String name = s.getName();
		//String sn = name.replace(" ", "_");
		//System.out.println("scenario failed:" +sn);
	}else {
		javaScrptExcuter();
	WebElement ordernum = driver.findElement(By.id("order_no"));
	//scrollingDown("ordernum");
	scrollUp(ordernum);
	Thread.sleep(3000);
	screenShot();
	screenShotGet("true3");
	}
}

	
}
