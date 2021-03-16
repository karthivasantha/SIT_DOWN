package org.Stepdefinitionadactin;

import org.adactin.Adactinpojo1;
import org.adactin.Adactinpojo2;
import org.adactin.Adactinpojo3;
import org.adactin.Adactinpojo4;
import org.base1.Baseclass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionAdactin extends Baseclass {
	
@Given("user is in facebook login page")
public void user_is_in_facebook_login_page() {
   launchUrl("https://adactinhotelapp.com/");
}

@When("user enter invalid {string} and {string}")
public void user_enter_invalid_and(String email, String pass) {
   Adactinpojo1 l1 =new Adactinpojo1();
   l1.enterLoginCrendtials(email, pass);
}

@When("use click login button")
public void use_click_login_button() {
	Adactinpojo1 l1 =new Adactinpojo1();
	l1.loginclick();
}

@When("user enter location and no of rooms and {string} and {string} and adults.")
public void user_enter_location_and_no_of_rooms_and_and_and_adults(String checkin, String checkout) {
    Adactinpojo2 l2= new Adactinpojo2();
    l2.locationGet();
    l2.roomsGet();
    l2.checkindate(checkin);
    l2.checkoutdate(checkout);
    l2.adultsget();
    
}

@When("user click search button")
public void user_click_search_button() {
	 Adactinpojo2 l2= new Adactinpojo2();
	 l2.clicksubmit();
}

@When("user select the available hotel by radiobutton and click continue.")
public void user_select_the_available_hotel_by_radiobutton_and_click_continue() {
    Adactinpojo3 l3=new Adactinpojo3();
    l3.radiobtnget();
    l3.clickcontinue();
}

@When("user enter {string} and {string} and {string} and {string} and creditcardtype and ccexpirymonth and ccexpiryyear and {string}")
public void user_enter_and_and_and_and_creditcardtype_and_ccexpirymonth_and_ccexpiryyear_and(String fn, String ln, String address, String creditcardno, String cvvno) {
   Adactinpojo4 l4=new Adactinpojo4();
   l4.firstNameGet(fn);
   l4.lastNameGet(ln);
   l4.addrzget(address);
   l4.ccno(creditcardno);
   l4.typecc();
   l4.monthget();
   l4.yearget();
   l4.cvvnum(cvvno);
}

@When("user click book now.")
public void user_click_book_now() throws InterruptedException {
	 Adactinpojo4 l4=new Adactinpojo4();
	 l4.clickbook();
	 Thread.sleep(8000);
}

@Then("user check the order no print or not")
public void user_check_the_order_no_print_or_not() {
	 Adactinpojo4 l4=new Adactinpojo4();
	 l4.noorder();
	 //l4.scrollToOrder();
	 System.out.println("done");
}

}
