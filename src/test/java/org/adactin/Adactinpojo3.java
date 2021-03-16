package org.adactin;

import org.base1.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinpojo3  extends Baseclass{
	public Adactinpojo3() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="radiobutton_2")
private WebElement radiobtn;
@FindBy(id="continue")
private WebElement contclick;
public WebElement getRadiobtn() {
	return radiobtn;
}
public WebElement getContclick() {
	return contclick;
}

public void radiobtnget() {
	btnClick(getRadiobtn());
}
public void clickcontinue() {
	btnClick(getContclick());
}








}