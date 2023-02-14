Feature: Registration include valid and invalid scenarios with appropriate assertation

  @Automobili
  Scenario Outline: Registration valid user (random email and known password)

    Given a user reads test data from "polovniautomobili" "mojprofil" by id "<TC_ID>"
    And user clicks on registration
    And user enters email
    And user enters password
    And user checkbox
    And user clicks emaila button
#    Then user should be verified confirmation of button

    Examples:
      | TC_ID  |
      | SI_006 |

#  @Automobili
#  Scenario Outline: Login invalid user(empty email)
#
#    Given a user reads test data from "polovniautomobili" "mojprofil" by id "<TC_ID>"
#    And user clicks on mojProfil
#    And user clicks on mojProfil subItem
#    And user enters email and or password for login
#    Then user should be verified login action
#
#    Examples:
#      | TC_ID  |
#      | SI_002 |
#
#  @Automobili
#  Scenario Outline: Login invalid user(wrong email)
#
#    Given a user reads test data from "polovniautomobili" "mojprofil" by id "<TC_ID>"
#    And user clicks on mojProfil
#    And user clicks on mojProfil subItem
#    And user enters email and or password for login
#    Then user should be verified login action
#
#    Examples:
#      | TC_ID  |
#      | SI_003 |
#
#  @Automobili
#  Scenario Outline: Login invalid user(empty password)
#
#    Given a user reads test data from "polovniautomobili" "mojprofil" by id "<TC_ID>"
#    And user clicks on mojProfil
#    And user clicks on mojProfil subItem
#    And user enters email and or password for login
#    Then user should be verified login action
#
#    Examples:
#      | TC_ID  |
#      | SI_004 |
#
#  @Automobili
#  Scenario Outline: Login invalid user(wrong password)
#
#    Given a user reads test data from "polovniautomobili" "mojprofil" by id "<TC_ID>"
#    And user clicks on mojProfil
#    And user clicks on mojProfil subItem
#    And user enters email and or password for login
#    Then user should be verified login action
#
#    Examples:
#      | TC_ID  |
#      | SI_005 |
