package com.techyworks.steps;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.github.selcukes.core.logging.Logger;
import io.github.selcukes.core.logging.LoggerFactory;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ZipCodeSteps {
    Logger logger = LoggerFactory.getLogger(ZipCodeSteps.class);


    @DataTableType
    public TestData testDataEntry(Map<String, String> entry) {
        return new TestData(
                entry.get("CountryCode"),
                entry.get("ZipCode"),
                entry.get("Location"));
    }

    @Given("Request ZipCodes and places")
    public void requestZipCodesAndPlaces(List<TestData> tableData) {
        for (TestData rowData : tableData) {
            logger.info(rowData::toString);
            given().
                    pathParam("countryCode", rowData.countryCode).pathParam("zipCode", rowData.zipCode).
                    when().
                    get("http://zippopotam.us/{countryCode}/{zipCode}").
                    then().
                    assertThat().
                    body("places[0].'place name'", equalTo(rowData.expectedPlaceName));
        }


    }
}
