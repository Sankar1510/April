package com.stepdef.in;

import org.openqa.selenium.WebDriver;



import com.Cucumber2.BaseClassCucumbers4;
import com.Cucumber2.POM;
import com.properties.in.FileReaderManger;
import com.runner.in.Runner;

import io.cucumber.java.en.*;

public class Stepdef1 extends BaseClassCucumbers4 {
	public static WebDriver driver=Runner.driver;
    POM po=new POM(driver);
    
	@Given("Application Launched Successfully")
	public void application_launched_successfully() throws Throwable {
	   waitimplicity(20);
	   String Url = FileReaderManger.getInstanceFR().getInstanceCR().GetUrl();
	  
	   geturl(Url);
	}
	@When("Enter the user name")
	public void enter_the_user_name() throws Throwable {
		String UserName = FileReaderManger.getInstanceFR().getInstanceCR().GetUserName();
		inputValues(po.getUsername(),UserName);
		
	}
	@When("Enter the user password")
	public void enter_the_user_password() throws Throwable {
		String Password = FileReaderManger.getInstanceFR().getInstanceCR().GetPassword();
		inputValues(po.getPassword(),Password);
		
	}
	@Then("User click the Login button")
	public void user_click_the_login_button() {
		clickonElement(po.getLogin());
	}

	@Given("Login successfully")
	public void login_successfully() {
		
	}
	@When("User Enter the Location")
	public void user_enter_the_location() {
		singledrop(po.getLocation(), 3);
	}
	@When("User Enter the Hotels")
	public void user_enter_the_hotels() {
		singledrop(po.getHotel(), 1);
	}
	@When("User Enter the Room Type")
	public void user_enter_the_room_type() {
		singledrop(po.getRoom(), 3);
	}
	@When("User Enter the Number of Room")
	public void user_enter_the_number_of_room() {
		singledrop(po.getNoroom(), 5);
	}
	@When("User Check in date")
	public void user_check_in_date() {
		
	}
	@When("User Check out date")
	public void user_check_out_date() {
	   
	}
	@When("User Enter Adults per room")
	public void user_enter_adults_per_room() {
		singledrop(po.getAdultroom(), 4);
	}
	@When("User Enter children per room")
	public void user_enter_children_per_room() {
		singledrop(po.getChildroom(), 3);
	}
	@Then("User click the Search button")
	public void user_click_the_search_button() {
		 clickonElement(po.getSearch());
	}

	@Given("Search successfully")
	public void search_successfully() {
	  
	}
	@When("User click the select button")
	public void user_click_the_select_button() {
		 clickonElement(po.getRadio());
	}
	@Then("User click the Continue")
	public void user_click_the_continue() {
		   clickonElement(po.getContinue());
	}
	@Given("Continue successfully")
	public void continue_successfully() {
	   
	}
	@When("User Enter the First Name")
	public void user_enter_the_first_name() {
		 inputValues(po.getFirstname(), "Sankar");
	}
	@When("User Enter the Last Name")
	public void user_enter_the_last_name() {
		inputValues(po.getLastname(), "narayanan");
	}
	@When("User Enter the Billing Address")
	public void user_enter_the_billing_address() {
		inputValues(po.getAddress(), "Chennai");
	}
	@When("User Enter the Credit Card {int} digit Numbers Fully")
	public void user_enter_the_credit_card_digit_numbers_fully(Integer int1) {
		 inputValues(po.getCardnumber(), "4563792792345678");
	}
	@When("User Select the Credit Card Type")
	public void user_select_the_credit_card_type() {
		 singledrop(po.getCardType(), 1);
	}
	@When("User Select the Expiry Date Month and Year")
	public void user_select_the_expiry_date_month_and_year() {
		 singledrop(po.getExpiryMonth(), 3);
		 singledrop(po.getExpiryYear(), 11);
	}
	@When("User Enter the CVV Number")
	public void user_enter_the_cvv_number() {
		 inputValues(po.getCVV(), "123");
	}
	@Then("Click the Book Now button")
	public void click_the_book_now_button() {
		clickonElement(po.getBook()); 
	}
	
	@Given("Book Now Successfully")
	public void book_now_successfully() {
	   
	}
	@Then("Click the My Itinerary button")
	public void click_the_my_itinerary_button() {
		 clickonElement(po.getItinerary());
	}

	@Given("My Itinerary Successfully")
	public void my_itinerary_successfully() {
	   
	}
	@Then("Click Log out button")
	public void click_log_out_button() {
		 clickonElement(po.getLogout());
	}  





}
