Feature: Checking The Number of Listed Products


    @SmokeTest

    Scenario: Verify the product list on the dresses category

    Given     Navigate to clever ECommerce login
    When      Enter username and password and click Sign in button
    Then      User should login successfully
    And       Navigate to dresses
    When      The User is at the dresses page
    Then      The User should see there are five products
    And       The User counts the number of products listed on the page
    Then      The user verifies that the count matches the numbers in step three and step four



