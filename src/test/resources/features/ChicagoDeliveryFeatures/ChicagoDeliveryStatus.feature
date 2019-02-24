Feature:
	@BRIT-1908 @Inventory @McLean @Tyson_03 @ChicagoDelivery @regression
	Scenario: ST-10 Verify that user is able to see Status
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the "manager" enters valid email and password and going to inventory page
		And the user opens ChicagoDelivery page
		Then user should be able to see Status

