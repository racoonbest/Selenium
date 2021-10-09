Feature: Community poll
  Scenario: Verify only register customer can vote
    Given Customer is on DemoShop home page
    When Customer click to excellent
    When Customer click to vote
    Then Verify text:Only register Customer can vote
