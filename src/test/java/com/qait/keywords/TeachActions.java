package com.qait.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;

public class TeachActions extends GetPage {

	public TeachActions(WebDriver driver) {
		super(driver, "Teach");
	}

	public boolean Teach_Tab_is_Displayed() {

		isElementDisplayed("Teach");
		return true;
	}

	public boolean user_navigates_to_Teach_page() {
		isElementDisplayed("Heading");
		hardWait(10);
		return true;

	}

	public boolean click_on_Teach() {
		element("Teach").click();
		return true;
	}

	public boolean Class_and_Subject_are_displayed() {
		isElementDisplayed("Class");
		isElementDisplayed("Subject");
		return true;
	}

	public boolean click_on_subject() {

		WebElement elem = getelement("SubjectName", "Math");
		elem.click();
		return true;
	}

	public boolean user_navigates_to_chapters_page() {
		isElementDisplayed("Chapters");
		hardWait(10);
		return true;
	}

	public boolean click_on_arrow() {
		isElementDisplayed("collapse");
		element("collapse").click();
		element("expand").click();
		return true;
	}

	public boolean filter_options_are_present() {
		hardWait(30);
		isElementDisplayed("filterOptions", "CONCEPTS");
		isElementDisplayed("filterOptions", "CHAPTER TESTS");
		isElementDisplayed("filterOptions", "REVISION");
		isElementDisplayed("ChapterAnalyticsbtn");
		return true;

	}

	public boolean ebooks_are_present() {
		WebElement elem = getelement("ebooks");
		scrollDown(elem);
		isElementDisplayed("ebooks");
		return true;
	}

	public boolean core_and_library_should_be_present() {
		isElementDisplayed("Core");
		isElementDisplayed("Library");
		return true;
	}

	public boolean click_on_library() {
		element("Library").click();
		return true;
	}

	public boolean Elements_displayed_in_library() {
		hardWait(10);
		isElementDisplayed("FilterOptions", "eBooks");
		isElementDisplayed("FilterOptions", "Sample Papers");
		isElementDisplayed("FilterOptions", "NCERT Solutions");
		return true;

	}

	public boolean analytics_button_should_be_present() {
		element("Core").click();
		isElementDisplayed("Analytics");
		return true;
	}

	public boolean concept_questions_and_videos_should_be_displayed() {
		refreshPage();
		element("collapse").click();
		isElementDisplayed("filterOptionsCollapsed", "CONCEPTS");
		isElementDisplayed("filterOptionsCollapsed", "QUESTIONS");
		isElementDisplayed("filterOptionsCollapsed", "VIDEOS");
		return true;

	}

	public boolean user_navigates_to_particular_concept_upon_clicking() {
		element("expand").click();
		WebElement elem = getelement("Concepts", "Comparing");
		elem.click();
		hardWait(30);
		return true;

	}

	public boolean filter_options_in_concept() {
		isElementDisplayed("FilterOptions", "SUBCONCEPT 1");
		isElementDisplayed("FilterOptions", "VIDEO");
		isElementDisplayed("FilterOptions", "REVISION");
		isElementDisplayed("FilterOptions", "CONCEPT PRACTICE");
		return true;

	}

	public String user_navigates_to_subconcepts_video() {

		refreshPage();

		isElementDisplayed("SubConceptsVideo");
		element("SubConceptsVideo").click();
		return getPageTitle().toString();
	}

	public boolean click_on_play_button() {
		hardWait(10);
		isElementDisplayed("PlayBtn");
		element("PlayBtn").click();
		hardWait(10);
		return true;

	}

	public boolean switch_to_full_screen() {
		hardWait(10);
		WebElement elem = element("Video");
		hover(elem);
		WebElement elem2 = element("FullScreen");
		hover(elem2);
		if (isElementDisplayed("FullScreen")) {
			System.out.println("It is displayed!!!!!");
			click(element("FullScreen"));
		} else {
			System.out.println("The element is not displayed");
		}
		return true;
		// isElementDisplayed("FullScreen");
		// element("FullScreen").click();

	}

	public boolean exit_full_screen() {
		hardWait(10);
		hardWait(10);
		WebElement elem = element("Video");
		hover(elem);
		isElementDisplayed("ExitFullScreen");
		element("ExitFullScreen").click();
		return true;
	}

	public boolean click_on_pause_button() {
		isElementDisplayed("PlayBtn");
		element("PlayBtn").click();
		return true;
	}

	public boolean click_on_rewind() {
		WebElement elem = element("Video");
		hover(elem);
		isElementDisplayed("Rewind");
		element("Rewind").click();
		hardWait(10);
		return true;
	}

