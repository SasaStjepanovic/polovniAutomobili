Feature: General scenarios include check each menu item and their sub menu items

  @Automobili
  Scenario Outline: Check first header menu item "Brza Pretraga" and all sub items

    Given a user reads test data from "polovniautomobili" "general" by id "<TC_ID>"
    And user clicks header menu item
    Then user should be verify header menu item
    And user clicks I sub menu item
    Then user should be verify I sub menu item
    And user clicks II sub menu item
    Then user should be verify II sub menu item
    And user clicks III sub menu item
    Then user should be verify III sub menu item
    And user clicks IV sub menu item
    Then user should be verify IV sub menu item
    And user clicks V sub menu item
    Then user should be verify V sub menu item
    And user clicks VI sub menu item
    Then user should be verify VI sub menu item
    And user clicks VII sub menu item
    Then user should be verify VII sub menu item
    And user clicks VIII sub menu item
    Then user should be verify VIII sub menu item
    And user clicks IX sub menu item
    Then user should be verify IX sub menu item
    And user clicks X sub menu item
    Then user should be verify X sub menu item
    And user clicks XI sub menu item
    Then user should be verify XI sub menu item

    Examples:
      | TC_ID  |
      | SI_001 |

  @Automobili
  Scenario Outline: Check second header menu item "PONUDA VOZILA" and all sub items

    Given a user reads test data from "polovniautomobili" "general" by id "<TC_ID>"
    And user clicks header menu item
    Then user should be verify header menu item
    And user clicks I sub menu item
    And user clicks II sub menu item
    And user clicks III sub menu item
    And user clicks IV sub menu item
    And user clicks V sub menu item
    And user clicks VI sub menu item
    And user clicks VII sub menu item

    Examples:
      | TC_ID  |
      | SI_002 |

  @Automobili
  Scenario Outline: Check third header menu item "DELOVI I OPREMA" / AUTO DELOVI and all sub items

    Given a user reads test data from "polovniautomobili" "general" by id "<TC_ID>"
    And user clicks header menu item
    Then user should be verify header menu item
    And user clicks I sub menu item
    And user clicks II sub menu item
    And user clicks III sub menu item
    And user clicks IV sub menu item
    And user clicks V sub menu item
    And user clicks VI sub menu item
    And user clicks VII sub menu item
    And user clicks IX sub menu item
    And user clicks X sub menu item

    Examples:
      | TC_ID  |
      | SI_003 |

  @Automobili
  Scenario Outline: Check third header menu item "DELOVI I OPREMA" / NAJTRAZENIJE KATEGORIJE and all sub items

    Given a user reads test data from "polovniautomobili" "general" by id "<TC_ID>"
    And user clicks header menu item
    Then user should be verify header menu item
    And user clicks I sub menu item
    And user clicks II sub menu item
    And user clicks III sub menu item
    And user clicks IV sub menu item
    And user clicks V sub menu item
    And user clicks VI sub menu item
    And user clicks VII sub menu item
    And user clicks IX sub menu item
    And user clicks X sub menu item

    Examples:
      | TC_ID  |
      | SI_004 |

  @Automobili
  Scenario Outline: Check forth header menu item PRODAJEM and all sub items

    Given a user reads test data from "polovniautomobili" "general" by id "<TC_ID>"
    And user clicks header menu item
    Then user should be verify header menu item
    And user clicks I sub menu item
    And user clicks II sub menu item
    And user clicks III sub menu item
    And user clicks IV sub menu item

    Examples:
      | TC_ID  |
      | SI_005 |


