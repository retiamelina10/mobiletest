Feature: Login
  As a user
  I want to login
  So I can see my account

  Scenario: Login with valid account
    Given I am on login page
    When I input valid email
    And I input valid password
    And I click login button
    Then I success login

  Scenario: Login with invalid email and valid password
    Given I am on login page
    When I input invalid email
    And I input valid password
    And I click login button
    Then I can not login

    Scenario: Login with invalid password
      Given I am on login page
      When I input valid email
      And I input invalid password
      And I click login button
      Then I can not login

      Scenario: Login wit null email and password
        Given I am on login page
        When I click login button
        Then I can not login




