package com.automation.practice.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CreateBookingPojo {
    public String firstname;
    public String lastname;
    public int totalprice;
    public boolean depositpaid;
    public BookingDates bookingdates;
    public String additionalneeds;

//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public int getTotalprice() {
//        return totalprice;
//    }
//
//    public void setTotalprice(int totalprice) {
//        this.totalprice = totalprice;
//    }
//
//    public boolean isDepositpaid() {
//        return depositpaid;
//    }
//
//    public void setDepositpaid(boolean depositpaid) {
//        this.depositpaid = depositpaid;
//    }
//
//    public BookingDates getBookingdates() {
//        return bookingdates;
//    }
//
//    public void setBookingdates(BookingDates bookingdates) {
//        this.bookingdates = bookingdates;
//    }
//
//    public String getAdditionalneeds() {
//        return additionalneeds;
//    }
//
//    public void setAdditionalneeds(String additionalneeds) {
//        this.additionalneeds = additionalneeds;
//    }
}

