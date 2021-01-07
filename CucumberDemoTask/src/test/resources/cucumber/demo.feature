Feature: Create a user and login

Scenario: Create a user
		Given Open the create page
		When Input information
		Then A user will be created
		
Scenario: Log in
		Given The login page opens
		When Input information
		Then A user will be logged in