Feature: Test Background Feature DemoWorkshop 
 Background: 
    Given john launched chrome browser
    And provided demowebshop site url 

  Scenario: login to demo webshop
    When he clicks on login   
    Then he shall be able to provide credentials id="rohitjvyadav@gmail.com" password="rohitjvyadav@786"

  Scenario: registering to demo webshop
    When he clicks on register link
    Then he shall be able to provide registration details 

  Scenario: wishlist in demo webshop
    When he clicks on wishlist
    Then he shall be able to view his wishlist