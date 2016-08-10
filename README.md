# json

Author: Burak Tiftik

Uses Java 1.8

Assumption: CSV header is mandatory
Assumption: If the JSON query returns empty set the CSV file should be empty just containing the header


Usage: java -jar GoEuroTest.jar "CITY_NAME"

The CSV file has the format CITY_NAMEResult

example: java -jar GoEuroTest.jar berlin
result: berlinResult.csv


Test classes in test folder