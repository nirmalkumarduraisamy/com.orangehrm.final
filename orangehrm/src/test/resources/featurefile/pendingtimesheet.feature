@Timesheet
Feature:this is timesheet pending status
Scenario outline:the test is verify pending status
 Given the user can on home page
 And the user clicks on directory  optiopn ooption from menu
 And the user is select the name is nirmal
 And click the search button
 Then the user see the CEO of the company "<message>"
