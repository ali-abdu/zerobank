Feature:LoginFunctionality
@login
Scenario: : Login
    Given user is on login page for ZeroBank
    When user login with username "username" and  password "password"
    Then verify page title is "Zero Bank"

    Scenario: Login with invalid credentials
      Given user is on login page for ZeroBank
      When user login with wrong username "aa" and password "ll"
      Then error message should be displayed "Login	and/or password are wrong"
      And user with blank username " " and password " " should not be able to login