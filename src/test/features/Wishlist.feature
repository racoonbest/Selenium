@regression
Feature: Wishlist
  Scenario: Adding an item to Wishlist successfully
    Given Customer is on DemoShop home page wishlist
    When Customer adds item to wishlist
    Then Customer should see wishlist updated