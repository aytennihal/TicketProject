Feature: Create new Project

  Background:
    Given user on project create page

  Scenario Outline: User can create new user with valid credentials on User List

    And user enter "<projectName>" to the Project Name
    And user enter "<projectCode>" to the Project Code
    And user select "<assaignedManager>" from select Tab
    And user writes "<projectStartDate>" to start date
    And user writes "<projectEndsDate>" to end date
    And user write "<details>" in Project Details tab
   And user click "Save" for save Project
    #Then user should see project under projects

Examples:
    | projectName | projectCode | assaignedManager| projectStartDate| projectEndsDate | details|
    | Proje1 | 1111             |John Kasey           |11/12/1000       |13/12/1000       |Merhabalar bu proje 1|
    | Proje2 |2222           |Delisa Norre           |02/12/1000       |03/12/1000       |Merhabalar bu proje 2|
