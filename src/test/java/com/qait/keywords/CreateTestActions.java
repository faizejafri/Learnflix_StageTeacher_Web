package com.qait.keywords;


import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;

public class CreateTestActions extends GetPage {

	public CreateTestActions(WebDriver driver) {
		super(driver, "CreateTest"); 
	}
	public boolean create_test_tab_is_displayed()
	{
		isElementDisplayed("CreateTest");
		element("CreateTest").click();
		return true;
	}
	public boolean navigate_to_assessment_creation_page()
	{
		isElementDisplayed("AssessmentCreation");
		element("AssessmentCreation").click();
		return true;
	}
	public boolean assessment_types_should_be_displayed()
	{
		isElementDisplayed("AssessmentType","Online");
		isElementDisplayed("AssessmentType","Pen and Paper");
		
		return true;
	}
	public boolean click_on_class()
	{
		isElementDisplayed("Class");
		element("Class").click();
				return true;
	}
	public void verify_class_options_in_dropdown()
	{
		hardWait(10);
		List expectedvalues = new ArrayList();
		expectedvalues.add("8");
		expectedvalues.add("7");
		expectedvalues.add("6");
		expectedvalues.add("5");
		expectedvalues.add("4");
		expectedvalues.add("6");
		expectedvalues.add("9");
		expectedvalues.add("10");
		
		List<WebElement> actualvalues = driver.findElements(By.xpath("//span[contains(@class,'mat-option-text')]"));
		java.util.Iterator<WebElement> i=actualvalues.iterator();
		while(i.hasNext())
		{
			WebElement row = i.next();
			for(int k=0;k<10;k++)
		{
				AssertJUnit.assertEquals(row.getText(),expectedvalues.get(k));
				
		}
			//element("SelectClass").click();
			//System.out.println(row.getText());
			//System.out.println(expectedvalues);
		}
	}
	public boolean click_on_subject()
	{
		isElementDisplayed("SelectClass");
		element("SelectClass").click();
		isElementDisplayed("Subject");
		element("Subject").click();
		return true;
	}
	public void verify_subject_options()
	{
		hardWait(10);
		List expectedvalues = new ArrayList();
		
		expectedvalues.add("Science");
		expectedvalues.add("Mathematics");
		List<WebElement> actualvalues = driver.findElements(By.xpath("//span[contains(@class,'mat-option-text')]"));
		java.util.Iterator<WebElement> i=actualvalues.iterator();
		while(i.hasNext())
		{
			WebElement row = i.next();
		//	for(int k=0;k<3;k++)
		//{
				AssertJUnit.assertEquals(row.getText(),"Science");
				
				System.out.println(row.getText());
		//}
	}
		
	}
	public boolean selectField(String fieldName, String value) {
		click(element("fields_Dropdown", fieldName));
		click(element("dropdown_SelectValue", value));
		logMessage("Selected " + fieldName + "value to " + value);
		return true;
	}
	public boolean Next_button()
	{
		hardWait(10);
		isElementDisplayed("Nextbtn");
		element("Nextbtn").click();
		return true;
	}
	
	public boolean Select_Assessment_type()
	{
		hardWait(20);
		isElementDisplayed("PenAndPaper");
		element("PenAndPaper").click();
		return true;
	}
	public boolean parameters()
	{
		hardWait(20);
		isElementDisplayed("PickQuestion");
		isElementDisplayed("UploadPdf");
		return true;
	}
	public boolean select_parameter()
	{
		hardWait(20);
		isElementDisplayed("PickQuestion");
		element("PickQuestion").click();
		isElementDisplayed("Nextbtn");
		element("Nextbtn").click();
		return true;
	}
	public boolean subjective_test_page()
	{
		hardWait(20);
		isElementDisplayed("SubjectivePage");
		element("SubjectivePage").click();
		return true;
	}
	public boolean textfields_should_display()
	{
		hardWait(20);
		isElementDisplayed("txtfield","Subjective");
		isElementDisplayed("txtfield","Duration");
		isElementDisplayed("txtfield","Add");
		return true;
	}
	public boolean next_button()
	{
		hardWait(20);
		isElementDisplayed("Nextbtn");
	
		return true;
	}
	public boolean cancel_button()
	{
		hardWait(20);
		isElementDisplayed("Cancelbtn");
		element("Cancelbtn").click();
		isElementDisplayed("Heading");
		return true;
	}
	public boolean create_test()
	{
		hardWait(20);
		isElementDisplayed("textfield","assesmentName");
		isElementDisplayed("textfield","assesmentDuration");
		isElementDisplayed("AddInstructions");
		element("textfield","assesmentName").sendKeys("Objective");
		element("textfield","assesmentDuration").sendKeys("8");
		element("AddInstructions").sendKeys("Answer Every Question");
		isElementDisplayed("Nextbtn");
		element("Nextbtn").click();
		return true;
	}
	public boolean verify_options()
	{
		isElementDisplayed("Import");
		isElementDisplayed("AddNewQuestion");
		return true;
	}
	public boolean buttons()
	{
		hardWait(10);
		isElementDisplayed("Cancelbtn");
		isElementDisplayed("Previous");
		isElementDisplayed("Nextbutton");
		return true;
	}
	public boolean next_button_is_disabled()
	{
		isElementDisplayed("Nextbutton");
		return true;
	}
	public boolean add_new_questions()
	{
		isElementDisplayed("AddNewQuestion");
		element("AddNewQuestion").click();
		return true;
	}
	public boolean verify_textfields_on_clicking_add_new_questions()
	{
		hardWait(10);
		isElementDisplayed("fields_Dropdown","Chapter");
		isElementDisplayed("fields_Dropdown","Concept");
		isElementDisplayed("fields_Dropdown","Difficulty Level");
		isElementDisplayed("txtfield","Question");
		isElementDisplayed("txtfield","Answer");
		isElementDisplayed("txtfield","Negative Marks");
		isElementDisplayed("Cancelbtn");
		isElementDisplayed("Previous");
		isElementDisplayed("Nextbutton");
		return true;
	}
	public boolean add_new_question(String fieldName, String value)
	{
		hardWait(10);
		click(element("fields_Dropdown", fieldName));
		click(element("dropdown_SelectValue", value));
		logMessage("Selected " + fieldName + "value to " + value);
		return true;
	}
	public boolean select_difficulty_level()
	{
		hardWait(10);
		isElementDisplayed("lvl","Difficulty Level");
		click(element("lvl","Difficulty Level"));
		click(element("lvloption","Hard"));
		return true;
	}
	public boolean add_question_and_answer()
	{
		hardWait(10);
		isElementDisplayed("QuesText");
		element("QuesText").sendKeys("Some Question");
		
		isElementDisplayed("AnsText");
		element("AnsText").sendKeys("Some Answer");
		element("Nextbutton").click();
		return true;
	}
	public boolean click_on_Save_button()
	{
		
		isElementDisplayed("Savebtn");
		element("Savebtn").click();
				return true;
	}
}

		
		
		
		
	

