package com.leaftaps.ui.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	@CacheLookup
	@FindBy(how = How.ID, using = "username") private WebElement elementUsername;
	@FindBy(how = How.ID, using = "password") private WebElement elementPassword;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") private WebElement elementLoginButton;

public LoginPage(RemoteWebDriver inwardDriver) {
	this.driver = inwardDriver;
	PageFactory.initElements(driver, this);
}
public LoginPage typeUserName(String username) {
	elementUsername.sendKeys(username);
	return this;
//return new LoginPage();
//	LoginPage page = new LoginPage();
//	return page;
}
public LoginPage typePassword(String password) {
	elementPassword.sendKeys(password);
	return this;
}
public WelcomePage clickLoginButton() {
	elementLoginButton.click();
	return new WelcomePage(driver);
}
}