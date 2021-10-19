@regression
Feature: Addresses
  Scenario: Verify Costumer name
    Given Customer is on DemoShop home page
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters an email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click on log in
    Then Customer should see log out

    When Customer click to addresses
    Then verify customer is on My account - Addresses
    Then Verify customer name is John Smith
