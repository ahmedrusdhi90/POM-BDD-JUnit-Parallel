Feature: purchase page feature

Scenario: place order page title
Given user is on place order page
When user get the title of the page
Then place page title should be "STORE"


Scenario: place order with data
Given user is on place order page
When user click on place order
Then user enters name "Mr.Tester"
And user enters country "USA" and city "TX"
And user enters credit card "023198765432"
And user enters month "11" and year "2022"
And user clicks on purchase button
Then user gets text of the purchase page

