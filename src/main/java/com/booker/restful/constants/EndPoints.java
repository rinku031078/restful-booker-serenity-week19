package com.booker.restful.constants;

/**
 * @author Anand Tripathi
 * @project Restful-Booker-Serenity
 * @created 10/01/2022
 */
public class EndPoints {


    /**
     * This is Endpoints of BOOKINGS
     */
    public static final String CREATE_BOOKING = "/booking";
    public static final String GET_SINGLE_BOOKING_BY_ID = "/{bookingID}";
    public static final String UPDATE_BOOKING_BY_ID = "/{bookingID}";
    public static final String DELETE_BOOKING_BY_ID = "/{bookingID}";
    public static final String GET_ALL_BOOKINGS_BY_NAME = "?firstname=";

}
