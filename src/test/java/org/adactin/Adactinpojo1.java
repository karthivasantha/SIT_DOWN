package org.adactin;

import java.util.List;

import org.base1.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo1 extends Baseclass {
	
	public Adactinpojo1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtusername;

	
	@FindBy(id="password")
	private WebElement txtpassword;


	
	@FindBy(id="login")
	private WebElement btnlogin;


	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}


	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void enterLoginCrendtials(String username, String password) {
		fillTextBox(getTxtusername(), username);
		fillTextBox(getTxtpassword(), password);
	}
	
	public void loginclick() {
		btnClick(getBtnlogin());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}