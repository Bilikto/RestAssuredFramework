package com.automation.practice.gson;

import com.automation.utils.HelperUtils;
import com.google.gson.*;

public class ParsingJsonUsingGson {
    public static void main(String[] args) {
        //        There are 2 most used methods:
//        .getAsJsonObject();
//        .getAsJsonArray();

//       And 3 classes:
//        JsonElement, JsonObject, JsonArray

        // JsonElement
        String content = HelperUtils.readDataFromFile("src/test/resources/json/create_booking_response.json");
        JsonElement element = JsonParser.parseString(content);

        // JsonObject
        JsonObject object = element.getAsJsonObject();
        System.out.println(object.toString());
        System.out.println(object.get("bookingid"));

        JsonObject object2 = object.get("booking").getAsJsonObject();
        System.out.println(object2.get("totalprice"));


        // JsonArray
        String content1 = HelperUtils.readDataFromFile("src/test/resources/json/json_array_demo_.json");
        element = JsonParser.parseString(content1);
        object = element.getAsJsonObject();
        JsonArray bookArray = object.get("book").getAsJsonArray();
        System.out.println(bookArray);
//        System.out.println(bookArray.get(0).getAsJsonObject().get("title"));

        for(int i = 0; i < bookArray.size(); i++) {
            System.out.println(bookArray.get(i).getAsJsonObject().get("title"));
        }

    }
}

// The structure of the json data
//{
//        "bookingid": 3566,
//        "booking": {
//        "firstname": "Billy",
//        "lastname": "Dashiev",
//        "totalprice": 111,
//        "depositpaid": true,
//        "bookingdates": {
//        "checkin": "2018-01-01",
//        "checkout": "2019-01-01"
//        },
//        "additionalneeds": "Breakfast"
//        }
//}