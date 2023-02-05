Feature: General scenarios include check web cart and enter/verify each of menu items

  @Automobili
  Scenario Outline: Check that shopping cart is initially empty

    Given a user reads test data from "polovniautomobili" "general" by id "<TC_ID>"

    Examples:
      | TC_ID  |
      | SI_004 |




