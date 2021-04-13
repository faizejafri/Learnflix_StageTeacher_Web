package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;
import com.qait.automation.utils.YamlReader;

public class LoginTest extends TestSessionInitiator {

	@Test(priority = 1)
	public void launchApplication() throws Throwable {
		loginAction.launchApplicationUrl();
		Assert.assertEquals(YamlReader.getData("app_url"), getCurrentURL());
	}

	@Test(priority = 2)
	public void verifySignInOptions() throws Throwable {
		Assert.assertTrue(loginAction.verifySignInUsingSchoolId());
		Assert.assertTrue(loginAction.verifySignInUsingPhoneNumber());
	}

	@Test(priority = 3)
	public void verifyUsingSchoolId() throws Throwable {
		Assert.assertTrue(loginAction.clickSignInUsingSchoolId());
	}

	@Test(priority = 4)
	public void verifyBasicPageElements() throws Throwable {
		Assert.assertTrue(loginAction.verifyLogo());
		Assert.assertTrue(loginAction.verifyUsernameTextfield());
		Assert.assertTrue(loginAction.verifyPasswordTextfield());
	}

	@Test(priority = 5)
	public void verifyLogin_VALIDcredentials() {
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}
}
