package com.automation.practice.pojo;

import com.automation.utils.HelperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.sl.In;

public class ReadingDataUsingPojo {

    public static void main(String[] args) throws JsonProcessingException {
        // convert json to pojo class
        ObjectMapper om = new ObjectMapper();
        String json1 = HelperUtils.readDataFromFile("src/test/resources/json/create_booking_payload.json");
        String json2 = HelperUtils.readDataFromFile("src/test/resources/json/create_booking_response.json");
        CreateBookingPojo bookingPojoRequest = om.readValue(json1, CreateBookingPojo.class);
        CreateBookingPojo bookingPojoResponse = om.readValue(json2, CreateBookingPojo.class);

        System.out.println(bookingPojoRequest.equals(bookingPojoResponse));

//        System.out.println(bookingPojo.bookingdates.getCheckin());
//        System.out.println(bookingPojo.getFirstname());
//        System.out.println(bookingPojo.getLastname());
//
//        bookingPojo.setFirstname("David");
//        bookingPojo.setLastname("Bekham");
//        System.out.println(bookingPojo.getFirstname());
//        System.out.println(bookingPojo.getLastname());
    }
}

//In the POJO classes all fields must match with json fields!!! Otherwise, it won't work!

// JSON data for POJO classes in the create_booking_payload.json file:
//{
//        "firstname" : "Billy",
//        "lastname" : "Dashiev",
//        "totalprice" : 111,
//        "depositpaid" : true,
//        "bookingdates" : {
//        "checkin" : "2018-01-01",
//        "checkout" : "2019-01-01"
//        },
//        "additionalneeds" : "Breakfast"
//}