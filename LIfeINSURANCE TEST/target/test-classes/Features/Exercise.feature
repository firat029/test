Feature: Exercise Value Validation

Background:
Given User get that url "http://dummy.restapiexample.com/api/v1/employees"
When User see screen as successfully open

@screenValue
Scenario: verify the right count of values on screen 
Then user should see there are five values

@screenValue_0
Scenario: verify the right count of values greater than O
Then user should see values are more than 0


@total_Balance
Scenario: verify the totalBalance equal to sum of values 
Then user should see total balance equal to sum of values 

@currencies_Validation
Scenario: verify the currencies of values 
Then user should see all value is in correct currencies