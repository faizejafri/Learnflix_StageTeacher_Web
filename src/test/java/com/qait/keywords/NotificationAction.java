
package com.qait.keywords;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;

public class NotificationAction extends GetPage {

	public ArrayList<String> markedStudents = new ArrayList<String>();
	public ArrayList<String> markedSections = new ArrayList<String>();

	public NotificationAction(WebDriver driver) {
		super(driver, "Notifications");
	}

	public void click_Notifications_tab() {
		click(element("a_sideLinks", "Notifications"));
	}

///else block needs to be removed, no use of it-------------///////
	public boolean verify_Notifications_page() {
		if (element("heading_notifications").isDisplayed()) {
			logMessage("User is navigated to Notifications tab");
			return true;
		}
		return false;
	}

	public boolean verify_OlderTab() {
		if (element("olderTab").isDisplayed()) {
			logMessage("Older tab is displayed!");
			click(element("olderTab"));
			logMessage("Verify collapsing older tab:  ");
			click(element("olderTab"));
			return true;
		}
		return false;
	}

	public boolean verify_SearchIcon_isDisplayed() {
		if (element("searchIcon").isDisplayed()) {
			logMessage("Search Icon is displayed!");
			return true;
		}
		return false;
	}

	public void click_SearchIcon() {
		click(element("searchIcon"));
		hardWait(10);
	}

	public void click_onBackButton() {
		click(element("backButton"));
	}

	public void click_CreateNewNotification() {
		click(element("a_CreateNewNotification"));
	}

	public boolean verify_SearchNotifications_page() {
		// getting some issues file fetching the element from .spec file, that's why
		// used the Selenium method directly.
		if (driver.findElement(By.xpath("//div[text()='SEARCH FOR NOTIFICATIONS']")).isDisplayed()) {
			logMessage("User is redirected to the correct page!");
			return true;
		}
		return false;

	}

	public boolean click_onAnySubject(String SubjectName) {
		if (element("a_SubjectName", SubjectName).isDisplayed()) {
			logMessage(SubjectName + " is displayed!");
			click(element("a_SubjectName", SubjectName));
			logMessage(SubjectName + " is clickable!");
			return true;
		}
		return false;
	}

	public boolean click_onOtherSubject(String otherSubject) {
		if (element("Other_Subject", otherSubject).isDisplayed()) {
			logMessage(otherSubject + " is displayed!");
			click(element("Other_Subject", otherSubject));
			logMessage(otherSubject + " is clickable!");
			return true;
		}
		return false;
	}

	public boolean click_onAnyTargetAudience(String type_OfAudience) {
		if (element("a_TargetAudience", type_OfAudience).isDisplayed()) {
			logMessage(type_OfAudience + " is displayed!");
			click(element("a_TargetAudience", type_OfAudience));
			logMessage(type_OfAudience + " is clickable!");
			return true;
		}
		return false;
	}

	public boolean verify_ContinueBtn() {
		if (element("btn_Continue").isDisplayed()) {
			logMessage("Continue button is displayed!");
			if (element("btn_Continue").isEnabled()) {
				logMessage("Continue button is Enabled!");
				click(element("btn_Continue"));
				return true;
			}
		}
		return false;
	}

	public void click_onContinueButton() {
		click(element("btn_Continue"));
	}

	public void click_onSendButton() {
		click(element("btn_Send"));
	}

	public String verify_ErrorMessage() {
		if (element("error_SelectTargetAudience").isDisplayed()) {
			logMessage("Error: Please Select Target Audience Type is displayed! ");
			String error_Msg = element("error_SelectTargetAudience").getText();
			return error_Msg;
		}

		return null;
	}

	public boolean verify_IndividualStudentSelection_Page(String title) {
		if (element("StudentSelection_heading", title).isDisplayed()) {
			logMessage(title + "is displayed! User is redirected to the Correct page!");
			return true;
		}
		return false;
	}

	public boolean verify_Class(String className) {
		if (element("a_Classes", className).isDisplayed()) {
			logMessage(className + " is displayed under Individual Student Selection");
			if (element("a_Classes", className).isEnabled()) {
				logMessage(className + " is Enabled!! ");
				click(element("a_Classes", className));
				return true;
			}
		}
		return false;
	}

