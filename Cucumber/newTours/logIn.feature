Feature: NewTours Application LogIn Functionality
Scenario Outline: Validating LogIn Functionality

Given Open GoogleChrome Browser and navigate to newtours application
When User enters valid "<UserName>" and "<Password>" and click on SignIn button
Then User should be able to succesfully login to the Application

Examples:
   | UserName |  Password |
   | sirisha  |  siri     |
   | bhaskar  |  balu     |
   | jithya   |  jith     |
   | lohith   |  lohi     |  