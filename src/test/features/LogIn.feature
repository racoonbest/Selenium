@regression
Feature: Log in
  @login
  Scenario: Successful log in
    Given Customer is on DemoShop home page login
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters an email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click on log in
    Then Customer should see log out