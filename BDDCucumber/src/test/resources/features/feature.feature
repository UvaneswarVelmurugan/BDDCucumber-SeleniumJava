Feature: MiniCaseStudy

Scenario: Login into App
Given User is on Launch Page1
When User Login
Then Should display Home Page

Scenario: Add items to cart
Given User is on Launch Page2
When Add an item to cart
 | cat | item |
 | Monitors | Apple monitor 24 |
 | Monitors | ASUS Full HD |
Then Items must be added to cart

Scenario: Delete an Item
Given User is on Launch Page3
When List of Items should be available in cart
Then Delete an item from Cart

Scenario: Place Order
Given User is on Launch Page4
When Items should be available in Cart
Then Purchase Items