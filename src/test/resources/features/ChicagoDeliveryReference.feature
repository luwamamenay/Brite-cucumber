Feature:
	#SR-01 Verify that system title displays "Chicago Warehouse: Delivery Orders - Odoo"
	@BRIT-1865 @Inventory @McLean @Tyson_03 @ChicagoDelivery
	Scenario: SR-01 Verify that user is able to see Reference
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the "manager" enters valid email and password and going to inventory page
		And the user opens ChicagoDelivery page
		Then user should be able to see Reference
