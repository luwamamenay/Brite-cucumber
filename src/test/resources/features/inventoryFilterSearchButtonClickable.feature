Feature:

	Background:
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the “manager” enters valid email and password and going to inventory page



	@BRIT-1257 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: Testing filter button is  clickable  on inventory search functionality
		And the manager clicks Inventory Filter Search button
		Then the manager should be able to click the inventory filter search button

	@BRIT-2555 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: As a Manager I should be able to remove the items from searched archive
		And the manager clicks Inventory Advanced Filter Search button
		And the manager clicks Inventory Advanced Filter Favorites button
		And the manager clicks Archived Search button
		And the manager clicks Remove the Searched Items
		Then the manager should be able to click the Remove button