Feature: 

	Background:
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the “manager” enters valid email and password and going to inventory page


	@BRIT-1256 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: Testing search function advanced filter button is clickable
	And the manager clicks Inventory Advanced Search button
	Then the manager should be able to click the advanced search button


	@BRIT-2552 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: I should be to select archived button on search function
	And the manager clicks Inventory Advanced Filter Search button
	And the manager clicks Inventory Advanced Filter Favorites button
	And the manager clicks Archived Search button
	Then the manager should be able to click the Archived Search button


	@BRIT-1261 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: Testing add custom group the search functionality
	And the manager clicks Inventory Advanced Filter Search button
	And the manager clicks Inventory Advanced Filter Group By button
	And the manager clicks Inventory Advance Filter Add Custom Group button
	Then the manager should be able to click the inventory Advanced Filter Add Custom Group button