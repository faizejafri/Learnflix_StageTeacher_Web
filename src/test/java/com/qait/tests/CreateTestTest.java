package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class CreateTestTest  extends TestSessionInitiator {

	@Test(priority = 1)
	public void verify_user_is_able_to_login() {
		LoginPage.launchApplicationUrl();
		LoginPage.navigateToSignInWithSchoolId();
		LoginPage.UserIsAbleToLoginWithValidCrendentials();

	} 
	@Test(priority=2)
	public void verify_create_test_tab_is_displayed_and_clickable()
	{
		Assert.assertTrue(CreateTest.create_test_tab_is_displayed());
	}
	@Test(priority=3)
	public void verify_user_naviagtes_to_assessment_creation_page()
	{
		Assert.assertTrue(CreateTest.navigate_to_assessment_creation_page());
	}
	/*@Test(priority=4)
 public void verify_class_is_displayed_and_is_clickable()
 {
		Assert.assertTrue(CreateTest.click_on_class());
 }
	
	@Test(priority=5)
	public void verify_class_options()
	{
		
		CreateTest.verify_class_options_in_dropdown();
		
	}
	/*@Test(priority=6)
	public void verify_user_is_able_to_click_on_subject()
	{
		Assert.assertTrue(CreateTest.click_on_subject());
	}
	/*@Test(priority=7)
	public void verify_subject_options()
	{
		CreateTest.verify_subject_options();
	}*/
	
	@Test(priority=8)
	public void verify_user_is_able_to_select_assessment_type()
	{
		Assert.assertTrue(CreateTest.Select_Assessment_type());
	}
	@Test(priority=9)
	public void verify_user_is_able_to_select_subject()
	{
		Assert.assertTrue(CreateTest.selectField("Class", "8"));
		
		Assert.assertTrue(CreateTest.selectField("Subject", "Science"));
	}
	
	
	@Test(priority=10)
	public void verify_next_button_is_enabled_and_clickable()
	{
		Assert.assertTrue(CreateTest.Next_button());
	}
	@Test(priority=11)
	public void verify_parameters_are_displayed()
	{
		Assert.assertTrue(CreateTest.parameters());
	}
	@Test(priority=12)
	public void verify_user_is_able_to_select_parameter()
	{
		Assert.assertTrue(CreateTest.select_parameter());
	}
	@Test(priority=13)
	public void verify_Subjective_page_is_displayed()
	{
		Assert.assertTrue(CreateTest.subjective_test_page());
	}
	@Test(priority=14)
	public void verify_textfields_are_displayed()
	{
		Assert.assertTrue(CreateTest.textfields_should_display());
	}
	@Test(priority=15)
	public void verify_next_button_is_disabled()
	{
		Assert.assertTrue(CreateTest.next_button());
	}
	/*@Test(priority=16)
	public void verify_user_gets_landed_on_homepage_on_clicking_cancel_button()
	{
		Assert.assertTrue(CreateTest.cancel_button());
	}*/
	@Test(priority=17)
	public void verify_user_is_able_to_create_test()
	{
		Assert.assertTrue(CreateTest.create_test());
	}
	@Test(priority=18)
	public void verify_import_from_question_bank_and_add_new_questions_are_displayed()
	{
		Assert.assertTrue(CreateTest.verify_options());
	}
	@Test(priority=19)
	public void verify_three_buttons_are_displayed()
	{
		Assert.assertTrue(CreateTest.buttons());
	}
	@Test(priority=20)
	public void verify_next_button_disabled()
	{
		Assert.assertTrue(CreateTest.next_button_is_disabled());
	}
	@Test(priority=21)
	public void verify_user_is_able_to_click_on_add_new_questions()
	{
		Assert.assertTrue(CreateTest.add_new_questions());
	}
	@Test(priority=22)
	public void verify_textfields_on_clicking_on_add_new_questions()
	{
		Assert.assertTrue(CreateTest.verify_textfields_on_clicking_add_new_questions());
	}
	@Test(priority=23)
	public void verify_user_is_able_to_add_new_question()
	{
		Assert.assertTrue(CreateTest.add_new_question("Chapter", "Cell - Structure and Function"));
		Assert.assertTrue(CreateTest.add_new_question("Concept", "Cell - Building Block of Life"));
		Assert.assertTrue(CreateTest.select_difficulty_level());
		
	}
	@Test(priority=24)
	public void verify_user_is_able_to_add_question_and_answer()
	{
		Assert.assertTrue(CreateTest.add_question_and_answer());
	}
	@Test(priority=25)
	public void verify_user_is_able_to_save_test()
	{
		Assert.assertTrue(CreateTest.click_on_Save_button());
	}
}
