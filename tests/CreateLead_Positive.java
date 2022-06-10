package com.leaftaps.ui.tests;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;

import com.leaftaps.ui.pages.LoginPage;



public class CreateLead_Positive extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc001";
	}
	@Test(dataProvider = "getData")
	public void tc001(String username, String password, String CompanyName, String FirstName, String LastName) {
		new LoginPage(driver)
		.typeUserName(username)
		.typePassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(CompanyName)
		.typeFirstName(FirstName)
		.typeLastName(LastName)
		.clickCreateLeadButton()
		.verifyLeadID();

	
	}
	
	}


