Feature: Search And Select prodtuct feature
@smoke
Scenario: Verify Redirection to homepage when click on logo after Search and select
Given User launch the application Url
Then User enter value in search Component 
Then User click On magnifier button
When User click on Logo from product page,verify redirect to homepage
