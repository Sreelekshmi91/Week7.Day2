package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
public ViewLeadPage(RemoteWebDriver inwardDriver) {
	this.driver = inwardDriver;
	PageFactory.initElements(driver, this);

}
public ViewLeadPage verifyLeadID() {
	String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
	System.out.println(leadID);
	return this;

}
public ViewLeadPage verifyDisplaying_records() {
	boolean displayed = driver.findElement(By.className("x-paging-info")).isDisplayed();
	Assert.assertTrue(displayed);
	return this;

}
}