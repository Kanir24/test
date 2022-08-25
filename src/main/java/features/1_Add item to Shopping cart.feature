Feature: Add item
Background:	
	Given user launches shopping application
	
@AddItem
Scenario: Adding item to Shopping cart 
	When user selects the Item <Item>
	And user adds quantity <Quantity>, selects size <Size> and picks color <Color>
	And user clicks AddtoCart
	And user clicks ContinueShop
	And user clicks HomeIcon
	
	
	Examples:
		| Item  | Quantity | Size  | Color |
		| Item1 | 2        | Size1 | I1C1  |