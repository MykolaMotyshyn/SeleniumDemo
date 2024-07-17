Feature: As a web site user
  I want to navigate through the main
  header buttons

  @severity=critical
  @TmsLink=TIEC-1
  @Demo
  Scenario: [TIEC-1] Interaction with main header buttons
    Given user opens browser with web site address
    Then user checks the search input field is displayed
    When user enter "automation" to search input field
    Then user checks titles
    Then user clicks main button
