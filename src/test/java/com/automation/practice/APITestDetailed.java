package com.automation.practice;

import com.automation.utils.RestAssuredUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITestDetailed {
    public static void main(String[] args) {
        String body = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

//        String baseUrl = "https://restful-booker.herokuapp.com";

//        RestAssured has its own constant .baseUrl
        RestAssured.baseURI = "https://restful-booker.herokuapp.com"; //Only we have to set one time
        String endPoint = "/auth";

        //reqSpec is empty box which we are filling with request components
        RequestSpecification reqSpec = RestAssured.given();

        //put body into RequestSpecification
        reqSpec = reqSpec.body(body).cookie("key", "value");

        //put headers into RequestSpecification
        reqSpec = reqSpec.header("Content-Type", "application/json");
        reqSpec = reqSpec.header("Accept", "application/json"); // instead it we can use HashMap

        Response response = reqSpec.when().post(endPoint);
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

    }

}
