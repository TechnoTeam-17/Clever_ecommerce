
Feature: US_06_CheckAddToCartList

   Background:
     Given Navigate to clever ECommerce login
     When Enter username and password and click Sign in button

  @Test
  Scenario: Add To Cart List

    Given Click Dresses category select a random item
    When Verify all products in the shopping cart

