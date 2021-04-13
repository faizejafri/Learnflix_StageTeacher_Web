package com.qait.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class AssignHomeworkActions extends GetPage {

	public AssignHomeworkActions(WebDriver driver) {
		super(driver, "AssignHomework");
	} 
	public boolean click_on_homework_tab()
	{
		hardWait(10);
		isElementDisplayed("Homework");
		element("Homework").click();
		return true;
	}
	public boolean elements_on_assign_homework_tab()
	{
		
		isElementDisplayed("Headings","Due");
		isElementDisplayed("Headings","Ongoing");
		isElementDisplayed("Headings","Unassigned");
		isElementDisplayed("Headings","Upcoming");
		isElementDisplayed("Headings","Completed");
		isElementDisplayed("Headings","Cancelled");
		return true;
		
	}
	public boolean created_homework_should_get_displayed()
	{
		hardWait(10);
		isElementDisplayed("Unassigned");
		element("Unassigned").click();
		return true;
	}
	public boolean publish_test()
	{
		isElementDisplayed("Publish");
		element("Publish").click();
		return true;
	}
	public boolean click_on_three_dots()
	{
		hardWait(10);
		isElementDisplayed("threedots");
		element("threedots").click();
		isElementDisplayed("Options","Question Paper");
		isElementDisplayed("Options","Answer Key");
		isElementDisplayed("Options","Duplicate Test");
		
		
		return true;
	}
	public boolean click_on_Question_paper()
	{
		hardWait(10);
		isElementDisplayed("QuestionPaper");
		element("QuestionPaper").click();
		
		return true;
	
	}
	public boolean click_on_download_assessment()
	{
		isElementDisplayed("Download");
		element("Download").click();
		refreshPage();
		return true;
	}
	public boolean click_on_close()
	{
		isElementDisplayed("Close");
		element("Close").click();
		isElementDisplayed("Homework");
		return true;
	}

}
