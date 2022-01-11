package com.booker.restful.testbase;

import com.booker.restful.constants.Path;
import com.booker.restful.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * @author Anand Tripathi
 * @project Restful-Booker-Serenity
 * @created 10/01/2022
 */
public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void initialize(){
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");

        RestAssured.basePath = Path.BOOKING;
    }
}
