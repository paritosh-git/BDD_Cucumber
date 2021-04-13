@run
Feature: Add user on Offline Website

Scenario: Add user 

Given user should be on user page
When user clicks on user linkText
And user clickson AddUser button
And users fills all details
And click submit button
Then user should see success massage


