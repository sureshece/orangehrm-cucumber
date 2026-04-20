Feature: Check homepage functionality of OrangeHRM

Background:
    Given user is on login page
    When user enters username and password
    Then user navigates to homepage

Scenario: Logout functionality
    When user clicks on username
    Then logout link should be displayed

Scenario: Admin page navigation
    When user clicks on Admin button
    Then admin page should open