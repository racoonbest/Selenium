@regression
Feature: Wishlist
  Scenario: Adding an item to Wishlist successfully
    Given Customer is on DemoShop home page wishlist
    When Click on add to wishlist
    Then wishlist cart should get updated (0) to (1)