	public void click_onClass(String className) {
		click(element("a_Classes", className));
	}

	public boolean verifyStudent(String studentName) {
		logMessage("Number of Students are " + elements("check_Students").size());

		if (element("mark_Individuals", studentName).isEnabled()) {
			logMessage(studentName + " is Enabled");
			click(element("mark_Individuals", studentName));
			logMessage(studentName + " is marked");
			return true;
		}
		return false;
	}

	public String verify_StudentError() {
		if (element("error_PleaseSelectStudent").isDisplayed()) {
			logMessage("Error: Please Select Atleast One Student is displayed! ");
			String error_Msg = element("error_PleaseSelectStudent").getText();
			return error_Msg;
		}
		return null;
	}

	public void click_onAddButton() {
		click(element("btn_Add"));
	}

	public void select_Students_toBe_Marked(String className, String studentName) {
		click(element("a_Classes", className)); // click on Class
		hardWait(5);
		click(element("mark_Individuals", studentName));

		markedStudents.add(element("mark_Individuals", studentName).getText() + "");

	}

	public void select_Sections_toBe_Marked(String sectionName) {
		click(element("mark_Individuals", sectionName));
		markedSections.add(element("mark_Individuals", sectionName).getText() + "");

	}

	public boolean verify_Confirm_Students_List_under_IndividualStudent() {

		for (int i = 0; i < markedStudents.size(); i++) {
			try {
				if (element("students_ConfirmPopup", markedStudents.get(i)).isDisplayed()) {
					logMessage(markedStudents.get(i) + " is displayed on Popup!!");
				}
			} catch (Exception e) {
				return false; // element not found
			}
		}
		return true;
	}

	public boolean verify_Confirm_Students_List_under_EntireSection() {

		for (int i = 0; i < markedSections.size(); i++) {
			try {
				if (element("sections_ConfirmPopup", markedSections.get(i)).isDisplayed()) {
					logMessage(markedSections.get(i) + " is displayed on Popup!!");
				}
			} catch (Exception e) {
				return false; // element not found
			}
		}
		return true;
	}

	public boolean verify_selecting_section(String sectionName) {
		if (element("check_SectionSelection", sectionName).isDisplayed()) {
			logMessage(sectionName + " is displayed! ");
			click(element("check_SectionSelection", sectionName));
			return true;
		}
		return false;
	}

	public boolean verify_SendButton() {
		if (element("btn_Send").isDisplayed()) {
			logMessage("Send button is displayed! ");
			if (element("btn_Send").isEnabled()) {
				click(element("btn_Send"));
				return true;
			}
		}
		return false;
	}

	public boolean verify_Notification_field(String fieldName) {
		if (element("fields_notificationPopup", fieldName).isDisplayed()) {
			logMessage(fieldName + " field is displayed");
			return true;
		}
		return false;
	}

	public ArrayList<String> verify = new ArrayList<String>();

	public void Enter_Details_inInputField(String fieldName, String fieldData) {
		element("fields_notificationPopup", fieldName).sendKeys(fieldData);
		verify.add(fieldData);
	}

	public String verify_NotificationSuccess_Message() {
		if (element("success_NotificationMessage").isDisplayed()) {
			logMessage("Notification Successfully Sent message is displayed! ");
			String Msg = element("success_NotificationMessage").getText();
			return Msg;
		}
		return null;
	}

	public boolean verify_notification_on_homepage() {

		for (int i = 0; i < verify.size(); i++) {
			if (element("verify_notification", verify.get(0)).isDisplayed()) {
				System.out.println(verify.get(0) + " Heading of the notification");
				logMessage(verify.get(0) + " Notification is displayed on Homepage");
				return true;
			}
		}
		return false;
	}

	public void perform_Logout() {
		click(element("profile_icon"));
		click(element("dropdownElements", "LOGOUT"));
	}

	public void Login_Using_Student_Credentials() {
//		driver.get(YamlReader.getData("app_url"));
		click(element("button_SignInOptions", "Sign in with School Id"));
		element("login_textBox_username").sendKeys(YamlReader.getData("credentials.Studentusername"));
		element("login_textBox_password").sendKeys(YamlReader.getData("credentials.Studentpassword"));
		hardWait(5);
		click(element("btn_Continue_While_logging"));
		hardWait(5);
	}
}
