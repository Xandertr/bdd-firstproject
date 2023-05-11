Feature: Test Login Functionality of WebOrders application

  Scenario: Login Functionality Positive
    Given user is launches the browser
    And user nagivates to the login page
    And user enters "Tester" in username input box
    And user enters "test" in password input box
    And user clicks on login button
    Then user should be nagivated to the orders page