Feature:
	#ST-02 Verify that user is able to create new order
	@BRIT-1874 @Inventory @McLean @Tyson_03 @ChicagoDelivery @regression
	Scenario: ST-02 Verify that user is able to create new order
		Given the user goes to url
#		When the user clicks on BritErpDemo button
		When the "manager" enters valid email and password and going to inventory page
		And the user opens ChicagoDelivery page
		Then user should be able to create new order

