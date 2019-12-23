Feature: DemoWorkShop
Using DemoWorkShop Application
Scenario Outline: Testing Login
Given User is on DemoWorkShop Login page
When I provide "<login>" and "<password>" 
Then the login username is properly displayed

Examples:
		|login|password|
		|karthik456@gmail.com|karthik456|
