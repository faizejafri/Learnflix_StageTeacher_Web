package com.qait.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class AssignTestActions  extends GetPage {

	public AssignTestActions(WebDriver driver) {
		super(driver, "AssignTest"); 
	}
	public boolean click_on_assign_test_tab()
	{
		hardWait(10);
		isElementDisplayed("Assigntst");
		element("Assigntst").click();
		return true;
	}
	public boolean elements_on_assign_test_tab()
	{
		
		isElementDisplayed("Headings","Due");
		isElementDisplayed("Headings","Ongoing");
		isElementDisplayed("Headings","Unassigned");
		isElementDisplayed("Headings","Upcoming");
		isElementDisplayed("Headings","Completed");
		isElementDisplayed("Headings","Cancelled");
		return true;
		
	}
	public boolean created_tests_should_get_displayed()
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
		hardWait(10);
		isElementDisplayed("Close");
		element("Close").click();
		isElementDisplayed("Assessments");
		return true;
	}
	public boolean click_on_completed_tab()
	{
		isElementDisplayed("Completed");
		element("Completed").click();
		isElementDisplayed("Submissions");
		element("Submissions").click();
		isElementDisplayed("SubmissionPage");
		return true;
	}
	public boolean share_solutions()
	{
		isElementDisplayed("share");
		element("share").click();
		verifyElementTextContains("Message", "Successfully solutions are shared");
		return true;
	}
	
	public boolean share_scores()
	{
		hardWait(30);
		isElementDisplayed("scores");
		element("scores").click();
		verifyElementTextContains("Message", "Successfully scores are shared");
		return true;
	}
	public boolean click_on_back_arrow()
	{
		isElementDisplayed("Back");
		element("Back").click();
		isElementDisplayed("Assessments");
		return true;
		}
	public boolean click_on_dots()
	{
		hardWait(10);
		isElementDisplayed("Completed");
		element("Completed").click();
		isElementDisplayed("dots");
		element("dots").click();
		isElementDisplayed("Options","Question Paper");
		isElementDisplayed("Options","Answer Key");
		isElementDisplayed("Options","Password");
		isElementDisplayed("Options","Duplicate Test");
		isElementDisplayed("Options","Monitor Test");
		return true;
	}
	public boolean click_on_Answer_key()
	{
		hardWait(10);
		isElementDisplayed("AnswerKey");
		element("AnswerKey").click();
		element("Close").click();
		
		return true;
	}
	public boolean click_on_password()
	{
		hardWait(20);
		isElementDisplayed("Completed");
		element("Completed").click();
		isElementDisplayed("dots");
		element("dots").click();
		isElementDisplayed("Password");
		element("Password").click();
		verifyElementTextContains("PasswordMsg", "No password set");
		isElementDisplayed("Close");
		element("Close").click();
		return true;
	}
	public boolean navigate_to_duplicate_test()
	{
		hardWait(10);
		isElementDisplayed("Duplicatetst");
		element("Duplicatetst").click();
		isElementDisplayed("heading");
		return true;
	}
	public boolean generate_test()
	{
		hardWait(10);
		isElementDisplayed("EnterTstName");
		element("EnterTstName").sendKeys("test1");
		isElementDisplayed("GenerateTst");
		element("GenerateTst").click();
		verifyElementTextContains("Message", "Successfully Test Generated");
		return true;
	}
	public boolean monitor_test()
	{
		hardWait(10);
		isElementDisplayed("Completed");
		element("Completed").click();
		isElementDisplayed("dots");
		element("dots").click();
		isElementDisplayed("Monitortst");
		element("Monitortst").click();
		isElementDisplayed("heading");
		return true;
	}
	public boolean click_on_cross_icon()
	{
		hardWait(10);
		isElementDisplayed("close");
		element("close").click();
		isElementDisplayed("Assessments");
		return true;
	}
	public boolean textfield()
	{
		isElementDisplayed("txtfield");
		element("txtfield");
		return true;
	}
}



