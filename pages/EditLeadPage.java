package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']") private WebElement elementPhoneNumber;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']") private WebElement elementFindLeads;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") private WebElement elementLeadID;
	@FindBy(how = How.LINK_TEXT, using = "Edit") private WebElement elementEdit;
	@FindBy(how = How.ID, using = "updateLeadForm_companyName") private WebElement elementUpdateCompanyName;
	@FindBy(how = How.NAME, using = "submitButton") private WebElement elementsubmitButton;

		
	public EditLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	public EditLeadPage typePhoneNumber(String PhoneNumber) {
		elementPhoneNumber.sendKeys(PhoneNumber);
		return this;
	}
	public EditLeadPage clickFindLeads() throws InterruptedException {
		elementFindLeads.click();
		Thread.sleep(2000);
		return this;
	}
	public EditLeadPage clickLeadID() {
		elementLeadID.click();
		return this;
	}

	public EditLeadPage clickEditLead() {
		elementEdit.click();
		return this;
	}

	public EditLeadPage typeCompanyName(String CompanyName) {
		elementUpdateCompanyName.clear();
		elementUpdateCompanyName.sendKeys(CompanyName);
				return this;
	}

	public ViewLeadPage clickEditLeadButton() {
		elementsubmitButton.click();
		return new ViewLeadPage(driver);
	}
}