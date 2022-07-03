Feature: Test  functionality

  @smoketest
  Scenario Outline: Check login is successful with valid credentials
    Given user has added four random items to my card
    When user views my card
    Then user finds four items listed in my cart 
 

