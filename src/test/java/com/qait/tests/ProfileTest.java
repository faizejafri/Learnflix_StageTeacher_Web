package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class ProfileTest extends TestSessionInitiator {

	@Test(priority = 0)
	public void Login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	@Test(priority = 1)
	public void verify_Profile_page_redirects_correctly() {
		profileAction.click_onProfileSideLink();
		Assert.assertTrue(profileAction.verify_Profile_page());
	}

	@Test(priority = 2)
	public void verify_Notification_icon() {
		Assert.assertTrue(profileAction.verify_Notification_icon());
	}

	@Test(priority = 3)
	public void verify_headings_at_the_right() {
		Assert.assertTrue(profileAction.verify_Headings("SUBJECTS"));
		Assert.assertTrue(profileAction.verify_Headings("CLASSES"));
		Assert.assertTrue(profileAction.verify_Headings("OTHER INFORMATION"));
	}

	@Test(priority = 4)
	public void verify_Subjects_are_displayed() {
		Assert.assertTrue(profileAction.verify_Subjects("Mathematics"));
		Assert.assertTrue(profileAction.verify_Subjects("Science"));
	}

	@Test(priority = 5)
	public void verify_Classes_are_displayed() {
		Assert.assertTrue(profileAction.verify_Classes("Class 6_A"));
		Assert.assertTrue(profileAction.verify_Classes("Class 6_B"));
		Assert.assertTrue(profileAction.verify_Classes("Class 6_C"));
	}

	@Test(priority = 6)
	public void verify_OtherInformation_Section() {
		Assert.assertTrue(profileAction.verif_OtherInfo("SCHOOL"));
		Assert.assertTrue(profileAction.verif_OtherInfo("USERNAME"));
		Assert.assertTrue(profileAction.verif_OtherInfo("EMAIL"));
	}
}
