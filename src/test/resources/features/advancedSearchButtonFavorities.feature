Feature:

	Background:
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the “manager” enters valid email and password and going to inventory page


	@BRIT-1259 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: Testing search button group by functionality
		And the manager clicks Inventory Advanced Filter Search button
		And the manager clicks Inventory Advanced Filter Gruop By button
		Then the manager should be able to click the inventory Advanced Filter Group By button


	@BRIT-1262 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: I should be able to click favourites on search function
		And the manager clicks Inventory Advanced Filter Search button
		Then the manager clicks Inventory Advanced Filter Favorites button

	@BRIT-1264 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: I should be able to save the searched inventory
		And the manager clicks Inventory Advanced Filter Search button
		And the manager clicks Inventory Advanced Filter Favorites button
		And the manager clicks Save Current Search button
		Then the manager should be able to click the Save Current Search button


	@BRIT-1265 @InventoryManager @McLean @Tyson_03 @InventorySearch
	Scenario: I should be able to add my dashboard the searched inventory
		And the manager clicks Inventory Advanced Filter Search button
		And the manager clicks Inventory Advanced Filter Favorites button
		And the manager clicks Add To My Dashboad button
		Then the manager should be able to click the Add To My Dashboad button