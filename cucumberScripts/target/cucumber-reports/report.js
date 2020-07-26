$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "line": 4,
  "name": "Facebook sign up feature",
  "description": "",
  "id": "facebook-sign-up-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4574092500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "facebook sign up validation",
  "description": "",
  "id": "facebook-sign-up-feature;facebook-sign-up-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user can enter the firstName \"Mike\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user can enter the last name \"Scott\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user can enter the email \"mics@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_facebook_sign_up_page()"
});
formatter.result({
  "duration": 3931986200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mike",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_can_enter_the_firstName(String)"
});
formatter.result({
  "duration": 1530737600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Scott",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_can_enter_the_last_name(String)"
});
formatter.result({
  "duration": 1114527000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mics@gmail.com",
      "offset": 26
    }
  ],
  "location": "stepDefinition.user_can_enter_the_email(String)"
});
formatter.result({
  "duration": 1185015700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 33600,
  "status": "passed"
});
formatter.after({
  "duration": 936855900,
  "status": "passed"
});
formatter.uri("facebookData.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook sign up feature testing",
  "description": "",
  "id": "facebook-sign-up-feature-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "facebook sign up validation with multiple sets of data",
  "description": "",
  "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user can enter the firstname \"\u003cfirstName\u003e\" in facebook",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user can enter the lastname \"\u003clastname\u003e\" in facebook",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can enter the email \"\u003cemail\u003e\" in facebook",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be able to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastname",
        "email"
      ],
      "line": 13,
      "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;1"
    },
    {
      "cells": [
        "Michael",
        "Scott",
        "sm@test.com"
      ],
      "line": 14,
      "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;2"
    },
    {
      "cells": [
        "Bob",
        "ward",
        "ward@test.com"
      ],
      "line": 15,
      "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;3"
    },
    {
      "cells": [
        "Mike",
        "vans",
        "mike@test.com"
      ],
      "line": 16,
      "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;4"
    },
    {
      "cells": [
        "test1",
        "tst1",
        "sm@test.com"
      ],
      "line": 17,
      "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3107655300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "facebook sign up validation with multiple sets of data",
  "description": "",
  "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user can enter the firstname \"Michael\" in facebook",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user can enter the lastname \"Scott\" in facebook",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can enter the email \"sm@test.com\" in facebook",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be able to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_facebook_sign_up_page()"
});
formatter.result({
  "duration": 3685986700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Michael",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_can_enter_the_firstname_in_facebook(String)"
});
formatter.result({
  "duration": 1812385400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Scott",
      "offset": 29
    }
  ],
  "location": "stepDefinition.user_can_enter_the_lastname_in_facebook(String)"
});
formatter.result({
  "duration": 1135476500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sm@test.com",
      "offset": 26
    }
  ],
  "location": "stepDefinition.user_can_enter_the_email_in_facebook(String)"
});
formatter.result({
  "duration": 1177564300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 24300,
  "status": "passed"
});
formatter.after({
  "duration": 1418427100,
  "status": "passed"
});
formatter.before({
  "duration": 3162582300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "facebook sign up validation with multiple sets of data",
  "description": "",
  "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user can enter the firstname \"Bob\" in facebook",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user can enter the lastname \"ward\" in facebook",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can enter the email \"ward@test.com\" in facebook",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be able to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_facebook_sign_up_page()"
});
formatter.result({
  "duration": 3800136200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_can_enter_the_firstname_in_facebook(String)"
});
formatter.result({
  "duration": 1365333800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ward",
      "offset": 29
    }
  ],
  "location": "stepDefinition.user_can_enter_the_lastname_in_facebook(String)"
});
formatter.result({
  "duration": 1097319300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ward@test.com",
      "offset": 26
    }
  ],
  "location": "stepDefinition.user_can_enter_the_email_in_facebook(String)"
});
formatter.result({
  "duration": 1160626700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 23900,
  "status": "passed"
});
formatter.after({
  "duration": 842561800,
  "status": "passed"
});
formatter.before({
  "duration": 3125933800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "facebook sign up validation with multiple sets of data",
  "description": "",
  "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user can enter the firstname \"Mike\" in facebook",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user can enter the lastname \"vans\" in facebook",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can enter the email \"mike@test.com\" in facebook",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be able to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_facebook_sign_up_page()"
});
formatter.result({
  "duration": 3763061100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mike",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_can_enter_the_firstname_in_facebook(String)"
});
formatter.result({
  "duration": 1506815300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vans",
      "offset": 29
    }
  ],
  "location": "stepDefinition.user_can_enter_the_lastname_in_facebook(String)"
});
formatter.result({
  "duration": 1116043600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mike@test.com",
      "offset": 26
    }
  ],
  "location": "stepDefinition.user_can_enter_the_email_in_facebook(String)"
});
formatter.result({
  "duration": 1166880900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 24500,
  "status": "passed"
});
formatter.after({
  "duration": 859948100,
  "status": "passed"
});
formatter.before({
  "duration": 3172600400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "facebook sign up validation with multiple sets of data",
  "description": "",
  "id": "facebook-sign-up-feature-testing;facebook-sign-up-validation-with-multiple-sets-of-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user can enter the firstname \"test1\" in facebook",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user can enter the lastname \"tst1\" in facebook",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user can enter the email \"sm@test.com\" in facebook",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be able to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_facebook_sign_up_page()"
});
formatter.result({
  "duration": 3669482200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 30
    }
  ],
  "location": "stepDefinition.user_can_enter_the_firstname_in_facebook(String)"
});
formatter.result({
  "duration": 1561234700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tst1",
      "offset": 29
    }
  ],
  "location": "stepDefinition.user_can_enter_the_lastname_in_facebook(String)"
});
formatter.result({
  "duration": 1114767300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sm@test.com",
      "offset": 26
    }
  ],
  "location": "stepDefinition.user_can_enter_the_email_in_facebook(String)"
});
formatter.result({
  "duration": 1167892300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 20900,
  "status": "passed"
});
formatter.after({
  "duration": 777131800,
  "status": "passed"
});
formatter.uri("yahoosignup.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: anik@agile1tech.com"
    }
  ],
  "line": 4,
  "name": "Yahoo sign up feature",
  "description": "",
  "id": "yahoo-sign-up-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3122815400,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 3060070700,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "yahoo sign up page url and title validation",
  "description": "",
  "id": "yahoo-sign-up-feature;yahoo-sign-up-page-url-and-title-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user can see the right title of the page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user can be in the right url",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user can start creating a new account",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_can_see_the_right_title_of_the_page()"
});
formatter.result({
  "duration": 450363600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_can_be_in_the_right_url()"
});
formatter.result({
  "duration": 50768000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_can_start_creating_a_new_account()"
});
formatter.result({
  "duration": 212300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "duration": 38200,
  "status": "passed"
});
formatter.after({
  "duration": 866515800,
  "status": "passed"
});
formatter.before({
  "duration": 3109767100,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on the yahoo sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_is_on_the_yahoo_sign_up_page()"
});
formatter.result({
  "duration": 3052036900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "yahoo sign up web elements validation",
  "description": "",
  "id": "yahoo-sign-up-feature;yahoo-sign-up-web-elements-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@smoke"
    },
    {
      "line": 19,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user should be see the firstname box visable and enabled",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user should have the lastname box visible and enabled",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should have the password box visible and enabled",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user should have the drop down menu for phone number",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user should have all the web elements require for sign up",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user should be able to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_should_be_see_the_firstname_box_visable_and_enabled()"
});
formatter.result({
  "duration": 518914200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_have_the_lastname_box_visible_and_enabled()"
});
formatter.result({
  "duration": 58928400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_have_the_password_box_visible_and_enabled()"
});
formatter.result({
  "duration": 39000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_should_have_the_drop_down_menu_for_phone_number()"
});
formatter.result({
  "duration": 658300,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003ctest[]\u003e but was:\u003ctest[fsfsd]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDef.stepDefinition.user_should_have_the_drop_down_menu_for_phone_number(stepDefinition.java:126)\r\n\tat ✽.And user should have the drop down menu for phone number(yahoosignup.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.user_should_have_all_the_web_elements_require_for_sign_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinition.user_should_be_able_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1611936400,
  "status": "passed"
});
});