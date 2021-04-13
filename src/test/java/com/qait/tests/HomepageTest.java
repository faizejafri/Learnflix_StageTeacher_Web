package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class HomepageTest extends TestSessionInitiator {

	@Test(priority = 0)
	public void Login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	@Test(priority = 1)
	public void verify_SideLinks_are_present() {
		Assert.assertTrue(homepageAction.verify_SideLinks("Teach"));
		Assert.assertTrue(homepageAction.verify_SideLinks("Homework"));
		Assert.assertTrue(homepageAction.verify_SideLinks("Assessments"));
		Assert.assertTrue(homepageAction.verify_SideLinks("Live Classes"));
		Assert.assertTrue(homepageAction.verify_SideLinks("Notifications"));
		Assert.assertTrue(homepageAction.verify_SideLinks("Profile"));
	}

	@Test(priority = 2)
	public void verify_Learnflix_logo() {
		Assert.assertTrue(homepageAction.verify_learnflix_logo());
	}

	@Test(priority = 3)
	public void verify_Profile_Dropdown() {
		homepageAction.clickOnProfileIcon();
		Assert.assertTrue(homepageAction.verifyProfileDropdown("PROFILE"));
		Assert.assertTrue(homepageAction.verifyProfileDropdown("FEEDBACK"));
		Assert.assertTrue(homepageAction.verifyProfileDropdown("LOGOUT"));
	}

	@Test(priority = 4)
	public void verify_Home_Tab_links() {
		Assert.assertTrue(homepageAction.verify_HomeTab_links("Create Test"));
		Assert.assertTrue(homepageAction.verify_HomeTab_links("Assign Test"));
		Assert.assertTrue(homepageAction.verify_HomeTab_links("Create Homework"));
		Assert.assertTrue(homepageAction.verify_HomeTab_links("Assign Homework"));
	}

	@Test(priority = 5)
	public void verify_CreateHomework_link() {
		Assert.assertTrue(homepageAction.verify_Create_links("Homework", "Create Homework"));
	}

	@Test(priority = 6)
	public void verify_CreateNewAssessment_link() {
		Assert.assertTrue(homepageAction.verify_Create_links("Assessments", "Create New Assessment"));
	}

	@Test(priority = 7)
	public void verify_CreateLiveClass_link() {
		Assert.assertTrue(homepageAction.verify_Create_links("Live Classes", "Create Live Class"));
	}

	@Test(priority = 8)
	public void verify_CreateNewNotifications_link() {
		Assert.assertTrue(homepageAction.verify_Create_links("Notifications", "Create New Notification"));
	}
}
