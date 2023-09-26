Feature:add product to cart
  As a user
  I want to add products to my shopping cart
  So that I can purchase them later

  Background:

    Given Navigate to clever ECommerce login
    When Enter username and password and click Sign in button
    Then User should login successfully

  Scenario:Add to Cart

      Given I am on the product page
      When I click on the "Add to Cart" button for the product
      Then the product should be added to my shopping cart
      And the shopping cart should display the correct total price



  Scenario:Product added to cart successfully

    Given I am on the product page
      When I click on the "Add to Cart" button for the product
      Then the product should be added to my shopping cart
      And I should see a confirmation message "Product added to cart successfully"
