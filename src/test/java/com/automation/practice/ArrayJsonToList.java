package com.automation.practice;

import io.restassured.common.mapper.TypeRef;

public class ArrayJsonToList {

//    Example:
//    [
//        {
//        "Home": 10,
//        "Street": "Deptford Dr"
//        },
//        {
//        "Home": 12,
//        "Street": "Deptford Cir"
//        }
//    ]


    /*  1. Create a POJO class ex: Address
        2. Convert response as --> (new TypeRef<List<Address>>() {});
        3. Save the response to an array --> List<Address> addresses = ...
    */

//    List<Address> addresses = response.as(new TypeRef<List<Address>>() {});
//    addresses.get(0).getHome();
//    addresses.get(1).getHome();


//    Note! "new TypeRef" is an abstract class and is coming from RestAssured itself!!!


}
