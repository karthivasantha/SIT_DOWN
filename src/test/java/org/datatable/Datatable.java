package org.datatable;

import java.util.List;
import java.util.Map;

import org.adactin.Adactinpojo1;
import org.base1.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Datatable extends Baseclass {

		@Given("user is in facebook login page")
		public void user_is_in_facebook_login_page() {
		 
		  launchUrl("https://adactinhotelapp.com/");
		}

		@When("user enter invalid name and passsword")
		public void user_enter_invalid_name_and_passsword(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> mps = d.asMaps();
		Map<String, String> l1 = mps.get(1);
		Adactinpojo1 l =new Adactinpojo1();
		   l.enterLoginCrendtials(l1.get("username"), l1.get("password"));
		}

		@When("use click login button")
		public void use_click_login_button() {
			   Adactinpojo1 l =new Adactinpojo1();
			   l.loginclick();
		}

}
