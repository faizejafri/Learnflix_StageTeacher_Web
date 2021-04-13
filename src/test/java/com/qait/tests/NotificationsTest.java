package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class NotificationsTest extends TestSessionInitiator {

	@Test(priority = 0)
	public void Login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	@Test(priority = 1)
	public void Verify_Notifications_page() {
		notificationAction.click_Notifications_tab();
		Assert.assertTrue(notificationAction.verify_Notifications_page());
	}

	@Test(priority = 2)
	public void Verify_OlderTab() {
		Assert.assertTrue(notificationAction.verify_OlderTab());
	}

	@Test(priority = 3)
	public void verify_SearchIcon() {
		Assert.assertTrue(notificationAction.verify_SearchIcon_isDisplayed());
	}

	@Test(priority = 4)
	public void verify_SearchIcon_redirects_Correctly() {
		notificationAction.click_SearchIcon();
		Assert.assertTrue(notificationAction.verify_SearchNotifications_page());

	}

	@Test(priority = 5)
	public void Verify_all_the_Subjects_are_present_and_clickable() {
		notificationAction.click_onBackButton();
		notificationAction.click_CreateNewNotification();
		Assert.assertTrue(notificationAction.click_onAnySubject("Mathematics"));
		Assert.assertTrue(notificationAction.click_onAnySubject("Science"));
		Assert.assertTrue(notificationAction.click_onOtherSubject("Other"));
	}

	@Test(priority = 6)
	public void Verify_all_the_TargetAudience_are_present_and_clickable() {
		Assert.assertTrue(notificationAction.click_onAnyTargetAudience("Individual Student"));
		Assert.assertTrue(notificationAction.click_onAnyTargetAudience("Entire Section"));
	}

	@Test(priority = 7)
	public void verify_ContinueButton() {
		Assert.assertTrue(notificationAction.verify_ContinueBtn());
	}

	@Test(priority = 8)
	public void verify_SelectingOnly_Subject_gives_Error() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onContinueButton();
		Assert.assertEquals(notificationAction.verify_ErrorMessage(), "Please Select Target Audience Type");
	}

	@Test(priority = 9)
	public void verify_Selecting_IndividualStudent_redirects_toTheCorrectPage() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Individual Student");
		notificationAction.click_onContinueButton();
		Assert.assertTrue(notificationAction.verify_IndividualStudentSelection_Page("INDIVIDUAL STUDENT SELECTION"));
	}

	@Test(priority = 10)
	public void verify_Selecting_EntireSection_redirects_toTheCorrectPage() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Entire Section");
		notificationAction.click_onContinueButton();
		Assert.assertTrue(notificationAction.verify_IndividualStudentSelection_Page("SECTION SELECTION"));
	}

	@Test(priority = 11)
	public void verify_Classes_are_functional_under_IndividualStudentSelection() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Individual Student");
		notificationAction.click_onContinueButton();
		Assert.assertTrue(notificationAction.verify_Class("Class 6_A"));
		Assert.assertTrue(notificationAction.verify_Class("Class 6_B"));
		Assert.assertTrue(notificationAction.verify_Class("Class 6_C"));
	}

	@Test(priority = 12)
	public void verify_User_is_able_to_Select_AtleastOne_Student_from_IndividualStudentSelection_Class6A() {
		notificationAction.click_onClass("Class 6_A");
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_A_student_1"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_A_student_10"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_A_student_50"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_A_student_100"));
	}

	@Test(priority = 13)
	public void verify_User_is_able_to_Select_AtleastOne_Student_from_IndividualStudentSelection_Class6B() {
		notificationAction.click_onClass("Class 6_B");
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_B_student_20"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_B_student_30"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_B_student_80"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_B_student_85"));
	}

	@Test(priority = 14)
	public void verify_User_is_able_to_Select_AtleastOne_Student_from_IndividualStudentSelection_Class6C() {
		notificationAction.click_onClass("Class 6_C");
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_C_student_15"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_C_student_25"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_C_student_70"));
		Assert.assertTrue(notificationAction.verifyStudent("Class 6_C_student_95"));
	}

	@Test(priority = 15)
	public void verify_Error_isDisplayed_Before_Selecting_AtleastOneStudent_from_IndividualStudentSelection() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Individual Student");
		notificationAction.click_onContinueButton();
		notificationAction.click_onClass("Class 6_A");
		notificationAction.click_onAddButton();
		Assert.assertEquals(notificationAction.verify_StudentError(), "Please select atleast one student");
	}

	@Test(priority = 16)
	public void verify_selected_Students_in_ConfirmPopup_using_IndividualStudent_as_TargetAudience() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Individual Student");
		notificationAction.click_onContinueButton();

		notificationAction.select_Students_toBe_Marked("Class 6_A", "Class 6_A_student_50");
		notificationAction.select_Students_toBe_Marked("Class 6_B", "Class 6_B_student_50");
		notificationAction.select_Students_toBe_Marked("Class 6_C", "Class 6_C_student_50");
		notificationAction.click_onAddButton();

		Assert.assertTrue(notificationAction.verify_Confirm_Students_List_under_IndividualStudent());
	}

	@Test(priority = 17)
	public void verify_selected_Students_in_ConfirmPopup_using_EntireSection_as_TargetAudience() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Entire Section");
		notificationAction.click_onContinueButton();

		notificationAction.select_Sections_toBe_Marked("Class 6_B");
		notificationAction.select_Sections_toBe_Marked("Class 6_C");
		notificationAction.click_onAddButton();

		Assert.assertTrue(notificationAction.verify_Confirm_Students_List_under_EntireSection());
	}

	@Test(priority = 18)
	public void verify_User_is_able_toSelect_atleastOne_Section_under_EntireSection() {
		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Entire Section");
		notificationAction.click_onContinueButton();

		Assert.assertTrue(notificationAction.verify_selecting_section("Class 6_A"));
		Assert.assertTrue(notificationAction.verify_selecting_section("Class 6_B"));
		Assert.assertTrue(notificationAction.verify_selecting_section("Class 6_C"));
	}

	@Test(priority = 19)
	public void verify_Send_Button_is_working() {
		notificationAction.click_onAddButton();
		Assert.assertTrue(notificationAction.verify_SendButton());
	}

	@Test(priority = 20)
	public void verify_Heading_Field() {
		Assert.assertTrue(notificationAction.verify_Notification_field("heading"));
	}

	@Test(priority = 21)
	public void verify_Message_Field() {
		Assert.assertTrue(notificationAction.verify_Notification_field("message"));
	}

	@Test(priority = 22)
	public void verify_Newly_Notification_Sent_isDisplayed_on_Homepage_and_at_StudentEnd() {

		notificationAction.click_Notifications_tab();
		notificationAction.click_CreateNewNotification();
		notificationAction.click_onAnySubject("Mathematics");
		notificationAction.click_onAnyTargetAudience("Entire Section");
		notificationAction.click_onContinueButton();
		notificationAction.select_Sections_toBe_Marked("Class 6_A");
		notificationAction.select_Sections_toBe_Marked("Class 6_C");
		notificationAction.click_onAddButton();
		notificationAction.click_onSendButton();
		notificationAction.Enter_Details_inInputField("heading", "NEW_____Heading_For_Test");
		notificationAction.Enter_Details_inInputField("message", "NEW______Message_For_Test");
		notificationAction.click_onSendButton();

		Assert.assertTrue(notificationAction.verify_notification_on_homepage()); // verifying at Teacher end.

		notificationAction.perform_Logout();
		notificationAction.Login_Using_Student_Credentials(); // login using Stundent credentials
		notificationAction.click_Notifications_tab();

		Assert.assertTrue(notificationAction.verify_notification_on_homepage()); // verifying at Student end.

	}

}