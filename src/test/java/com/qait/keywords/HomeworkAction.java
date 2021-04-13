package com.qait.keywords;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qait.automation.getpageobjects.GetPage;

public class HomeworkAction extends GetPage {

	public ArrayList<Integer> al;
	public static int totalnoOfQues;

	public HomeworkAction(WebDriver driver) {
		super(driver, "Homework");
	}

	public void click_Homework_tab() {
		click(element("a_sideLinks", "Homework"));
	}

	public boolean verify_sideTabs(String tabName) {
		if (element("homepage_tabs", tabName).isDisplayed()) {
			logMessage(tabName + " is displayed! ");
			click(element("homepage_tabs", tabName));
			logMessage(tabName + " Expanded! ");
			return true;
		}
		return false;
	}

	public void click_onSidetab(String tabName) {
		click(element("homepage_tabs", tabName));
	}

	public boolean verify_Homework_page() {
		if (element("heading_homework").isDisplayed()) {
			logMessage("User is navigated to Homework tab! ");
			return true;
		}
		return false;
	}

	public boolean verify_CreateHomework_Link_is_displayed() {
		if (element("a_CreateHomework").isDisplayed()) {
			logMessage("Create field is displayed");
			return true;
		}
		return false;
	}

	public void click_onCreateHomeworkLink() {
		click(element("a_CreateHomework"));
		hardWait(5);
	}

	public boolean verify_CreateHomework_page() {
		if (element("heading_CreateHomework").isDisplayed()) {
			logMessage("User is navigated to Create Homework Link! ");
			return true;
		}
		return false;
	}

	/*
	 * public boolean verify_CollapsibleTabs(S) { if
	 * (element("olderTab").isDisplayed()) { logMessage("Older tab is displayed!");
	 * click(element("olderTab")); logMessage("Verify collapsing older tab:  ");
	 * click(element("olderTab")); return true; } return false; }
	 */

	public boolean verify_NextBtn_should_beDisabled_before_Selecting_allFields() {
		if (element("btn_NextWhenDisable").isDisplayed()) {
			logMessage("Verified! Next Button is Disabled before filling all Fields");
			return true;
		}
		return false;
	}

	public boolean verify_SelectionFields(String fieldName) {
		if (element("fields_Selectable", fieldName).isDisplayed()) {
			logMessage(fieldName + " tab is displayed");
			click(element("fields_Selectable", fieldName));
			return true;
		}
		return false;
	}

	public boolean verify_DropdownFields(String fieldName) {
		if (element("fields_Dropdown", fieldName).isDisplayed()) {
			logMessage(fieldName + " tab is displayed");
//			click(element("fields_Dropdown", fieldName));
			return true;
		}
		return false;
	}

	public boolean click_onDropdown_Field(String fieldName, String value) {
		click(element("fields_Dropdown", fieldName));
		click(element("dropdown_SelectValue", value));
		logMessage("Selected " + fieldName + "value to " + value);
		return true;
	}

	public void click_On_HomeworkType(String fieldName) {
		click(element("fields_Selectable", fieldName));
	}

	public void click_OnNextButton() {
		click(element("btn_Next"));
	}

	public void click_Next() {
		click(element("next"));
		hardWait(5);
	}

	public boolean verify__Page(String title) {
		if (element("verification_heading", title).isDisplayed()) {
			logMessage(title + "is displayed! User is redirected to the Correct page!");
			return true;
		}
		return false;
	}

	public boolean verify_CreateQuiz_Fields(String fieldName) {
		if (element("fields_CreateQuiz", fieldName).isDisplayed()) {
			logMessage(fieldName + " is displayed!! ");
			return true;
		}
		return false;
	}

	///
	public boolean Enter_Details_inInputField(String fieldName, String fieldData) {
		element("fields_CreateQuiz", fieldName).sendKeys(fieldData);
		return true;
	}

	public boolean verify_ImportFromQuestionBank_Link() {
		if (element("a_ImportFromQB").isDisplayed()) {
			logMessage("Import From Question Bank Link is displayed on Create Quiz page!! ");
			if (element("a_ImportFromQB").isEnabled())
				logMessage("Import From Question Bank Link is Enabled!!");
			return true;
		}
		return false;
	}

	public void click_onImportFromQuestionBank_Link() {
		click(element("a_ImportFromQB"));
	}

	public boolean verify_AddNewQuestions_Link() {
		if (element("a_AddNewQ").isDisplayed()) {
			logMessage("Add New Questions Link is displayed on Create Quiz page!! ");
			if (element("a_AddNewQ").isEnabled())
				logMessage("Add New Questions Link is Enabled!!");
			return true;
		}
		return false;
	}

	public void click_onAddNewQuestions_Link() {
		click(element("a_AddNewQ"));
		hardWait(4);
	}

