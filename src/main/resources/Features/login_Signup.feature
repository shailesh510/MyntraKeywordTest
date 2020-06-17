Feature: User should login_signup successfully 

Scenario: 
	verify mouse hover On profile & LogIn_SignUp button click then login_signUp Successfully 

	Given User launches the Application Url 
	When User mouse hover on profile 
	Then User click On signUp Or LogIn button 
	Then User enter valid Mobile number 
	Then click on Continue button 
	Then wait for three second
	Then User enter the password 
	Then User click On LogIn button 