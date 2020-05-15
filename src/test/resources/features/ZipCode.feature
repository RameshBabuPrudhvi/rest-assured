@zip
Feature: ZipCode Test

  Scenario: User calls web service to get zipcodes and places
    Given Request ZipCodes and places
      | CountryCode | ZipCode | Location      |
      | us          | 90210   | Beverly Hills |
      | us          | 12345   | Schenectady   |
      | ca          | B2R     | Waverley      |