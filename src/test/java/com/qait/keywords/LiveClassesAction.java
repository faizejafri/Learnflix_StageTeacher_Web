package com.qait.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qait.automation.getpageobjects.GetPage;

public class LiveClassesAction extends GetPage {

	public LiveClassesAction(WebDriver driver) {
		super(driver, "LiveClasses");
	}

	public void click_LiveClasses_tab() {
		click(element("a_sideLinks", "Live Classes"));
	}

///else block needs to be removed, no use of it-------------///////
	public boolean verify_LiveClasses_page() {
		if (element("heading_liveClasses").isDisplayed()) {
			logMessage("User is navigated to Live Classes tab");
			return true;
		} else {
			logMessage("User is not redirected to Live Classes tab!!");
		}
		return false;
	}

	public boolean verifyRightTabs(String tabName) {
		if (element("a_rightTabs", tabName).isDisplayed()) {
			logMessage(tabName + " tab is displayed");
			click(element("a_rightTabs", tabName));
			return true;
		} else {
			logMessage("Failure!! " + tabName + " tab is not displayed!");
		}
		return false;
	}

	public void click_CreateNewLiveClass_link() {
		click(element("a_CreateLiveClass"));
		hardWait(5);
	}

	public boolean verify_LiveClass_input_field(String fieldName) {
		if (element("fields_CreateLiveClass", fieldName).isDisplayed()) {
			logMessage(fieldName + " field is displayed");
			return true;
		} /*
			 * else { logMessage("Failure!! " + fieldName + " field is not displayed!");
			 * return false;
			 */
//			Assert.assertT
		return false;
	}

	public boolean verify_LiveClass_Dropdowm_field(String fieldName) {
		if (element("dropdown_fieldLiveClass", fieldName).isDisplayed()) {
			logMessage(fieldName + " field is displayed");
			return true;
		}
		return false;
	}

	public void Enter_Details_inInputField(String fieldName, String fieldData) {
		element("fields_CreateLiveClass", fieldName).sendKeys(fieldData);
	}

	public void Select_MeetingProvider() {
		element("meetingProvider_Dropdown").click();
	}

	public void Enter_Details_inDropdownField(String fieldName) {
		WebElement elementE = element("dropdown_fieldLiveClass", fieldName);
		elementE.click();
		/*
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * 
		 * if (elementE.getText().equals("Meeting Provider")) {
		 * click(element("DropdownOptions","Google Meet")); } else
		 * if(elementE.getText().equals("Target Audience")){ //
		 * click(element("DropdownOptions","Google Meet"));
		 * 
		 * }
		 */
	}

	public void addDate() {
//		element("fields_gCreateLiveClass", "start_time")

		WebElement BirthDate = element("date");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		BirthDate.click();
//		sendKeysUsingXpathInJavaScriptExecutor(BirthDate, "25");
		
		
//		BirthDate.sendKeys("25");

		/*
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); LocalDate
		 * localDate = LocalDate.now(); element("date").sendKeys(dtf.format(localDate));
		 */

//		System.out.println(element("fields_CreateLiveClass", "start_time").getText() + "**********");
	}

}
