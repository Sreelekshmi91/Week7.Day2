package com.leaftaps.ui.pages.spanish;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	@CacheLookup
	@FindBy(how = How.ID, using = "createLeadForm_companyName") private WebElement elementCompanyName;
	@FindBy(how = How.ID, using = "createLeadForm_firstName") private WebElement elementFirstName;
	@FindBy(how = How.ID, using = "createLeadForm_lastName") private WebElement elementLastName;
	@FindBy(how = How.NAME, using = "submitButton") private WebElement elementsubmitButton;

	
	public CreateLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	public CreateLeadPage typeCompanyName(String CompanyName) {
		elementCompanyName.sendKeys(CompanyName);
		return this;
	}
	public CreateLeadPage typeFirstName(String FirstName) {
		elementFirstName.sendKeys(FirstName);
		return this;
	}
	public CreateLeadPage typeLastName(String LastName) {
		elementLastName.sendKeys(LastName);
		return this;
	}
	public ViewLeadPage clickCreateLeadButton() {
		elementsubmitButton.click();
		return new ViewLeadPage(driver);
	}
}


