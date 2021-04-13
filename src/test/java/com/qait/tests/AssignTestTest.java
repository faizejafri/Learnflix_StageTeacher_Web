package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class AssignTestTest extends TestSessionInitiator {

	@Test(priority = 1)
	public void verify_user_is_able_to_login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());
	}

	@Test(priority = 2)
	public void verify_following_elements_on_assign__tab() {
		AssignTest.click_on_assign_test_tab();
		Assert.assertTrue(AssignTest.elements_on_assign_test_tab());
	}

	@Test(priority = 3)
	public void verify_created_tests_gets_displayed() {
		Assert.assertTrue(AssignTest.created_tests_should_get_displayed());
	}

	@Test(priority = 4)
	public void verify_three_options_are_available_on_clicking_on_three_dots() {
		Assert.assertTrue(AssignTest.click_on_three_dots());
	}

	@Test(priority = 5)
	public void verify_user_is_able_to_click_on_question_paper() {
		Assert.assertTrue(AssignTest.click_on_Question_paper());
	}

	// @Test(priority=6)
	public void verify_user_is_able_to_download_assessment() {
		Assert.assertTrue(AssignTest.click_on_download_assessment());
	}

	@Test(priority = 7)
	public void verify_user_navigates_to_homework_page_on_clicking_close_button() {
		// AssignTest.click_on_three_dots();
		// AssignTest.click_on_Question_paper();
		Assert.assertTrue(AssignTest.click_on_close());
	}

	@Test(priority = 8)
	public void verify_user_navigates_to_submissions_page_on_clicking_on_submissions() {
		Assert.assertTrue(AssignTest.click_on_completed_tab());
	}

	@Test(priority = 9)
	public void verify_user_is_able_to_share_solutions() {
		Assert.assertTrue(AssignTest.share_solutions());
	}

	@Test(priority = 10)
	public void verify_user_is_able_to_share_scores() {
		Assert.assertTrue(AssignTest.share_scores());
	}

	@Test(priority = 11)
	public void verify_user_navigates_to_assessments_page_on_clicking_back_arrow() {
		Assert.assertTrue(AssignTest.click_on_back_arrow());
	}

	@Test(priority = 12)
	public void verify_options_on_clicking_on_three_dots_in_completed_tab() {
		Assert.assertTrue(AssignTest.click_on_dots());
	}

	@Test(priority = 13)
	public void verify_user_is_able_to_click_on_Answer_key() {
		Assert.assertTrue(AssignTest.click_on_Answer_key());
	}

	@Test(priority = 14)
	public void verify_message_gets_displayed_when_no_password_is_set() {

		Assert.assertTrue(AssignTest.click_on_password());
	}

	@Test(priority = 15)
	public void verify_user_is_able_to_duplicate_test() {
		AssignTest.click_on_dots();
		Assert.assertTrue(AssignTest.navigate_to_duplicate_test());
	}

	@Test(priority = 16)
	public void verify_user_is_able_to_generate_test() {
		Assert.assertTrue(AssignTest.generate_test());
	}

	@Test(priority = 17)
	public void verify_user_is_able_to_monitor_test() {

		Assert.assertTrue(AssignTest.monitor_test());
	}

	@Test(priority = 18)
	public void verify_user_navigates_to_assessments_page_on_clicking_cross_icon() {
		Assert.assertTrue(AssignTest.click_on_cross_icon());
	}

	@Test(priority = 19)
	public void verify_search_textfield_is_getting_displayed() {
		Assert.assertTrue(AssignTest.textfield());
	}

}
