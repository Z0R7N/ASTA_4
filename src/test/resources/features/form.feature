Feature: Filling Out the Form

  Scenario: Filling out the form in a separate window
    Then Click link "Zadanie 4"
    Then Click form button
    Then Switch window "1"
    Then Switch frame "0"
    Then Enter name and family
    Then Enter email
    Then Enter phone
    Then Click button Save