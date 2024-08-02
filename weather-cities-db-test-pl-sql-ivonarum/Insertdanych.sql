#dodanie danych pogodowych 

INSERT INTO Weather (WeatherID, CityID, Date, Temperature, Precipitation) VALUES
(21, 20, '2023-01-01', 5.5, 12.3),
(22, 20, '2023-01-01', 5.5, 12.3);

#dodanie danych o miastach 
INSERT INTO Cities (CityID, CityName, Country, Population) VALUES
(21, 'Warszawa', 'POLAND', 4000000),
(22, 'Lublin', 'POLAND', 800000);