Feature: Move to Deals page

Scenario Outline: Test case to move from Home page to Deals

Given userx is on the login page
When users enters "<Username>" and "<password>"
  Then users clicks login button
  Then user clicks on deals


  Examples:
    | Username         |      password    |
    |savyamaddineni    |    Welcome@1     |

