package com.leaftaps.ui.pages.spanish;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	
	@CacheLookup
	@FindBy(how = How.LINK_TEXT, using = "Crear Prospecto") private WebElement elementCreateLead;
	@FindBy(how = How.LINK_TEXT, using = "Buscar Prospectos") private WebElement elementFindLeads;
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']") private WebElement elementPhone;
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']") private WebElement element_Phone;
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']") private WebElement element_Phone1;
	@FindBy(how = How.LINK_TEXT, using = "Fusionar Prospectos") private WebElement elementMergeLeads;

	public MyLeadsPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	public CreateLeadPage clickCreateLead() {
		elementCreateLead.click();
		return new CreateLeadPage(driver);
	}
	
	public MyLeadsPage clickFindLeads() {
		elementFindLeads.click();
		return this;
	}
	
	public EditLeadPage clickPhone() {
		elementPhone.click();
		return new EditLeadPage(driver);
	}
	
	public DuplicateLeadPage click_Phone() {
		element_Phone.click();
		return new DuplicateLeadPage(driver);
	}
	
	public DeleteLeadPage click_Phone1() {
		element_Phone1.click();
		return new DeleteLeadPage(driver);
	}
	
	public MergeLeadPage clickMergeLeads() {
		elementMergeLeads.click();
		return new MergeLeadPage(driver);
	}
}
