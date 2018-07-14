$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/praveengaddam/bdd-sample/Test1/src/main/java/Features/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Move to Deals page",
  "description": "",
  "id": "move-to-deals-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test case to move from Home page to Deals",
  "description": "",
  "id": "move-to-deals-page;test-case-to-move-from-home-page-to-deals",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "userx is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "users enters \"\u003cUsername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "users clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on deals",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "move-to-deals-page;test-case-to-move-from-home-page-to-deals;",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ],
      "line": 12,
      "id": "move-to-deals-page;test-case-to-move-from-home-page-to-deals;;1"
    },
    {
      "cells": [
        "savyamaddineni",
        "Welcome@1"
      ],
      "line": 13,
      "id": "move-to-deals-page;test-case-to-move-from-home-page-to-deals;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Test case to move from Home page to Deals",
  "description": "",
  "id": "move-to-deals-page;test-case-to-move-from-home-page-to-deals;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "userx is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "users enters \"savyamaddineni\" and \"Welcome@1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "users clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on deals",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinition.users_is_on_the_login_page()"
});
formatter.result({
  "duration": 8785128137,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "savyamaddineni",
      "offset": 14
    },
    {
      "val": "Welcome@1",
      "offset": 35
    }
  ],
  "location": "HomeStepDefinition.users_enters_Username_and_password(String,String)"
});
formatter.result({
  "duration": 1273617939,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.userw_clicks_login_button()"
});
formatter.result({
  "duration": 5334576252,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.user_clicks_on_deals()"
});
formatter.result({
  "duration": 891818306,
  "status": "passed"
});
});