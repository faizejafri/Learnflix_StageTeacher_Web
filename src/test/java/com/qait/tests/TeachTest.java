package com.qait.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class TeachTest extends TestSessionInitiator {

	@Test(priority = 1)
	public void verify_user_is_able_to_login() {
		loginAction.launchApplicationUrl();
		loginAction.ClickSignIn_UsingSchoolId();
		loginAction.enterValidCredentials();
		loginAction.clickOnContine();
		Assert.assertTrue(loginAction.verifyHomepage());

	}

	@Test(priority = 2)
	public void verify_teach_tab_is_displayed() {
		Assert.assertTrue(Teach.Teach_Tab_is_Displayed());
	}

	@Test(priority = 3)
	public void verify_user_is_able_click_on_Teach_tab() {
		Assert.assertTrue(Teach.click_on_Teach());
	}

	@Test(priority = 4)
	public void Verify_user_navigates_to_Teach_page_on_clicking_on_Teach_tab() {

		Assert.assertTrue(Teach.user_navigates_to_Teach_page());
	}

	@Test(priority = 5)
	public void Verify_Class_and_subject_is_displayed() {
		Assert.assertTrue(Teach.Class_and_Subject_are_displayed());
	}

	@Test(priority = 6)
	public void verify_user_is_able_to_select_the_subject() {
		Assert.assertTrue(Teach.click_on_subject());
	}

	@Test(priority = 7)
	public void Verify_Chapters_are_displayed_when_user_clicks_on_Subject()

	{
		Assert.assertTrue(Teach.user_navigates_to_chapters_page());

	}

	@Test(priority = 8)
	public void Verify_user_is_able_to_view_the_chapters_detail() {
		Assert.assertTrue(Teach.click_on_arrow());
	}

	@Test(priority = 9)
	public void Verify_Filter_Options_are_displayed() {
		Assert.assertTrue(Teach.filter_options_are_present());
	}

	@Test(priority = 10)
	public void Verify_Recommended_ebooks_are_displayed() {
		Assert.assertTrue(Teach.ebooks_are_present());
	}

	@Test(priority = 11)
	public void Verify_Core_and_Library_are_displayed() {
		Assert.assertTrue(Teach.core_and_library_should_be_present());
	}

	@Test(priority = 12)
	public void Verify_user_is_able_to_view_the_library() {
		Assert.assertTrue(Teach.click_on_library());
	}

	@Test(priority = 13)
	public void Verify_following_elements_are_displayed_in_the_library() {
		Assert.assertTrue(Teach.Elements_displayed_in_library());
	}

	@Test(priority = 14)
	public void Verify_Analytics_Button_is_present_on_the_top_right_corner() {
		Assert.assertTrue(Teach.analytics_button_should_be_present());
	}

	@Test(priority = 15)
	public void Verify_concepts_questions_and_videos_are_displayed_below_the_chapter_name() {
		Assert.assertTrue(Teach.concept_questions_and_videos_should_be_displayed());
	}

	@Test(priority = 16)
	public void Verify_user_navigates_to_particular_concept_upon_clicking() {
		Assert.assertTrue(Teach.user_navigates_to_particular_concept_upon_clicking());
	}

	@Test(priority = 17)
	public void Verify_concept_details_are_displayed() {
		Assert.assertTrue(Teach.filter_options_in_concept());
	}

	@Test(priority = 18)
	public void verify_user_navigates_to_subconcepts_video() {

		String res = Teach.user_navigates_to_subconcepts_video();

		Assert.assertEquals(res, "Learnflix Teacher");

	}

	@Test(priority = 19)
	public void verify_user_is_able_to_play_the_video() {
		Assert.assertTrue(Teach.click_on_play_button());
	}

	@Test(priority = 20)
	public void verify_user_is_able_to_switch_to_full_screen() {
		Assert.assertTrue(Teach.switch_to_full_screen());
	}

	@Test(priority = 21)
	public void verify_user_is_able_to_exit_full_screen() {

		Assert.assertTrue(Teach.exit_full_screen());
	}

	@Test(priority = 22)
	public void verify_user_is_able_to_click_on_pause_button() {
		Assert.assertTrue(Teach.click_on_pause_button());
	}

	@Test(priority = 23)
	public void verify_user_is_able_to_rewind_the_video() {
		Assert.assertTrue(Teach.click_on_rewind());
	}

	@Test(priority = 24)
	public void verify_user_is_able_to_forward_the_video() {
		Assert.assertTrue(Teach.click_on_forward());
	}

	@Test(priority = 25)
	public void verify_next_button_is_displayed() {
		Assert.assertTrue(Teach.next_button_is_displayed());
	}

	@Test(priority = 26)
	public void verify_user_navigates_to_Tryout_page_on_clicking_Next() {

		String res = Teach.click_on_next();

		Assert.assertEquals(res, "Learnflix Teacher");

	}

	@Test(priority = 27)
	public void verify_user_is_able_to_view_the_Questions() {
		Assert.assertTrue(Teach.Question_is_displayed());
	}

	@Test(priority = 28)
	public void verify_Submit_button_is_disabled() {
		Assert.assertTrue(Teach.Submit_button_should_be_disabled());
	}

	@Test(priority = 29)
	public void verify_Submit_button_is_enabled() {
		Assert.assertTrue(Teach.submit_button_should_be_enabled_on_selecting_any_option());
	}

	@Test(priority = 30)
	public void verify_explanation_gets_displayed_on_clicking_submit_button() {
		Assert.assertTrue(Teach.explanation_gets_displayed_on_clicking_submit_button());
	}

	@Test(priority = 31)
	public void verify_next_question_gets_displayed_on_clicking_next_button() {
		Assert.assertTrue(Teach.user_navigates_to_next_question_on_clicking_Next_button());
	}

	@Test(priority = 32)
	public void verify_user_navigates_to_concept_page_on_clicking_done() {
		Teach.submit_button_should_be_enabled_on_selecting_any_option();
		Teach.explanation_gets_displayed_on_clicking_submit_button();

		Assert.assertTrue(Teach.user_navigates_to_concept_page_on_clicking_done());
	}

	@Test(priority = 33)
	public void verify_user_is_able_to_revise_concept() {
		Assert.assertTrue(Teach.click_on_revise());
	}

	@Test(priority = 34)
	public void Verify_user_navigates_to_Concept_page_on_clicking_on_BackIcon() {

		String res = Teach.click_on_back_icon();

		Assert.assertEquals(res, "Learnflix Teacher");
	}

	@Test(priority = 35)
	public void verify_user_is_able_to_view_concept_practice_page() {
		Assert.assertTrue(Teach.click_on_objective_practice());
	}

	@Test(priority = 36)
	public void verify_user_is_able_to_view_question_type_Chapter_name_total_number_of_questions_and_start_button() {
		Assert.assertTrue(Teach.following_elements_should_be_displayed());
	}

	@Test(priority = 37)
	public void verify_user_is_able_to_view_question_on_clicking_start_button() {
		Assert.assertTrue(Teach.questions_should_be_displayed_on_clicking_start_button());
	}

	@Test(priority = 38)
	public void submit_button_should_be_enabled_only_after_selecting_an_option() {
		Teach.Submit_button_should_be_disabled();
		Assert.assertTrue(Teach.submit_button_should_be_enabled_on_selecting_any_option());
	}

	@Test(priority = 39)
	public void verify_message_displayed_on_clicking_back_icon() {
		Assert.assertTrue(Teach.message_displayed_on_clicking_back_icon());
	}

	@Test(priority = 40)
	public void verify_two_options_gets_displayed_on_clicking_back() {
		Assert.assertTrue(Teach.two_options_gets_displayed_on_clicking_back());
	}
	/*
	 * @Test(priority=41) public void
	 * verify_user_navigates_to_same_question_on_clicking_Continue() {
	 * Assert.assertTrue(Teach.user_navigates_to_same_question_on_clicking_Continue(
	 * )); }
	 */

	@Test(priority = 41)
	public void verify_user_naviagtes_to_concept_page_on_clicking_Exit() {
		Assert.assertTrue(Teach.user_navigates_to_concept_page_on_clicking_Exit());
	}

	@Test(priority = 42)
	public void verify_user_navigates_to_Analytics_page_by_clicking_on_Analytics_button() {
		Assert.assertTrue(Teach.user_navigates_to_Analytics_page_by_clicking_on_Analytics_button());
	}

	@Test(priority = 43)
	public void verify_user_is_able_to_view_chapter_analytics() {
		Assert.assertTrue(Teach.view_chapter_analytics());
	}

	@Test(priority = 44)
	public void verify_user_is_able_to_view_concepts_covered() {
		Assert.assertTrue(Teach.concepts_covered_is_present());
	}

	@Test(priority = 45)
	public void verify_user_is_able_to_view_chapter_tests() {
		Assert.assertTrue(Teach.chapter_tests_completed_is_present());
	}

	@Test(priority = 46)
	public void verify_user_is_able_to_view_concepts_analytics() {
		Assert.assertTrue(Teach.concept_analytics_is_present());
	}

	@Test(priority = 47)
	public void verify_user_is_able_to_Watch_video() {
		Assert.assertTrue(Teach.Watch_video_button_is_present());
	}

	@Test(priority = 48)
	public void verify_clicking_on_watch_video_navigates_to_concept_page() {
		Assert.assertTrue(Teach.clicking_on_watch_video_navigates_to_concept_page());
	}
}
/*
 * @Test(priority=39) public void
 * verify_user_navigates_to_analytics_page_on_clicking_analyticsbtn() {
 * 
 * Assert.assertTrue(Teach.analytics_button_should_be_present()); } }
 */
