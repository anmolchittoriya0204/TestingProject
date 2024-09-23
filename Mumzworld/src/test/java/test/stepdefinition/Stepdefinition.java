package test.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.base.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import test.pom.pomPage;

public class Stepdefinition {
	
	public static WebDriver stepdriver;
	
	@Before
	public void beforescenario() {
		System.out.println("-----------------Start of Sceanrio---------------");
	}
	
	@Given("I am on the mumzworld website")
	public void i_am_on_the_mumzworld_website() throws InterruptedException{
		
		stepdriver= new DriverManager().setupChrome();
		stepdriver.get("https://www.mumzworld.com/");
		stepdriver.manage().window().maximize();
		

	}
	
	@When("I search for the product")
	public void i_search_for_the_product() throws InterruptedException {
		new pomPage().enterProductName();
		new pomPage().goToPDP();
	  
	}

	@When("I add the product to the bag")
	public void i_add_the_product_to_the_bag() throws InterruptedException {
		new pomPage().addToBag();
	    
	}

	@When("I view the cart")
	public void i_view_the_cart() throws InterruptedException {
	   new pomPage().viewBag();
	   
	}

	@When("I increase the quantity to {int}")
	public void i_increase_the_quantity_to(Integer int1) throws InterruptedException {
		 new pomPage().increseQty();
	    
	}

	@When("I click on the proceed to checkout")
	public void i_click_on_the_proceed_to_checkout() throws InterruptedException {
		 new pomPage().proceedCheckout();
	    
	}

	@Then("I register a new user")
	public void i_register_a_new_user() throws InterruptedException {
	   new pomPage().signUp();
	    
	}
	
	@After

	public void afterscenario() {
		//stepdriver.close();
	}




}
