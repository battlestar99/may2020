Feature: Facebook sign up feature testing


@regression
  Scenario Outline: facebook sign up validation with multiple sets of data
    Given user is on the facebook sign up page
    When user can enter the firstname "<firstName>" in facebook
    And user can enter the lastname "<lastname>" in facebook
    And user can enter the email "<email>" in facebook
    Then user should be able to close the browser

    Examples: 
      | firstName | lastname | email         |
      | Michael   | Scott    | sm@test.com   |
      | Bob       | ward     | ward@test.com |
      | Mike      | vans     | mike@test.com |
      | test1     | tst1     | sm@test.com   |
