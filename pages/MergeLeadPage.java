package com.leaftaps.ui.pages;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods{
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//img[@alt='Lookup']") private WebElement elementWidgetofFromLead;
	@FindBy(how = How.XPATH, using = "(//a[@class='linktext'])[3]") private WebElement elementFirstResultingLead;
	@FindBy(how = How.XPATH, using = "(//img[@alt='Lookup'])[2]") private WebElement elementWidgetofToLead;
	@FindBy(how = How.XPATH, using = "(//a[@class='linktext'])[3]") private WebElement elementSecondResultingLead;
	@FindBy(how = How.LINK_TEXT, using = "Merge") private WebElement elementMerge;
	@FindBy(how = How.LINK_TEXT, using = "Find Leads") private WebElement elementFind_Leads;
	@FindBy(how = How.XPATH, using = "//input[@name='id']") private WebElement element_leadID;
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']") private WebElement element_FindLeadsButton;

	
	
	public MergeLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
	}
	public MergeLeadPage clickonWidgetofFromLeadandFirstResultingLead() throws InterruptedException {
		elementWidgetofFromLead.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		Thread.sleep(2000);
		elementFirstResultingLead.click();
		driver.switchTo().window(windowHandlesList.get(0));
		Thread.sleep(3000);
		return this;

	}
	public MergeLeadPage clickonWidgetofToLeadandSecondResultingLead() throws InterruptedException {
		elementWidgetofToLead.click();
		Set<String> towindowHandles = driver.getWindowHandles();
		List<String> towindowHandlesList = new ArrayList<String>(towindowHandles);
		driver.switchTo().window(towindowHandlesList.get(1));
		Thread.sleep(2000);
		elementSecondResultingLead.click();
		driver.switchTo().window(towindowHandlesList.get(0));
		return this;
	}
	public MergeLeadPage click_MergeButton() {
		elementMerge.click();
		driver.switchTo().alert().accept();
		return this;
	}

	public MergeLeadPage clickFindLeads() {
		elementFind_Leads.click();
		return this;
	}

	public MergeLeadPage enterLeadID(String ID) {
		element_leadID.sendKeys(ID);
		return this;
	}

	public ViewLeadPage clickFindLeadsButton() {
		element_FindLeadsButton.click();
		return new ViewLeadPage(driver);	
	}
}