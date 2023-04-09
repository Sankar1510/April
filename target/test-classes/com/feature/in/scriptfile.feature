
Feature:  Verifying the feature of hotel booking application ADACTIN
Scenario: Checking the login functionality using user name and password
Given     Application Launched Successfully
When      Enter the user name
And       Enter the user password
Then      User click the Login button
Scenario Outline: Checking the login functionality using user name and password
Given Application Launched Successfully
When user enter the "<username>"
And user enter the "<password>"
Then user click the Login button

Examples:
|username | password|
|Arasu | Sanka|
|Subash | rtdsx|
|Guru | hs45bgh|
|sankarArun | SANKAR|




Scenario: Checking the all functionality of search Hotel page
Given    Login successfully
When     User Enter the Location
And      User Enter the Hotels
And      User Enter the Room Type
And      User Enter the Number of Room
And      User Check in date
And      User Check out date
And      User Enter Adults per room
And      User Enter children per room
Then     User click the Search button
Scenario: Checking the select hotel
Given     Search successfully
When      User click the select button
Then      User click the Continue
Scenario: Checking the Book a hotel
Given     Continue successfully
When      User Enter the First Name
And       User Enter the Last Name
And       User Enter the Billing Address
And       User Enter the Credit Card 16 digit Numbers Fully
And       User Select the Credit Card Type
And       User Select the Expiry Date Month and Year
And       User Enter the CVV Number
Then      Click the Book Now button
Scenario: Checking the Booking Confirmation
Given     Book Now Successfully
Then      Click the My Itinerary button
Scenario: Checking the Booked Itinerary  
Given     My Itinerary Successfully
Then      Click Log out button
        

    
    

 
