Feature: Adding a new address Functionality

  Background:
    Given Navigate to clever ECommerce login
    When Enter username and password and click Sign in button
    Then User should login successfully
@Regression
  Scenario: Add a new address
    When Add a new address
    Then My Address should be displayed