@regression
Feature: RewordPoints
  Scenario:Customer able to see Reward Points
    Given Customer is on DemoShop home page
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters email log in
    When Customer enters valid password
    When Customer click on remember me
    When Customer click on log in
    Then Customer should see log out

    When Customer click to My account
    Then Customer in on My account page

    When Customer click to Reward tab
    Then Verify my reward is 0.