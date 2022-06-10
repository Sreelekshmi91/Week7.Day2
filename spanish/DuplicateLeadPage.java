package com.leaftaps.ui.pages.spanish;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']") private WebElement elementPhoneNumber;
	@FindBy(how = How.XPATH, using = "//button[text()='Buscar Prospectos']") private WebElement elementFindLeads;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") private WebElement elementLeadID;
	@FindBy(how = How.LINK_TEXT, using = "Duplicar Prospecto") private WebElement elementDuplicateLeads;
	@FindBy(how = How.NAME, using = "submitButton") private WebElement elementsubmitButton;

	public DuplicateLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	public DuplicateLeadPage typePhoneNumber(String PhoneNumber) {
		elementPhoneNumber.sendKeys(PhoneNumber);
		return this;
	}
	public DuplicateLeadPage clickFindLeads() throws InterruptedException {
		elementFindLeads.click();
		Thread.sleep(2000);
		return this;
	}
	public DuplicateLeadPage clickLeadID() {
		elementLeadID.click();
		return this;
	}

	public DuplicateLeadPage clickDuplicateLead() {
		elementDuplicateLeads.click();
		return this;
	}

	public ViewLeadPage clickDuplicateLeadButton() {
		elementsubmitButton.click();
		return new ViewLeadPage(driver);

	}




}