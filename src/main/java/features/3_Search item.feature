Feature: Search item
Scenario Outline: Searching item from Shopping cart
	
@SearchItemPositive
Scenario: Searching item for Positive
	Given user launches shopping application 
	When user clicks on SearchTextbox <Search>
	And user clicks on Search
	And user clicks HomeIcon
		
	Examples:
		| Search | 
		| Blouse |
		
		
@SearchItemNegative
Scenario: Searching item for Negative
	Given user launches shopping application 
	When user clicks on SearchTextbox <Search>
	And user clicks on Search
	And user clicks HomeIcon
		
	Examples:
		| Search   | 
		| Negative |