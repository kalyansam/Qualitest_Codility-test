Feature: feature to test  functionality
@smoketest
 Scenario: validate if user is on expected website or not
    Given Enter wesite url
    And user is on demo  page
    When read title page
    Then user is on expected Title page
