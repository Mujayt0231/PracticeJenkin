 @ui
Feature: Login

Scenario: user should be able to login with valid credentials

Given user is on home page
Then user click Login button
And verify if user have navigated to Login page
Then user enter valid 'Jose@gmail.com' and '123456' and click login button
Then user is on Dashboard page
