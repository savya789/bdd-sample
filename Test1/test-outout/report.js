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
  "duration": 9422521732,
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
  "duration": 525303810,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.userw_clicks_login_button()"
});
formatter.result({
  "duration": 5417519472,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.user_clicks_on_deals()"
});
formatter.result({
  "duration": 10256488997,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"navmenu\"]/ul/li[5]/a\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.38.552518 (183d19265345f54ce39cbb94cf81ba5f15905011),platform\u003dMac OS X 10.10.5 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027Praveens-MacBook-Pro.local\u0027, ip: \u0027192.168.2.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552518 (183d19265345f5..., userDataDir: /var/folders/vr/jjvw_yhj6nl...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 88cab96e2a2d9d97c757fb78a971e846\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"navmenu\"]/ul/li[5]/a}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat LogicDerived.HomePage.clickonDeals(HomePage.java:50)\n\tat StepDefinition.HomeStepDefinition.user_clicks_on_deals(HomeStepDefinition.java:50)\n\tat ✽.Then user clicks on deals(/Users/praveengaddam/bdd-sample/Test1/src/main/java/Features/homepage.feature:8)\n",
  "status": "failed"
});
});