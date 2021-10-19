Feature: Wish List
  Scenario: Adding an item to Wishlist successfully
    Given Customer is on DemoShop home page wishlist
    When Customer searches for a book
    Then Customer is on search page
    When Customer click to book
    When Customer adds item to wishlist
    Then Customer should see wishlist updated

