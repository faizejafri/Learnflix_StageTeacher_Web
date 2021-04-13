package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class HomeworkTest extends TestSessionInitiator {

	@Test(priority = 0)
	public void Login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	//
	@Test(priority = 1)
	public void verify_RightSide_tabs() {
		Assert.assertTrue(homeworkAction.verify_sideTabs("Due Today"));
		Assert.assertTrue(homeworkAction.verify_sideTabs("Ongoing"));
		Assert.assertTrue(homeworkAction.verify_sideTabs("Unassigned"));
		Assert.assertTrue(homeworkAction.verify_sideTabs("Upcoming"));
		Assert.assertTrue(homeworkAction.verify_sideTabs("Completed"));
		Assert.assertTrue(homeworkAction.verify_sideTabs("Cancelled"));
	}

	@Test(priority = 2)
	public void Verify_Homework_Page() {
		homeworkAction.click_Homework_tab();
		Assert.assertTrue(homeworkAction.verify_Homework_page());
	}

	@Test(priority = 3)
	public void verify_CreateHomework_Link_isDisplayed() {
		Assert.assertTrue(homeworkAction.verify_CreateHomework_Link_is_displayed());
	}

	@Test(priority = 4)
	public void verify_CreateHomework_link_redirects_Correctly() {
		homeworkAction.click_onCreateHomeworkLink();
		Assert.assertTrue(homeworkAction.verify_CreateHomework_page());
	}

	@Test(priority = 5)
	public void verify_Next_Button() {
		Assert.assertTrue(homeworkAction.verify_NextBtn_should_beDisabled_before_Selecting_allFields());
	}

	@Test(priority = 6)
	public void Verify_Fields_CreateHomework() {
		Assert.assertTrue(homeworkAction.verify_SelectionFields("Quiz"));
		Assert.assertTrue(homeworkAction.verify_SelectionFields("Assignment"));
		Assert.assertTrue(homeworkAction.verify_DropdownFields("Class"));
		Assert.assertTrue(homeworkAction.verify_DropdownFields("Subject"));
	}

	@Test(priority = 7)
	public void validate_Dropdowns_Fields() {
		Assert.assertTrue(homeworkAction.click_onDropdown_Field("Class", "6"));
		Assert.assertTrue(homeworkAction.click_onDropdown_Field("Subject", "Science"));
	}

	@Test(priority = 8)
	public void verify_Selecting_Quiz_as_HomeworkType_redirects_user_to_CorrectPage() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Mathematics");
		homeworkAction.click_OnNextButton();
		Assert.assertTrue(homeworkAction.verify__Page("Create Quiz"));
	}

	@Test(priority = 9)
	public void verify_Selecting_Assignment_as_HomeworkType_redirects_user_to_CorrectPage() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Assignment"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();
		Assert.assertTrue(homeworkAction.verify__Page("Upload Assignment"));
	}

	@Test(priority = 10)
	public void verify_CreateQuiz_fields() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		Assert.assertTrue(homeworkAction.verify_CreateQuiz_Fields("assesmentName"));
		Assert.assertTrue(homeworkAction.verify_CreateQuiz_Fields("assesmentDuration"));
		Assert.assertTrue(homeworkAction.verify_CreateQuiz_Fields("assesmentInst"));
	}

	@Test(priority = 11)
	public void verify_user_is_able_to_EnterData_in_CreateQuiz_Fields() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		Assert.assertTrue(homeworkAction.Enter_Details_inInputField("assesmentName", "SampleAssessmentName"));
		Assert.assertTrue(homeworkAction.Enter_Details_inInputField("assesmentDuration", "25"));
		Assert.assertTrue(homeworkAction.Enter_Details_inInputField("assesmentInst", "Sample Assesment Instructions"));

	}

	@Test(priority = 12)
	public void verify_there_are_two_options_available_to_add_Questions() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		Assert.assertTrue(homeworkAction.verify_ImportFromQuestionBank_Link());
		Assert.assertTrue(homeworkAction.verify_AddNewQuestions_Link());
	}

	@Test(priority = 13)
	public void verify_that_ImportFromQuestionBank_opens_aPopup_with_3_fields() {

		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();

		Assert.assertTrue(homeworkAction.verify_ImportFromQuestionBank_popup());
		Assert.assertTrue(homeworkAction.verify_Dropdown_Fields("Chapter"));
		Assert.assertTrue(homeworkAction.verify_Dropdown_Fields("Difficulty Level"));
		Assert.assertTrue(homeworkAction.verify_Dropdown_Fields("Question Type"));
	}

	@Test(priority = 14)
	public void verify_user_is_able_to_select_fromDropdown() {
		homeworkAction.click_onCrossButton();

		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();

		Assert.assertTrue(homeworkAction.select_From_Dropdown("Chapter", "Air Around Us")); /// KEEP ON CHANGING FROM
																							/// DEVELOPMENT SIDE
		Assert.assertTrue(homeworkAction.select_From_Dropdown("Concept", "Components of Air")); /// KEEP ON CHANGING
																								/// FROM DEVELOPMENT
																								/// SIDE
		Assert.assertTrue(homeworkAction.select_From_Dropdown("Difficulty Level", "Medium")); /// KEEP ON CHANGING FROM
																								/// DEVELOPMENT SIDE
		Assert.assertTrue(homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion")); // THIS OPTION
																											// IS NOT
																											// AVAILABLE
																											// NOW
	}

	@Test(priority = 15)
	public void verify_Questions_gets_displayed_onClicking_Apply() {
		homeworkAction.click_onCrossButton();

		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();
		homeworkAction.select_From_Dropdown("Chapter", "Air Around Us");
		homeworkAction.select_From_Dropdown("Concept", "Components of Air");
		homeworkAction.select_From_Dropdown("Difficulty Level", "Medium");
		homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion");
		homeworkAction.click_onApplyButton();
		Assert.assertTrue(homeworkAction.verify_Questions_are_Displayed_onClicking_Apply());
		homeworkAction.click_onCrossButton();

	}

	@Test(priority = 16)
	public void verify_that_user_is_able_to_PickQuestions() {

		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();
		homeworkAction.select_From_Dropdown("Chapter", "Air Around Us");
		homeworkAction.select_From_Dropdown("Concept", "Components of Air");
		homeworkAction.select_From_Dropdown("Difficulty Level", "Medium");
		homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion");
		homeworkAction.click_onApplyButton();

		Assert.assertTrue(homeworkAction.click_onPickButton()); // picking 1st, middle and last questions from all //
																// questions

		homeworkAction.click_onCrossButton();
	}

	@Test(priority = 17)
	public void verify_that_noOfQuestions_picked_are_added_inHomework() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();
		homeworkAction.select_From_Dropdown("Chapter", "Air Around Us");
		homeworkAction.select_From_Dropdown("Concept", "Components of Air");
		homeworkAction.select_From_Dropdown("Difficulty Level", "Medium");
		homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion");
		homeworkAction.click_onApplyButton();
		homeworkAction.click_onPickButton();

		homeworkAction.click_onSaveQuestions();
		Assert.assertTrue(homeworkAction.verify_noOfQuestions_added());

	}

	@Test(priority = 18)
	public void verify_that_user_isAble_delete_any_Question() throws InterruptedException {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();
		homeworkAction.select_From_Dropdown("Chapter", "Air Around Us");
		homeworkAction.select_From_Dropdown("Concept", "Components of Air");
		homeworkAction.select_From_Dropdown("Difficulty Level", "Medium");
		homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion");
		homeworkAction.click_onApplyButton();
		homeworkAction.click_onPickButton();

		homeworkAction.click_onSaveQuestions();

		homeworkAction.click_onDeleteButton();
		Assert.assertTrue(homeworkAction.verify_noOfQuestions_Deleted());

	}

	@Test(priority = 19)
	public void verify_that_Correct_Number_ofQuestions_are_displayed_in_PreviewSection() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();
		homeworkAction.select_From_Dropdown("Chapter", "Air Around Us");
		homeworkAction.select_From_Dropdown("Concept", "Components of Air");
		homeworkAction.select_From_Dropdown("Difficulty Level", "Medium");
		homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion");
		homeworkAction.click_onApplyButton();
		homeworkAction.click_onPickButton(); // select num of Questions to be added//

		homeworkAction.click_onSaveQuestions();
		homeworkAction.click_Next();

		Assert.assertTrue(homeworkAction.verify_NoOfQues_on_FinalQuestionPaper());
	}

	@Test(priority = 20)
	public void verify_user_asAble_to_addMCQ_under_AddNewQuestions() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onAddNewQuestions_Link();
	}

	@Test(priority = 21)
	public void verify_test_is_Created_Successfully() {
		homeworkAction.click_Homework_tab();
		homeworkAction.click_onCreateHomeworkLink();
		homeworkAction.click_On_HomeworkType("Quiz"); ////
		homeworkAction.click_onDropdown_Field("Class", "6");
		homeworkAction.click_onDropdown_Field("Subject", "Science");
		homeworkAction.click_OnNextButton();

		homeworkAction.Enter_Details_inInputField("assesmentName", "NewAssessmentName");
		homeworkAction.Enter_Details_inInputField("assesmentDuration", "30");
		homeworkAction.Enter_Details_inInputField("assesmentInst", "New Assesment Instructions");
		homeworkAction.click_OnNextButton();

		homeworkAction.click_onImportFromQuestionBank_Link();
		homeworkAction.select_From_Dropdown("Chapter", "Air Around Us"); /// KEEP ON CHANGING FROM DEVELOPMENT SIDE
		homeworkAction.select_From_Dropdown("Concept", "Components of Air");
		homeworkAction.select_From_Dropdown("Difficulty Level", "Medium");
		homeworkAction.select_QuestionType_Dropdown("Question Type", "SmcqQuestion");
		homeworkAction.click_onApplyButton();
		homeworkAction.click_onPickButton(); // select num of Questions to be added

		homeworkAction.click_onSaveQuestions();
		homeworkAction.click_Next();

//		homeworkAction.click_onSaveBtn();
//		homeworkAction.click_homeTab("Unassigned");
		Assert.assertTrue(homeworkAction.verify_Homework_on_Unassigned("NewAssessmentName"));

	}

}