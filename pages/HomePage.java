package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	@CacheLookup
	@FindBy(how = How.LINK_TEXT, using = "Leads") private WebElement elementLeads;
	
public HomePage(RemoteWebDriver inwardDriver) {
	this.driver = inwardDriver;
	PageFactory.initElements(driver, this);
}
public MyLeadsPage clickLeads() {
	elementLeads.click();
	return new MyLeadsPage(driver);
}
}