$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/praveengaddam/Test1/src/main/java/Features/freecrmlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login Page",
  "description": "",
  "id": "free-crm-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test cases to Login to the Site",
  "description": "",
  "id": "free-crm-login-page;test-cases-to-login-to-the-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Get the title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Get the title of the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefinition.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.get_the_title_of_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.user_clicks_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepdefinition.get_the_title_of_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
});