package com.qait.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class ProfileAction extends GetPage {

	public ProfileAction(WebDriver driver) {
		super(driver, "Profile");
	}

	public void click_onProfileSideLink() {
		click(element("profileSideLink"));
	}

	public boolean verify_Profile_page() {
		if (element("heading_profilePage").isDisplayed()) {
			logMessage("User is navigated to Correct tab (Profile Tab) ");
			return true;
		}
		return false;
	}

	public boolean verify_Headings(String headingName) {
		if (element("p_Headings", headingName).isDisplayed()) {
			logMessage(headingName + "heading is displayed!");
			return true;
		}
		return false;
	}

	public boolean verify_Subjects(String SubjName) {
		if (element("Subjects", SubjName).isDisplayed()) {
			logMessage(SubjName + " is displayed!");
			return true;
		}
		return false;
	}

	public boolean verify_Classes(String className) {
		if (element("Classes", className).isDisplayed()) {
			logMessage(className + " is displayed!");
			return true;
		}
		return false;
	}

	public boolean verif_OtherInfo(String elementName) {
		if (element("OtherInfo", elementName).isDisplayed()) {
			logMessage(elementName + " is displayed!");
			return true;
		}
		return false;
	}

	public boolean verify_Notification_icon() {
		if (element("notificationIcon").isDisplayed()) {
			logMessage("Notification icon is displayed at top right!");
			if (element("notificationIcon").isEnabled()) {
				click(element("notificationIcon"));
				return true;
			}
		}
		return false;
	}
}
