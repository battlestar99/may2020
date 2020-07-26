#Author: anik@agile1tech.com


Feature: Yahoo sign up feature 

Background: 

 Given user is on the yahoo sign up page 
  
  @smoke @regression
  Scenario: yahoo sign up page url and title validation 
  
   
    When user can see the right title of the page
    And  user can be in the right url
    Then user can start creating a new account 
    And user should be able to close the browser
    
   @smoke @regression 
  Scenario: yahoo sign up web elements validation 
  
  
   When user should be see the firstname box visable and enabled
   And user should have the lastname box visible and enabled 
   And user should have the password box visible and enabled
   And user should have the drop down menu for phone number
   Then user should have all the web elements require for sign up 
   And user should be able to close the browser
   
   Scenario: yahoo sign up web elements verification
   
    