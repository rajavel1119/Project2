package com.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("User Launch Adactin Web Apllication")
	public void user_Launch_Adactin_Web_Apllication() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
	    WebDriver wb = new ChromeDriver();
	    wb.get("https://facebook.com/");
	    wb.manage().window().maximize();
	}

	@Then("User Verify Adactin Home Page is Displayed")
	public void user_Verify_Adactin_Home_Page_is_Displayed() {
	}

	@When("User Enters Valid Username and Valid Password")
	public void user_Enters_Valid_Username_and_Valid_Password() {
	}

	@When("User Clicks Login button")
	public void user_Clicks_Login_button() {

	}

	@When("User Select Valid Location, Hotel ,Roomtype")
	public void user_Select_Valid_Location_Hotel_Roomtype() {

	}

	@When("User Click Search button")
	public void user_Click_Search_button() {

	}

	@Then("User Verify Search Hotel is Displayed")
	public void user_Verify_Search_Hotel_is_Displayed() {

	}

	@Then("User Clicks Radio button and Clicks Continue button")
	public void user_Clicks_Radio_button_and_Clicks_Continue_button() {

	}

	@Then("User Verify Book Hotel Page is Displayed")
	public void user_Verify_Book_Hotel_Page_is_Displayed() {

	}

	@When("User Enter Valid Firstname,Lastname and Billing Address")
	public void user_Enter_Valid_Firstname_Lastname_and_Billing_Address() {

	}

	@When("User Enter Valid Credit Card No and Select Valid Card Type,Expiry Month and Expiry Year and Enter Valid CVV No")
	public void user_Enter_Valid_Credit_Card_No_and_Select_Valid_Card_Type_Expiry_Month_and_Expiry_Year_and_Enter_Valid_CVV_No() {

	}

	@When("User Clicks Book Now button")
	public void user_Clicks_Book_Now_button() {

	}

	@Then("User Verify Booking No is Displayed")
	public void user_Verify_Booking_No_is_Displayed() {

	}


}
