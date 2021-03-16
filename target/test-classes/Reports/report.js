$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Datatable.feature");
formatter.feature({
  "name": "To validate the login functionality.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login with invalid crendentials.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid name and passsword",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java",
        "java@123"
      ]
    },
    {
      "cells": [
        "MadhanGovind",
        "Madhan@21"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "use click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.use_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter location and no of rooms and \"\u003ccheckin\u003e\" and \"\u003ccheckout\u003e\" and adults.",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_location_and_no_of_rooms_and_and_and_adults(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the available hotel by radiobutton and click continue.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_select_the_available_hotel_by_radiobutton_and_click_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003caddress\u003e\" and \"\u003ccreditcard\u003e\" and creditcardtype and ccexpirymonth and ccexpiryyear and \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_and_and_and_and_creditcardtype_and_ccexpirymonth_and_ccexpiryyear_and(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click book now.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_book_now()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "To validate the login functionality.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate login with invalid crendentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in facebook login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter invalid \"\u003cname\u003e\" and \"\u003cpasssword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "use click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user enter location and no of rooms and \"\u003ccheckin\u003e\" and \"\u003ccheckout\u003e\" and adults.",
  "keyword": "When "
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "name": "user select the available hotel by radiobutton and click continue.",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003caddress\u003e\" and \"\u003ccreditcard\u003e\" and creditcardtype and ccexpirymonth and ccexpiryyear and \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click book now.",
  "keyword": "And "
});
formatter.step({
  "name": "user check the order no print or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "passsword",
        "checkin",
        "checkout",
        "firstname",
        "lastname",
        "address",
        "creditcard",
        "cvv"
      ]
    },
    {
      "cells": [
        "MadhanGovind",
        "Madhan@21",
        "09/03/2021",
        "10/03/2021",
        "karthi",
        "g",
        "krishnagiri",
        "1234567891234567",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login with invalid crendentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid \"MadhanGovind\" and \"Madhan@21\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_invalid_and(String,String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.stepdefinition.Stepdefinition.user_enter_invalid_and(Stepdefinition.java:31)\r\n\tat ✽.user enter invalid \"MadhanGovind\" and \"Madhan@21\"(file:src/test/resources/Features/Login.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "use click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.use_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter location and no of rooms and \"09/03/2021\" and \"10/03/2021\" and adults.",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_location_and_no_of_rooms_and_and_and_adults(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the available hotel by radiobutton and click continue.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_select_the_available_hotel_by_radiobutton_and_click_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter \"karthi\" and \"g\" and \"krishnagiri\" and \"1234567891234567\" and creditcardtype and ccexpirymonth and ccexpiryyear and \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_enter_and_and_and_and_creditcardtype_and_ccexpirymonth_and_ccexpiryyear_and(String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click book now.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_book_now()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user check the order no print or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_check_the_order_no_print_or_not()"
});
formatter.result({
  "status": "skipped"
});
});