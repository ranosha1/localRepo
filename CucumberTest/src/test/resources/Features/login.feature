Feature: Free CRM Login Feature

Scenario: Free CRM login Test Scenario

Given User is already on Login Page
When title of login page is Free CRM
Then User enters username and password
And user clicks on login button
Then user is on home page

Scenario: User is able to create a new contact

Given User is already on home page
When User mouse over on contacts link
Then User clicks on new contact link
Then User enters first name and last name
Then User clicks on save button
Then Verify new contact created

