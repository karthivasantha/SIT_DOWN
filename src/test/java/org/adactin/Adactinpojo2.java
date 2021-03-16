package org.adactin;

import org.base1.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo2 extends Baseclass {
	
	public Adactinpojo2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="room_nos")
	private WebElement rooms;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="Submit")
	private WebElement submitclick;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRooms() {
		return rooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getSubmitclick() {
		return submitclick;
	}

	public void locationGet( ) {
	btnClick(getLocation());
	dropDownSelect(getLocation());
	selectValue("Brisbane");
	}
	
	public void roomsGet() {
		btnClick(getRooms());
		dropDownSelect(getRooms());
		selectIndex(2);
	}
	
	public void checkindate(String datein) {
		clearBrowser(getCheckin());
		fillTextBox(getCheckin(), datein);
	}

	public void checkoutdate(String dateout) {
		clearBrowser(getCheckout());
		fillTextBox(getCheckout(), dateout);
	}

	public void adultsget() {
		btnClick(getAdult());
		dropDownSelect(getAdult());
		selectIndex(2);
	}

  public void clicksubmit() {
	  btnClick(getSubmitclick());
}











}

















