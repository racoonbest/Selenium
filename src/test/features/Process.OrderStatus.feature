Feature: Collect order status
  Scenario: Collect Order statuses and save it


    Given Customer is on DemoShop home page login
    When Customer clicks on log in
    Then Customer should land on sign in page

    When Customer enters email
    When Customer enters valid password
    When Customer click on remember me
    When Customer click on log in
    Then Customer should see log out

    When Customer click to orders
    Then verify customer is on My account-order page
    Then Customer should see order number

    When Customer picks all the order numbers

