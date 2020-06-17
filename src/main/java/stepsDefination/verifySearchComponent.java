package stepsDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;
import com.testingshastra.pages.SearcSelecthHeaderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verifySearchComponent  {
	Logger log =Logger.getLogger(verifySearchComponent.class);
	SearcSelecthHeaderPage step;
	
	@BeforeTest
	public void initializePageobject() {
      step=PageFactory.initElements(Constants.driver, SearcSelecthHeaderPage.class);
	}
	@Given("^User login into the system.$")
	public void user_login_into_the_system() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		
		log.info("Myntra Url is launched Successfully");
		
	}

	@When("^user enter value in search component.$")
	public void user_enter_value_in_search_component() {
	    // Write code here that turns the phrase above into concrete actions
		MyntraKeyword.enterText("xpath", "//input[@placeholder='Search for products, brands and more']", "T-shirt");
	    log.info("Enter value successfully");
	
	}

	@Then("^user click magnifier button.$")
	public void user_click_magnifier_button() {
	    // Write code here that turns the phrase above into concrete actions
		MyntraKeyword.performClick("xpath", "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']");
	}

	


}
