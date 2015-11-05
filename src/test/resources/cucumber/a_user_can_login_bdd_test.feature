Feature: Login of a user

  Scenario: User Hans logs in successfuly
    Given a user with name and password
    When the user tries to login with name hans and password wurst
    Then the login is successful

  Scenario: User Klaus logs in fails
    Given a user with name and password
    When the user tries to login with name klaus and password käse
    Then the login fails