Feature: Validate Booking API

  Scenario: Verify status code for GetBookingIds
    Given user set up request for "/booking"
    When user perform GET call
    Then verify status code is 200

  Scenario: Verify ping API is working
    Given user set up request for "/ping"
    When user perform GET call
    Then verify status code is 201

  Scenario: Verify create booking api
    Given user set up request for "/booking"
    When user set up header "Content-Type" to "application/json"
    And user set body "create_booking_payload.json" as a string
    When user perform POST call
    Then verify status code is 200
    And verify response body has same data as request

  Scenario: Verify create booking api using Pojo
    Given user set up request for "/booking"
    When user set up header "Content-Type" to "application/json"
    And user set body "create_booking_payload.json" using pojo
    When user perform POST call
    Then verify status code is 200
    And verify response body has same data as request







