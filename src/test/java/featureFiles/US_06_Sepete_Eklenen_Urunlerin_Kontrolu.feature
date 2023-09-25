
Feature: US_06_CheckAddToCartList

  Background:
    Given Navigate to clever ECommerce login
    When Enter username and password and click Sign in button
    Then User should login successfully


  @Test
  Scenario: Add To Cart List

    Given Click Dresses category select a random 1. item
    When Click the Add To Cart
    Then Navigate to Continue Shopping

    When Select different a random 2. item
    Then Click the Add To Cart

    When Navigate to Continue Shopping
    Then Select different a random 3. item

    And Verify 3 products in the shopping cart

