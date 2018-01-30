$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.User_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 8280181160,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 17882298,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_username_and_password()"
});
formatter.result({
  "duration": 268507754,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3034028660,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 21102755,
  "status": "passed"
});
});