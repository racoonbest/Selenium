@regression
Feature: share with a friend
  Scenario: share a book with a friend
    Given Customer is on DemoShop home page
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click on log in
    Then Customer should see log out


    When Customer searches for a book
    Then Customer is on search page

    When Customer click to book
    And Customer click email a friend button
    Then Verify Customer is on email a friend tab

    When Customer enters friend's email
    And Customer click on send email
    Then Verify Your message has been sent

