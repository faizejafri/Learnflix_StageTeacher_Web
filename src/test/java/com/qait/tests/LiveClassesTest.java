package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class LiveClassesTest extends TestSessionInitiator {

	@Test(priority = 0)
	public void Login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	@Test(priority = 1)
	public void Verify_LiveClasses_page() {
		liveClassesAction.click_LiveClasses_tab();
		Assert.assertTrue(liveClassesAction.verify_LiveClasses_page());
	}

	@Test(priority = 2)
	public void verify_RightSide_tabs() {
		Assert.assertTrue(liveClassesAction.verifyRightTabs("TODAY"));
//				, "Field is not displayed");
		Assert.assertTrue(liveClassesAction.verifyRightTabs("UPCOMING"));
		Assert.assertTrue(liveClassesAction.verifyRightTabs("COMPLETED"));
	}

	@Test(priority = 3)
	public void verify_input_LiveClassesFields() {
		liveClassesAction.click_CreateNewLiveClass_link();
		Assert.assertTrue(liveClassesAction.verify_LiveClass_input_field("subject_name"));
		Assert.assertTrue(liveClassesAction.verify_LiveClass_input_field("topic_name"));
		Assert.assertTrue(liveClassesAction.verify_LiveClass_input_field("meeting_url"));
		Assert.assertTrue(liveClassesAction.verify_LiveClass_input_field("start_time"));
		Assert.assertTrue(liveClassesAction.verify_LiveClass_input_field("end_time"));
	}

	@Test(priority = 4)
	public void verify_dropdown_LiveClassesFields() {
//		liveClassesAction.click_CreateNewLiveClass_link();
		Assert.assertTrue(liveClassesAction.verify_LiveClass_Dropdowm_field("Meeting Provider"));
		Assert.assertTrue(liveClassesAction.verify_LiveClass_Dropdowm_field("Target Audience"));
	}

	/*
	 * @Test(priority = 5) public void EnterDetails_inLiveClass() { // Element
	 * liveClassesAction.Enter_Details_inInputField("subject_name", "Mathematics");
	 * liveClassesAction.Enter_Details_inInputField("topic_name", "Algebra");
	 * liveClassesAction.Enter_Details_inInputField("meeting_url",
	 * "http://www.google.com");
	 * 
	 * liveClassesAction.Enter_Details_inDropdownField("Meeting Provider");
	 * liveClassesAction.Enter_Details_inDropdownField("Target Audience");
	 * 
	 * liveClassesAction.Select_MeetingProvider();
	 * 
	 * }
	 */

	/// BUG REPORTED(Target Audience Dropdown is not functional)

	@Test(priority = 5)
	public void sendDate() {
//		liveClassesAction.click_CreateNewLiveClass_link();
		liveClassesAction.addDate();
//		Assert.assertTrue(liveClassesAction.verify_LiveClass_Dropdowm_field("Target Audience"));
	}

}
