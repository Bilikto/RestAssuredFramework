package com.automation.pojo;

import com.automation.practice.pojo.CreateBookingPojo;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateBookingResponsePojo {
    private String bookingid;
    private CreateBookingRequestPojo booking;
}
