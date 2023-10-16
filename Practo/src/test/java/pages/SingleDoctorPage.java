package pages;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.BasePage;
import net.serenitybdd.annotations.Step;


public class SingleDoctorPage extends BasePage
{

	By docname= By.xpath("//h1[@data-qa-id='doctor-name']");
	By docfees=By.xpath("//div[@class='u-f-right u-large-font u-bold u-valign--middle u-lheight-normal']");
			
	@Step
	public void verifyDoctorNameAndFees()
	{
		ArrayList<String> tabs=new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs.get(1));
		String dname2=$(docname).getText();
		String fees2=$(docfees).getText().split(" ")[1];
		Assert.assertEquals(dName, dname2);
		Assert.assertEquals(fees,fees2);
		
	}
	@Step
	public void clickOneSlotTomorrow()
	{
		
	}
	@Step
	public void verifySlotDetails()
	{
		
	}
}
