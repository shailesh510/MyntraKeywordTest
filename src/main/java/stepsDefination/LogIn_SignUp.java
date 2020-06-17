package stepsDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;
import com.TestingSearchComponent.myntraSearchComponent;
import com.testingshastra.pages.loginHeaderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogIn_SignUp {

	Logger log = Logger.getLogger(LogIn_SignUp.class);
	loginHeaderPage step;

	@BeforeTest
	public void initializePageobject() {
		step = PageFactory.initElements(Constants.driver, loginHeaderPage.class);
	}

	@Given("^User launches the Application Url$")
	public void user_launches_the_Application_Url() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		log.info("Application Open Successfully");
	  	}

	@When("^User mouse hover on profile$")
	public void user_mouse_hover_on_profile() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']");
		log.info("Mouse Hover on profile");
	}

	@Then("^User click On signUp Or LogIn button$")
	public void user_click_On_signUp_Or_LogIn_button() {
		MyntraKeyword.performClick("xpath", "//a[@class='desktop-linkButton']");
		log.info("click on LOgIn/SignUp Button");
	}

	@Then("^User enter valid Mobile number$")
	public void user_enter_valid_Mobile_number() {
		MyntraKeyword.enterText("xpath", "//input[@class='form-control mobileNumberInput']", "7387503935");
		log.info("Enter Mobile number");
	 	}

	@Then("^click on Continue button$")
	public void click_on_Continue_button() {
		MyntraKeyword.performClick("xpath", "//div[@class='submitBottomOption']");
		log.info("Click On Continue Button");
	  	}
	@Then("^wait for three second$")
	public void wait_for_three_second() {
		MyntraKeyword.implictWait();
		}

	@Then("^User enter the password$")
	public void user_enter_the_password() {
		MyntraKeyword.enterText("xpath", "//input[@class='form-control has-feedback']","@Shailesh$1234");
		log.info("Enter Password");
	  	}

	@Then("^User click On LogIn button$")
	public void user_click_On_LogIn_button() {
	MyntraKeyword.performClick("xpath", "//button[contains(@class,'lg block submitButton')]");	
	log.info("click On LogIn Button");
		
	}



}
