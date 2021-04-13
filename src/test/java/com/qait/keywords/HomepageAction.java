package com.qait.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class HomepageAction extends GetPage {

	public HomepageAction(WebDriver driver) {
		super(driver, "Homepage");
	}

	public boolean verify_SideLinks(String sideLinkName) {
		if (element("a_sideLinks", sideLinkName).isDisplayed()) {
			logMessage(sideLinkName + " link is displayed");
			return true;
		} else {
			logMessage(sideLinkName + " link is not displayed");
		}
		return false;
	}

	public boolean verify_learnflix_logo() {
		if (element("img_logo").isDisplayed()) {
			logMessage("Verified! Learnflix logo is displayed");
			return true;
		} else {
			logMessage("Learnflix logo is not present");
		}
		return false;
	}

	public void clickOnProfileIcon() {
		click(element("profile_icon"));
	}

	public boolean verifyProfileDropdown(String elementName) {
		if (element("dropdownElements", elementName).isDisplayed()) {
			logMessage("Verified: Dropdown Element " + elementName + " is displayed!");
			return true;
		} else {
			logMessage("Dropdown Element \" + elementName + \" is not displayed!");
		}
		return false;
	}

	public boolean verify_HomeTab_links(String linkName) {
		if (element("HomeTab_Links", linkName).isDisplayed()) {
			logMessage("Verified: " + linkName + " Links is displayed on Home Tab");
			return true;
		} else {
			logMessage(linkName + " is not displayed!");
		}
		return false;
	}

	public boolean verify_Create_links(String sideLink, String Create_link) {
		click(element("a_sideLinks", sideLink)); // clicked on Respective side link
		if (element("a_CreateLinks", Create_link).isDisplayed()) {
			logMessage("Verified:" + Create_link + " is displayed on " + sideLink + "tab");
			return true;
		} else {
			logMessage("Create Homework link is not displayed!");
		}
		return false;
	}

	public boolean verify_CreateNewAssessment_link(String link) {
		if (element("a_CreateLinks", link).isDisplayed()) {
			logMessage("Verified: Create Homework Link is displayed on Homework Tab");
			return true;
		} else {
			logMessage("Create New Assessment is not displayed!");
		}
		return false;
	}

}
