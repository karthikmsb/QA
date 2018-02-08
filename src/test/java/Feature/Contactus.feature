# new feature
# Tags: optional

    Feature: Contact Us Page
      As an end user
      I want a contact us page
      So that I can find out more about QAWorks exciting services!!


    @DataTable
      Scenario: Valid Submission


        Given I am on the QAWorks Site
        When I send the Data

                  |Field    | Values                                  |

                  | name    | j.Bloggs                                  |
                  | email   | j.Bloggs@qaworks.com                      |
                  | subject | test automation                     |
                  | message | please contact me I want to find out more |


         Then i able to send message





