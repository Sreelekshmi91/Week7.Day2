package com.leaftaps.ui.pages.spanish;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class DeleteLeadPage extends ProjectSpecificMethods{
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber']") private WebElement elementPhoneNumber;
	@FindBy(how = How.XPATH, using = "//button[text()='Buscar Prospectos']") private WebElement elementFindLeads;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") private WebElement elementLeadID;
	@FindBy(how = How.LINK_TEXT, using = "Eliminar") private WebElement elementDelete;
	@FindBy(how = How.LINK_TEXT, using = "Buscar Prospectos") private WebElement elementFind_Leads;
	@FindBy(how = How.XPATH, using = "//input[@name='id']") private WebElement element_leadID;
	@FindBy(how = How.XPATH, using = "//button[text()='Buscar Prospectos']") private WebElement element_FindLeadsButton;
	
	public DeleteLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	public DeleteLeadPage typePhoneNumber(String PhoneNumber) {
		elementPhoneNumber.sendKeys(PhoneNumber);
		return this;
	}
	public DeleteLeadPage clickFindLeads() throws InterruptedException {
		elementFindLeads.click();
		Thread.sleep(2000);
		return this;
	}
	public DeleteLeadPage clickLeadID_DeleteLead_Find_Leads_showDeletedLeadID() {
		String leadID = elementLeadID.getText();
	elementLeadID.click();
	elementDelete.click();
	elementFind_Leads.click();
	element_leadID.sendKeys(leadID);
	return this;
	}
	public ViewLeadPage clickFind_LeadsButton(){
		element_FindLeadsButton.click();
	return new ViewLeadPage(driver);	
	}
}

