Feature: Login functionality


  Scenario: Login with valid username and password

    Given Navigate to clever ECommerce login
    When Enter username and password and click Sign in button
    Then User should login successfully