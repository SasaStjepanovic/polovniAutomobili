Feature: General scenarios include check each menu item and their sub menu items

  @Automobili
  Scenario Outline: Check first header menu item "Brza Pretraga" and all sub items

    Given a user reads test data from "polovniautomobili" "automobili" by id "<TC_ID>"
    Then user should be verify title of page
    And user choosed automobile mark


    Examples:
      | TC_ID  |
      | SI_001 |
