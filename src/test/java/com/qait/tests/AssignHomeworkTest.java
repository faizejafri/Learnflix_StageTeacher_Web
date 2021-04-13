package com.qait.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class AssignHomeworkTest extends TestSessionInitiator {

	@Test(priority = 1)
	public void verify_user_is_able_to_login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	@Test(priority = 2)
	public void verify_following_elements_on_assign_homework_tab() {
		AssignHomework.click_on_homework_tab();
		Assert.assertTrue(AssignHomework.elements_on_assign_homework_tab());
	}

	@Test(priority = 3)
	public void verify_created_homework_gets_displayed() {
		Assert.assertTrue(AssignHomework.created_homework_should_get_displayed());
	}

	@Test(priority = 4)
	public void verify_three_options_are_available_on_clicking_on_three_dots() {
		Assert.assertTrue(AssignHomework.click_on_three_dots());
	}

	@Test(priority = 5)
	public void verify_user_is_able_to_click_on_question_paper() {
		Assert.assertTrue(AssignHomework.click_on_Question_paper());
	}

	@Test(priority = 6)
	public void verify_user_is_able_to_download_assessment() {
		Assert.assertTrue(AssignHomework.click_on_download_assessment());
	}

	@Test(priority = 7)
	public void verify_user_navigates_to_homework_page_on_clicking_close_button() {
		AssignHomework.click_on_three_dots();
		AssignHomework.click_on_Question_paper();
		Assert.assertTrue(AssignHomework.click_on_close());
	}
}
