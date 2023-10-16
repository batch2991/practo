package base;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;


public class BasePage extends PageObject
{
   public static String dName,fees,exp;
   
      
   public void openurl()
   {
	   getDriver().manage().window().maximize();
	   open();
   }
}
