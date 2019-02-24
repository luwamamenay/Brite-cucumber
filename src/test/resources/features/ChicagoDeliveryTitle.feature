Feature:
	#Verify that Shipping Policy items are exist
	@BRIT-1882 @Inventory @McLean @Tyson_03 @ChicagoDelivery @regression
	Scenario: ST-03 Verify that title shows "Chicago Warehouse: Delivery Orders - Odoo"
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the "manager" enters valid email and password and going to inventory page
		And the user opens ChicagoDelivery page
		Then Title should be Chicago Warehouse: Delivery Orders - Odoo

