@Data
Feature: Free CRM Login Feature

Scenario Outline: Free CRM login Test Scenario

Given User is already on Login Page
When title of login page is Free CRM
Then User enters "<username>" and "<password>"
And user clicks on login button
Then user is on home page

Examples:

	|naveenk|test@123|
	|tom	|test456 |