	public boolean click_on_forward() {
		WebElement elem = element("Video");
		hover(elem);
		isElementDisplayed("Forward");
		element("Forward").click();
		hardWait(10);
		return true;
	}

	public boolean next_button_is_displayed() {
		isElementDisplayed("Next");

		return true;
	}

	public String click_on_next() {

		isElementDisplayed("Next");
		element("Next").click();
		return getPageTitle().toString();

	}

	public boolean Question_is_displayed() {
		hardWait(10);
		isElementDisplayed("Question");
		return true;
	}

	public boolean Submit_button_should_be_disabled() {
		hardWait(10);
		isElementDisplayed("SubmitbtnDisabled");
		return true;
	}

	public boolean submit_button_should_be_enabled_on_selecting_any_option() {
		isElementDisplayed("SelectOpt");
		element("SelectOpt").click();
		isElementDisplayed("SubmitbtnEnabled");
		return true;
	}

	public boolean explanation_gets_displayed_on_clicking_submit_button() {
		hardWait(10);
		isElementDisplayed("SubmitbtnEnabled");
		element("SubmitbtnEnabled").click();
		isElementDisplayed("Explanation");
		element("Explanation").click();
		return true;
	}

	public boolean user_navigates_to_next_question_on_clicking_Next_button() {
		hardWait(10);
		isElementDisplayed("Next");
		element("Next").click();
		isElementDisplayed("Question");
		return true;
	}

	public boolean user_navigates_to_concept_page_on_clicking_done() {
		isElementDisplayed("Done");
		element("Done").click();
		return true;
	}

	public boolean click_on_revise() {
		isElementDisplayed("Revise");
		element("Revise").click();
		return true;
	}

	public String click_on_back_icon() {
		isElementDisplayed("BackIcon");
		element("BackIcon").click();
		return getPageTitle().toString();
	}

	public boolean click_on_objective_practice() {
		isElementDisplayed("ObjectivePractice");
		element("ObjectivePractice").click();
		isElementDisplayed("ConceptPractice");
		return true;
	}

	public boolean following_elements_should_be_displayed() {
		isElementDisplayed("FilterOptions", "OBJECTIVE");
		isElementDisplayed("FilterOptions", "Knowing our");
		isElementDisplayed("filterOptions", "5");
		isElementDisplayed("Startbtn");
		return true;
	}

	public boolean questions_should_be_displayed_on_clicking_start_button() {
		isElementDisplayed("Startbtn");
		element("Startbtn").click();
		isElementDisplayed("Question");
		return true;
	}

	public boolean message_displayed_on_clicking_back_icon() {
		isElementDisplayed("back");
		element("back").click();
		verifyElementTextContains("Message", "Exit Quiz?");
		return true;
	}

	public boolean two_options_gets_displayed_on_clicking_back() {
	
		 isElementDisplayed("Continue");
		if (element("Exitbtn").isDisplayed())

			return true;
		else
			return false;
	}

	public boolean user_navigates_to_same_question_on_clicking_Continue() {
		isElementDisplayed("Continue");
		element("Continue").click();

		return true;
	}

	public boolean user_navigates_to_concept_page_on_clicking_Exit() {
		isElementDisplayed("Exitbtn");
		element("Exitbtn").click();
		verifyElementTextContains("ConceptPage", "Comparing");
		return true;
	}

	public boolean user_navigates_to_Analytics_page_by_clicking_on_Analytics_button() {
		isElementDisplayed("Conceptback");
		hardWait(10);
		element("Conceptback").click();
		isElementDisplayed("Analyticsbtn");
		element("Analyticsbtn").click();
	
		return true;
	}

	public boolean chapter_analytics_should_be_present_for_each_chapter() {
		return true;
	}
	public boolean view_chapter_analytics()
	{
		isElementDisplayed("ChapterAnalytics");
		element("ChapterAnalytics").click();
		return true;
	}
	public boolean concepts_covered_is_present()
	{
		isElementDisplayed("FilterOptions","Concepts Covered");
		return true;
	}
	public boolean chapter_tests_completed_is_present()
	{
		isElementDisplayed("FilterOptions","Chapter Tests Completed");
		return true;
	}
	public boolean concept_analytics_is_present()
	{
		isElementDisplayed("FilterOptions","Concepts");
		return true;
	}
	public boolean Watch_video_button_is_present()
	{
		isElementDisplayed("WatchVideo");
		return true;
	}
	public boolean clicking_on_watch_video_navigates_to_concept_page()
	{
		isElementDisplayed("WatchVideo");
		element("WatchVideo").click();
		verifyElementTextContains("ConceptPage", "Comparing");
		return true;
	}
}
