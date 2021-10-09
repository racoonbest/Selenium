@regression
Feature: Guest Customer purchase

  @smoke
  Scenario: A book purchase
    Given Customer is on DemoShop home page
    When Customer clicks on books
    Then Customer should see the Books header

    When Customer orders by price low to high
    When Customer changes the view to list
    When Customer adds the first book to cart
    Then Customer should see updated cart

    When Customer clicks on cart
    Then Customer should land on Shopping Cart Page

    When Customer chooses USA
    When Customer agrees to terms and conditions
    When Customer clicks on checkout
    Then Customer should be redirected to Sign-in page

    When Customer clicks on check-out-as-guest button
    Then Customer is redirected to Checkout

    When Customer enters first name
    And Customer enters last name
    And Customer enters email
    And Customer chooses a country
    And Customer enters address1
    And Customer enters city
    And Customer enters zip
    And customer enters phone
    And customer clicks on continue

    When Customer clicks on pick-up in store checkbox
    And  Customer clicks on continue button
    When Customer clicks on payment continue
    When Customer clicks on confirm continue


    When Customer clicks on confirm
    Then Order number is generated



