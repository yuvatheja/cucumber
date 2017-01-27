Feature: this is dummy feature file

@Web
Scenario: this is my first scenario
	Given I am on njit webpage
	When I navigate to About
	Then Check for page title About

@Server	
Scenario: this is my second scenario
	Given I am on njit webpage
	When I navigate to Admissions
	Then Check for page title Admissions
	
