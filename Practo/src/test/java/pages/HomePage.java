package pages;

import org.openqa.selenium.By;

import base.BasePage;
import net.serenitybdd.annotations.Step;

public class HomePage extends BasePage 
{

	By crossicon=By.xpath("(//i[@class='.icon-ic_cross_solid'])[2]");
	By searchloc=By.xpath("//input[@placeholder='Search location']");
	By cityname=By.xpath("//div[text()='Hyderabad']");
	By speciality=By.xpath("//div[text()='Dentist']");
		
	@Step
	public void selectCity()
	{
		$(searchloc).clear();
		//$(crossicon).click();
		$(searchloc).sendKeys("Hydera");
		$(cityname).click();		
	}
	@Step
	public void selectSpeciality()
	{
		$(speciality).click();
	}
	
}
