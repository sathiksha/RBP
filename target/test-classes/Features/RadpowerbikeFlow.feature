@Radpowerbike
Feature: This feature is to test Radpowerflow 

@Config-builditself
Scenario: build it your self-conf
    When user clicking on Ebike option in mainmenu
    And  Selecting on any ebike and scroll down the page
    Then clicking on Shopnow and Buynow button then click on SkipStep Button
    Then select on ebike color and click on Nextbutton
    When user Select Free delivery optoin and clicking on Buy now button
    And  increasing product quanity Then verify the quanity "2 Items"
    And  clicks on being checkout and check out 
    
    
@StartbaseWithAccessory
Scenario: Star with base model added with accessories
     When user clicking on Ebikelink and selecting on anybike 
     And Clicking on Shopnow and CustomizerMyOwn and Clicking on StarwithBase model 
     Then Clicking on NextStep and select accessories and clicking on Additems
     And Clicking on Finshbutton and selectDeliveryOptions
     Then Entering postal code and clicks on viewOption
     And Select delivery options and clicks on AddToCart button
     And clicks on checkout and Enter information and clicks on countine shipping
