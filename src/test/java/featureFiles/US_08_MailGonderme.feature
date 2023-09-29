Feature: Mail System Functionality

  Background:
    Given Navigate to clever ECommerce login
    When Enter username and password and click Sign in button
    Then User should login successfully
  @SmokeTest @Regression
  Scenario: Mail System methods


    When Click to Contact Us
    Then User can fill the information boxes
    Then User can select Customer service
    Then Use can put an email address
    Then Use can put an order reference number
    Then Use can upload a document jpeg
    Then Use can write a message
    Then Use can select the product to issue
    Then Use can click submit
    Then Use verify of successfully sent message

