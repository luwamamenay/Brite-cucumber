Feature:
	#Verify that "Scheduled Date" and "Source Document" is visible
	@BRIT-1890 @Inventory @McLean @Tyson_03 @ChicagoDelivery @regression
	Scenario: ST-05 Verify that user is able to see Scheduled Date
		Given the user goes to url
#		When the user clicks on BritErpDemo button
		When the "manager" enters valid email and password and going to inventory page
		And the user opens ChicagoDelivery page
		Then user should be able to see Scheduled Date
