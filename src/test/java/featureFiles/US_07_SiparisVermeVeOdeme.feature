Feature: Adding a new address Functionality

  Background:
    Given Navigate to clever ECommerce login
    When Enter username and password and click Sign in button
    Then User should login successfully
  @SmokeTest @Regression
  Scenario: Add to cart and checking payment methods


    Then Add product to Cart
    Then Click to Cart
    Then Click to checkout
    Then Click to checkout_LinkTextDegil_
    Then Choose the agree terms
    Then Click to checkout_LinkTextDegil_
    Then Click to Paypal method
    Then Assert to error status
    Then Navigate to back
    Then Click to credit card paying method
    Then Assert to invalid request
    Then Navigate to back
    Then Click to Wire payment method
    Then Click to I confirm the my order
    Then Assert to the text of _Your order on Xu Clothing is complete_
    Then Save the order number on the page like VKXXEJRFY