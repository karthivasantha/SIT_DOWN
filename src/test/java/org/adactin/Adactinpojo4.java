package org.adactin;

import org.base1.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo4  extends Baseclass{
	public Adactinpojo4() {
		PageFactory.initElements(driver, this);
}


@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement addrzz;
@FindBy(id="cc_num")
private WebElement cc;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement month;
@FindBy(id="cc_exp_year")
private WebElement year;
@FindBy(id="cc_cv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement bookclick;
@FindBy(id="order_no")
private WebElement orderno;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddrzz() {
	return addrzz;
}
public WebElement getCc() {
	return cc;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBookclick() {
	return bookclick;
}
public WebElement getOrderno() {
	return orderno;
}

public void firstNameGet(String fname) {
	fillTextBox(getFirstname(), fname);
}

public void lastNameGet(String lname) {
 fillTextBox(getLastname(), lname);
}

public void addrzget(String addrss) {
	fillTextBox(getAddrzz(), addrss);
}

public void ccno(String num) {
	fillTextBox(getCc(), num);
}

public void typecc() {
	btnClick(getCctype());
	dropDownSelect(getCctype());
	selectIndex(3);
}

public void monthget() {
	btnClick(getMonth());
	dropDownSelect(getMonth());
	selectIndex(4);
}

public void yearget() {
	btnClick(getYear());
	dropDownSelect(getYear());
	selectValue("2022");
}

public void clickbook() {
	btnClick(getBookclick());
	
}

public void noorder() {
	String number = orderno.getAttribute("value");
	Assert.assertTrue(number.length()==10);
}

public void scrollToOrder() {
	javaScrptExcuter();
	scrollingDown(getOrderno());
}

public void cvvnum(String numcvv) {
	fillTextBox(getCvv(), numcvv);
}























}
