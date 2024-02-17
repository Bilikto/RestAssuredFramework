package com.automation.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {

    public static void main(String[] args) {
        String body = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        String url = "https://restful-booker.herokuapp.com/auth";

        RestAssured.given()
                .body(body).cookie("key", "value")
                .header("Content-Type", "application/json")
                .baseUri(url).log().all()
                .when().post()
                .then().log().all().assertThat().statusCode(200);

//        RequestSpecification rs = RestAssured.given();
//                rs = rs.header("Content-Type", "application/json");
//                rs = rs.header("Accept", "application/json");
//                rs = rs.param("Key", "value");
//                rs = rs.queryParam("Key", "value");
//                rs = rs.body("");
//        Response response = rs.when().log().all().post("url");
//        response.getStatusCode();

    }


}
