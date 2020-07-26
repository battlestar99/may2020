


Feature: Facebook sign up feature 



 
@regression
  Scenario: facebook sign up validation  
  
   Given user is on the facebook sign up page 
    When user can enter the firstName "Mike"
    And  user can enter the last name "Scott"
    Then user can enter the email "mics@gmail.com" 
    And user should be able to close the browser