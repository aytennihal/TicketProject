@userCreate

Feature: Create New User


Background:
    Given user on user create page

Scenario Outline: User can create new user with valid credentials on User List

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
    | Ayten Nihal       | Cengiz   | aytennihal1998@gmail.com | 5534304671 | Ayten1998.    | Ayten1998.               | Female | Employee |
    | Mustafa Alparslan | Cengiz   | mustafa@gmail.com        | 5534304672 | MAC123456. | MAC123456.           | Male   | Employee |
    | Yeni              |   hey       | yenikisi@gmail.com    | 1234567816  | Yeni123.   | Yeni123.             | Female |   Admin       |



  Scenario Outline: User can not create new user with invalid credentials
    When user enter invalid "<emailName>" to the Email Adress
    Then user should see "Please enter email." error message under mail box
    When user enter invalid "<phoneNumber>" to  the Phone Number
    Then user should see "Please enter 10 digit mobile number." under Phone Number box

    Examples:

    |emailName     | phoneNumber |
    |aytennihal       | 12345689     |
    |mustafa          |782789472     |


Scenario Outline: User can delete any user on User List
  And user enter "<firstName>" to the First Name
  And user enter "<lastName>" to the Last Name
  And user enter "<emailAddress>" to the Email Adress
  And user enter "<phoneNumber>" to the Phone Number
  And user enter "<password>" to the Password
  And user enter "<passwordConfirmation>" to the Password Confirmation
  And user select a "<gender>"
  And user select "<role>"
  And user click "Save"
  When user click delete button next to user "mustafa@gmail.com"
  Then user should not see "mustafa@gmail.com" in user list anymore

  Examples:

    | firstName         | lastName | emailAddress             | phoneNumber | password  | passwordConfirmation | gender | role     |
    | Ayten Nihal       | Cengiz   | aytennihal1998@gmail.com | 5534304671 | Ayten1998.    | Ayten1998.               | Female | Employee |
    | Mustafa Alparslan | Cengiz   | mustafa@gmail.com        | 5534304672 | Mac123456. | Mac123456.           | Male   | Employee |
    | Yeni              |   hey       | yenikisi@gmail.com    | 1234567816  | Yeni123.   | Yeni123.             | Female |   Admin       |
