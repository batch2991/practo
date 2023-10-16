package pages;

import org.openqa.selenium.By;

import base.BasePage;
import net.serenitybdd.annotations.Step;

public class DoctorsListPage extends BasePage
{

	By docname=By.xpath("//h2[@class='doctor-name']");
	By docfees=By.xpath("//span[@data-qa-id='consultation_fee']");
	
	@Step
	public void clickOneDoctor()
	{
		dName=findAll(docname).get(0).getText();
		fees=findAll(docfees).get(0).getText();
		fees=fees.substring(fees.length()-3);
		
		findAll(docname).get(0).click();		
	}
}
