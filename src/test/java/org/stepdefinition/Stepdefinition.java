package org.stepdefinition;


import org.base1.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition extends Baseclass {
public WebDriver driver;
	
@Given("user is in facebook login page")
public void user_is_in_facebook_login_page() {
	//WebDriverManager.chromedriver().setup();
	//driver= new ChromeDriver();
	chromeBrowser();
	launchUrl("https://adactinhotelapp.com/");
}



@When("user enter invalid {string} and {string}")
public void user_enter_invalid_and(String email, String pass) {
	 WebElement txtusr = driver.findElement(By.id("username"));
	   txtusr.sendKeys(email);
	   WebElement txtpass = driver.findElement(By.id("password"));
	   txtpass.sendKeys(pass);
}

@When("use click login button")
public void use_click_login_button() throws InterruptedException {
 driver.findElement(By.name("login")).click();
 Thread.sleep(4000);
}


@When("user enter location and no of rooms and {string} and {string} and adults.")
public void user_enter_location_and_no_of_rooms_and_and_and_adults(String datein, String dateout) {
	WebElement loc = driver.findElement(By.id("location"));
	btnClick(loc);
	dropDownSelect(loc);
	selectValue("Brisbane");
	WebElement rooms = driver.findElement(By.id("room_nos"));
	btnClick(rooms);
	dropDownSelect(rooms);
	selectIndex(2);
	WebElement checkin = driver.findElement(By.id("datepick_in"));
	clearBrowser(checkin);
	fillTextBox(checkin, datein);
	WebElement checkout = driver.findElement(By.id("datepick_out"));
	clearBrowser(checkout);
	fillTextBox(checkout, dateout);
	WebElement adult = driver.findElement(By.id("adult_room"));
	btnClick(adult);
	dropDownSelect(adult);
	selectValue("2");
}



@When("user click search button")
public void user_click_search_button() {
	WebElement submitclik = driver.findElement(By.id("Submit"));
	btnClick(submitclik);
}


@When("user select the available hotel by radiobutton and click continue.")
public void user_select_the_available_hotel_by_radiobutton_and_click_continue() {
	WebElement radio = driver.findElement(By.id("radiobutton_"));
	btnClick(radio);
	WebElement contclick = driver.findElement(By.id("continue"));
	btnClick(contclick);
}

@When("user enter {string} and {string} and {string} and {string} and creditcardtype and ccexpirymonth and ccexpiryyear and {string}")
public void user_enter_and_and_and_and_creditcardtype_and_ccexpirymonth_and_ccexpiryyear_and(String fname, String lname, String addrz, String ccno, String cvvno) {
	WebElement firstname = driver.findElement(By.id("first_name"));
	fillTextBox(firstname, fname);
	WebElement lastname = driver.findElement(By.id("last_name"));
	fillTextBox(lastname, lname);
	WebElement addrzz = driver.findElement(By.id("address"));	
	fillTextBox(addrzz, addrz);
	WebElement cc = driver.findElement(By.id("cc_num"));
	fillTextBox(cc, ccno); 
	WebElement cctype = driver.findElement(By.id("cc_type"));
	btnClick(cctype);
	dropDownSelect(cctype); 
	selectIndex(3);
	WebElement month = driver.findElement(By.id("cc_exp_month"));
	btnClick(month);
	dropDownSelect(month);
	selectIndex(3);
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	btnClick(year);
	dropDownSelect(year);
	selectValue("2022");
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	fillTextBox(cvv, cvvno);
}

@When("user click book now.")
public void user_click_book_now() throws InterruptedException {
	WebElement bookclick = driver.findElement(By.id("book_now"));
	btnClick(bookclick);
	Thread.sleep(5000);
}

@Then("user check the order no print or not")
public void user_check_the_order_no_print_or_not() {
	WebElement orderno = driver.findElement(By.id("order_no"));
	String number = orderno.getAttribute("value");
	Assert.assertTrue(number.length()==10);
}
























}
