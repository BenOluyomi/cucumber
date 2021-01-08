Feature: Search for Dress

Scenario: Search a dress
		Given Open the page
		When Search for Dress
		Then Printed summer dress will be shown
		
Scenario: Create a user
		Given Can enter email and rest of info
		When login details entered
		Then user can login