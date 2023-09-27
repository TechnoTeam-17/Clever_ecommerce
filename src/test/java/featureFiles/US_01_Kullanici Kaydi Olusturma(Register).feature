Feature:Login functionality
  @SmokeTest
  Scenario: Login with valid usernama amd password

    Given Navigate to Site
    When Click Sign Button
    Then Enter E-mail adress And Password
    And Click on Sign in