	public boolean verify_ImportFromQuestionBank_popup() {
		if (element("popup_ImportFromQB").isDisplayed()) {
			logMessage("Popup is displayed for adding Questions from Question Bank! ");
			return true;
		}
		return false;
	}

	public boolean verify_Dropdown_Fields(String fieldName) {
		if (element("dropdowns_ImportFQB", fieldName).isDisplayed()) {
			logMessage(fieldName + " is displayed!! ");
			return true;
		}
		return false;
	}

	public boolean select_From_Dropdown(String fieldName, String value) {
		click(element("dropdowns_ImportFQB", fieldName));
		click(element("dropdown_SelectValue", value));
		logMessage("Selected " + fieldName + " value as " + value);
		return true;
	}

	public boolean select_QuestionType_Dropdown(String fieldName, String value) {
		click(element("dropdowns_ImportFQB", fieldName));
		click(element("dropdowns_ImportFQB", value));
		logMessage("Selected " + fieldName + " value as " + value);
		return true;
	}

	public void click_onApplyButton() {
		click(element("btn_Apply"));
	}

	public void click_onCrossButton() {
		click(element("btn_Cross"));

	}

	public boolean click_onPickButton() {
		// find number of questions(Pick buttons)
		try {
			int noOfQues = elements("no_of_PickBtn").size();
			logMessage("Total number of Questions are : " + noOfQues);

			al = new ArrayList<Integer>();
			// taking indexes into array list
			al.add(0);
			al.add(1);
			al.add(noOfQues - 1);

			if (noOfQues > 3)
				al.add(noOfQues / 2);

			System.out.println("Indexes : " + al);

			List<WebElement> alWeb = new ArrayList<WebElement>();

			alWeb = elements("no_of_PickBtn"); // all pick buttons into list alWeb
			for (int i = 0; i < al.size(); i++) {

				click(alWeb.get(al.get(i))); // clicking on WebElement having indexes in al
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean click_onDeleteButton() {
		// find number of questions(Pick buttons)
		try {
			totalnoOfQues = elements("no_of_DeleteBtn").size();
			logMessage("Total number of Questions added are : " + totalnoOfQues);

			al = new ArrayList<Integer>();
			// taking indexes into array list
			al.add(0);
			al.add(totalnoOfQues - 1);

			if (totalnoOfQues > 3)
				al.add(totalnoOfQues / 2);

			System.out.println("Indexes : " + al);

			List<WebElement> alWeb = new ArrayList<WebElement>();

			alWeb = elements("no_of_DeleteBtn"); // all delete buttons into list alWeb
			for (int i = 0; i < al.size(); i++) {
				click(alWeb.get(al.get(i))); // clicking on WebElement delete button having indexes in al
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void click_onSaveQuestions() {
		click(element("save_Questions"));
		hardWait(5);
	}

	public boolean verify_noOfQuestions_added() {
		logMessage("Number of Questions picked = " + al.size());
		logMessage("Number of Questions added after picking = " + elements("no_OfQuestions_added").size());

		if (elements("no_OfQuestions_added").size() == al.size()) {
			logMessage("Verified: Number of questions added are equal to number of Questions selected !! ");
			return true;
		}
		return false;
	}

	public boolean verify_noOfQuestions_Deleted() throws InterruptedException {

		int total = elements("no_OfQuestions_present").size();
		if (totalnoOfQues - al.size() == total) {
			logMessage("Total number of Questions present before deleting: " + totalnoOfQues);
			Thread.sleep(7000);
			logMessage("Number of Questions to be deleted: " + al.size());
			logMessage("No of questions present after deleting : " + total);
			logMessage("Verified!!! ");
			return true;
		}
		return false;

	}

	public boolean verify_Questions_are_Displayed_onClicking_Apply() {
		if (elements("questions_onClicking_Apply").size() > 0) {
			logMessage("Questions are displayed! ");
			return true;
		}
		return false;
	}

	public boolean verify_Homework_on_Unassigned(String name) {
		click(element("homepage_tabs", "Unassigned"));
		if (element("verify_Name_onHomepage", name).isDisplayed()) {
			logMessage("Verified! " + name + " is added and is present in unassigned tab");
		}
		return false;
	}

	public boolean verify_NoOfQues_on_FinalQuestionPaper() {

		if (elements("questions_on_Preview").size() == totalnoOfQues) {
			logMessage(totalnoOfQues + " : No of Ques added");
			logMessage(elements("questions_on_Preview").size() + " : Num of Ques on Preview");
			return true;
		}
		return false;
	}

	public boolean select_Value_From_Dropdown_AddNewQues(String fieldName, String value) {
		click(element("dropdowns_ImportFQB", fieldName));
		click(element("dropdown_SelectValue", value));
		logMessage("Selected " + fieldName + " value as " + value);
		return true;
	}
}