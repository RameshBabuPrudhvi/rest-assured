package com.techyworks.steps;

public class TestData {
    String countryCode;
    String zipCode;
    String expectedPlaceName;

    public TestData(String countryCode, String zipCode, String expectedPlaceName) {
        this.countryCode = countryCode;
        this.zipCode = zipCode;
        this.expectedPlaceName = expectedPlaceName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getExpectedPlaceName() {
        return expectedPlaceName;
    }

    public void setExpectedPlaceName(String expectedPlaceName) {
        this.expectedPlaceName = expectedPlaceName;
    }

    @Override
    public String toString() {
        return String.format("CountryCode = %s ZipCode = %s Location = %s", this.countryCode, this.zipCode, this.expectedPlaceName);
    }

}
