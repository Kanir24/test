Feature: Remove item
	
@RemoveItem
Scenario: Removing item inside Shopping cart
	Given user launches shopping application 
	When user navigates to Cart
	And user clicks Checkout
	And user clicks DeleteIcon
	And user clicks HomeIcon