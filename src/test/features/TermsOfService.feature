Feature: Terms And Conditions
  @smoke
  Scenario:
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
    When Customer clicks on checkout
    Then Customer should see error pop-up