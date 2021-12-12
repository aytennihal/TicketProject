@userCreate

Feature: Create New User


Background:
    Given user on user create page

Scenario Outline: User can create new user on User List

   And user enter "<firstName>" to the First Name
  And user enter "<lastName>" to the Last Name
  And user enter "<emailAddress>" to the Email Adress
  And user enter "<phoneNumber>" to the Phone Number
  And user enter "<password>" to the Password
  And user enter "<passwordConfirmation>" to the Password Confirmation
  And user select a "<gender>"
  And user select "<role>"
  And user click "Save"
  Then user should be able to see new user with "<emailadress>" under the User List

  Examples:

    | firstName         | lastName | emailAddress             | phoneNumber | password  | passwordConfirmation | gender | role     |
    | Ayten Nihal       | Cengiz   | aytennihal1998@gmail.com | 05534304671 | 123456    | 123456               | Female | Employee |
    | Mustafa Alparslan | Cengiz   | mustafa@gmail.com        | 05534304672 | MAC123456 | MAC123456            | Male   | Employee |
    | Yeni              |   hey       | yenikisi                 | 12345678    | Yeni123   | 123                  | Female |   Admin       |