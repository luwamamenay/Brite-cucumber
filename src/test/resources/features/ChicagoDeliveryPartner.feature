Feature:
	#Verify that Priority options are exist
	@BRIT-1889 @Inventory @McLean @Tyson_03 @ChicagoDelivery
	Scenario: St-04 Verify that user is able to see Partner
		Given the user goes to url
		When the user clicks on BritErpDemo button
		When the "manager" enters valid email and password and going to inventory page
		And the user opens ChicagoDelivery page
		Then user should be able to see Partner