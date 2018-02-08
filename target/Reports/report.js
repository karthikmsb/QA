$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/Contactus.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 4,
  "name": "Contact Us Page",
  "description": "As an end user\nI want a contact us page\nSo that I can find out more about QAWorks exciting services!!",
  "id": "contact-us-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Valid Submission",
  "description": "",
  "id": "contact-us-page;valid-submission",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@DataTable"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on the QAWorks Site",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I send the Data",
  "rows": [
    {
      "cells": [
        "Field",
        "Values"
      ],
      "line": 17
    },
    {
      "cells": [
        "name",
        "j.Bloggs"
      ],
      "line": 19
    },
    {
      "cells": [
        "email",
        "j.Bloggs@qaworks.com"
      ],
      "line": 20
    },
    {
      "cells": [
        "subject",
        "test automation"
      ],
      "line": 21
    },
    {
      "cells": [
        "message",
        "please contact me I want to find out more"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "i able to send message",
  "keyword": "Then "
});
formatter.match({
  "location": "Contactusdef.i_am_on_the_QAWorks_Site()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});