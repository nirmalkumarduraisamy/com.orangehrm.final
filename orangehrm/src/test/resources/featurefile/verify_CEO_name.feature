@getceoname
Feature:this is feature to get ceo name the orange hrm
Scenario outline:the test is veryfy the ceo
 Given the user can loged successfully
 When the user clicks on directory  optiopn on home page 
 And the user is select the job title of CEO FROM drop down\
 And click the search button
 Then the user see the CEO of the company "<CEO_name>"

