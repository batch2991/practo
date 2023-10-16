package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.DoctorsListPage;
import pages.HomePage;
import pages.SingleDoctorPage;

public class Appointments 
{
	@Steps
	HomePage homepage;
	
	@Steps
	DoctorsListPage doctorslistpage;
	
	@Steps
	SingleDoctorPage singledoctorpage;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() 
	{
      homepage.openurl();
      

	}

	@When("enter city to search")
	public void enter_city_to_search() 
	{
		homepage.selectCity();
	    

	}

	@When("enter speciality and click search")
	public void enter_speciality_and_click_search()
	{
		  homepage.selectSpeciality();

	}

	@When("click on any one of the doctor")
	public void click_on_any_one_of_the_doctor()
	{
         doctorslistpage.clickOneDoctor();

	}

	@Then("verify doctorname fees and year of exp is correct in next page")
	public void verify_doctorname_fees_and_year_of_exp_is_correct_in_next_page() 
	{

        singledoctorpage.verifyDoctorNameAndFees();
	}

	@Given("user is on doctors list page")
	public void user_is_on_doctors_list_page() 
	{
          System.out.println("user is on doctors list page");

	}

	@When("click on Tomorrow")
	public void click_on_tomorrow() 
	{
			System.out.println("click tomorrow");

	}

	@When("click on one of the slot")
	public void click_on_one_of_the_slot() 
	{

		System.out.println("click on one slot");
	}

	@Then("the slot selected and visible slot in next page is same")
	public void the_slot_selected_and_visible_slot_in_next_page_is_same() 
	{
            System.out.println("verify slot");

	}
}
