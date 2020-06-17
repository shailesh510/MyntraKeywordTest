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

public class clickOnLogoToRedirect {
	Logger log = Logger.getLogger(clickOnLogoToRedirect.class);
	SearcSelecthHeaderPage step;

	@BeforeTest
	public void initializePageobject() {
		step = PageFactory.initElements(Constants.driver, SearcSelecthHeaderPage.class);
	}

	@Given("^User launch the application Url$")
	public void user_launch_the_application_Url() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		log.info("Application Open Successfully");
	}

	@Then("^User enter value in search Component$")
	public void user_enter_value_in_search_Component() {
		MyntraKeyword.enterText("xpath", "//input[@placeholder='Search for products, brands and more']","Fastrack Watch");

	}

	@Then("^User click On magnifier button$")
	public void user_click_On_magnifier_button() {
		MyntraKeyword.performClick("xpath", "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']");
        log.info("click On Magnifier button");
	}

	@When("^User click on Logo from product page,verify redirect to homepage$")
	public void user_click_on_Logo_from_product_page() {
		
		MyntraKeyword.performClick("xpath", "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']");
		}

}
