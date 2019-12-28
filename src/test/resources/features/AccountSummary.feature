Feature: AccountSummary Page

  Background:
    Given user is on login page for ZeroBank
    When user login with username "username" and  password "password"

    @wip
  Scenario: Account types is displayed
    When user on Account Summary Page
    Then verify that following Account types are displayed

    |Cash Accounts      |
    |Investment Accounts|
    |Credit Accounts    |
    |Loan Accounts      |
