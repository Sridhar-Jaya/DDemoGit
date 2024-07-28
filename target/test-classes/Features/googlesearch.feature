Feature: feature to test google search
@testdemo
Scenario: validate the google
Given browser open
And user is on google search page
When user enters text
And hits enter
Then user is with results

