$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userCreate.feature");
formatter.feature({
  "name": "Create New User",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@userCreate"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User can create new user on User List",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enter \"\u003cfirstName\u003e\" to the First Name",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003clastName\u003e\" to the Last Name",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cemailAddress\u003e\" to the Email Adress",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cphoneNumber\u003e\" to the Phone Number",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cpassword\u003e\" to the Password",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cpasswordConfirmation\u003e\" to the Password Confirmation",
  "keyword": "And "
});
formatter.step({
  "name": "user select a \"\u003cgender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select \"\u003crole\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click \"Save\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should be able to see new user with \"\u003cemailadress\u003e\" under the User List",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "emailAddress",
        "phoneNumber",
        "password",
        "passwordConfirmation",
        "gender",
        "role"
      ]
    },
    {
      "cells": [
        "Ayten Nihal",
        "Cengiz",
        "aytennihal1998@gmail.com",
        "05534304671",
        "123456",
        "123456",
        "FEMALE",
        "employee"
      ]
    },
    {
      "cells": [
        "Mustafa Alparslan",
        "Cengiz",
        "mustafa@gmail.com",
        "05534304672",
        "MAC123456",
        "MAC123456",
        "MALE",
        "employee"
      ]
    },
    {
      "cells": [
        "Yeni",
        "",
        "yenikisi",
        "12345678",
        "Yeni123",
        "123",
        "FEMALE",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "    Given: user on user create page",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "User can create new user on User List",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userCreate"
    }
  ]
});
formatter.step({
  "name": "user enter \"Ayten Nihal\" to the First Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheFirstName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Cengiz\" to the Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheLastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"aytennihal1998@gmail.com\" to the Email Adress",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheEmailAdress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"05534304671\" to the Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePhoneNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"123456\" to the Password",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"123456\" to the Password Confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePasswordConfirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select a \"FEMALE\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userSelectA(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userSelect(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userClick(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see new user with \"\u003cemailadress\u003e\" under the User List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userShouldBeAbleToSeeNewUserWithUnderTheUserList(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "    Given: user on user create page",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "User can create new user on User List",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userCreate"
    }
  ]
});
formatter.step({
  "name": "user enter \"Mustafa Alparslan\" to the First Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheFirstName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Cengiz\" to the Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheLastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"mustafa@gmail.com\" to the Email Adress",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheEmailAdress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"05534304672\" to the Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePhoneNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"MAC123456\" to the Password",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"MAC123456\" to the Password Confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePasswordConfirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select a \"MALE\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userSelectA(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"employee\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userSelect(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userClick(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see new user with \"\u003cemailadress\u003e\" under the User List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userShouldBeAbleToSeeNewUserWithUnderTheUserList(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "    Given: user on user create page",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "User can create new user on User List",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userCreate"
    }
  ]
});
formatter.step({
  "name": "user enter \"Yeni\" to the First Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheFirstName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"\" to the Last Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheLastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"yenikisi\" to the Email Adress",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToTheEmailAdress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"12345678\" to the Phone Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePhoneNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Yeni123\" to the Password",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"123\" to the Password Confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userEnterToThePasswordConfirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select a \"FEMALE\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userSelectA(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userSelect(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userClick(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see new user with \"\u003cemailadress\u003e\" under the User List",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ticketProject.step_definitions.UserListStepDefs.userShouldBeAbleToSeeNewUserWithUnderTheUserList(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});