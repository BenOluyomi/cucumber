Feature: Search on Google

Scenario: Search for Kittens
		Given I can open Google
		When I search for kittens
		Then Google will give me Kittens