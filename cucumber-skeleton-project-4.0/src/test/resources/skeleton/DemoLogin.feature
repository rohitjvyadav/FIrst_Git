Feature: DemoWorkShop
Using DemoWorkShop Application
Scenario Outline: Testing Multiple Login
Given User is on TDemoWorkShop Login page
When the user provides "<login>" and "<password>" 
Then the relevant login username is displayed

Examples:
|login|password|
|rohitjvyadav123@gmail.com|rohit@786|
|rohitjvyadav1234@gmail.com|rohit@787|
|rohitjvyadav12345@gmail.com|rohit@788|
|rohitjvyadav123456@gmail.com|rohit@789|
|rohitjvyadav1234567@gmail.com|rohit@790|
