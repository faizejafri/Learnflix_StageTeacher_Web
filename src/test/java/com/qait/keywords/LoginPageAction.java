package com.qait.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;

public class LoginPageAction extends GetPage {

	public LoginPageAction(WebDriver driver) {
		super(driver, "LoginPage");
	}

	public void launchApplicationUrl() {
		driver.get(YamlReader.getData("app_url"));

	}

	public boolean verifySignInUsingSchoolId() {
		return isElementDisplayed("button_SignInOptions", "Sign in with School Id");

	}

	public boolean verifySignInUsingPhoneNumber() {
		return isElementDisplayed("button_SignInOptions", "Sign in with Phone Number");
	}

	public boolean clickSignInUsingSchoolId() {
		click(element("button_SignInOptions", "Sign in with School Id"));
		return isElementDisplayed("p_LoginHeading");
	}
	
	public void ClickSignIn_UsingSchoolId() {
		click(element("button_SignInOptions", "Sign in with School Id"));

	}

	public boolean verifyLogo() {
		return isElementDisplayed("img_logo");
	}

	public boolean verifyUsernameTextfield() {
		return isElementDisplayed("login_textBox_username");
	}

	public boolean verifyPasswordTextfield() {
		return isElementDisplayed("login_textBox_password");
	}

	public void enterValidCredentials() {
		element("login_textBox_username").sendKeys(YamlReader.getData("credentials.username"));
		element("login_textBox_password").sendKeys(YamlReader.getData("credentials.password"));
	}

	public void enterInValidCredentials() {
		element("login_textBox_username").sendKeys("abcd");
		element("login_textBox_password").sendKeys("xyz");
	}

	public void clickOnContine() {
		click(element("btn_Continue"));
		hardWait(7);
	}

	public boolean verifyHomepage() {
		String url = getPageUrl();
//		System.out.println(url + "        Current URL ");
		return url.contains("teacher-home");
	}

	public String verifyErrorMessage() {
		return element("p_errorMessage").getText();

	}
}
