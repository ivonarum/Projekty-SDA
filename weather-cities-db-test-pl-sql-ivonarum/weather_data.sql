use pogodatasks;
CREATE TABLE IF NOT EXISTS Weather (
    WeatherID INTEGER PRIMARY KEY,
    CityID INTEGER,
    Date DATE,
    Temperature DECIMAL(5,2),
    Precipitation DECIMAL(5,2),
    FOREIGN KEY (CityID) REFERENCES Cities (CityID)
);

INSERT INTO Weather (WeatherID, CityID, Date, Temperature, Precipitation) VALUES
(1, 1, '2023-01-01', 5.5, 12.3),
(2, 2, '2023-01-02', 13.9, 5.1),
(3, 3, '2023-01-03', -1.1, 0.0),
(4, 4, '2023-01-04', 8.2, 25.4),
(5, 5, '2023-01-05', 21.1, 0.0),
(6, 6, '2023-01-06', 2.8, 1.2),
(7, 7, '2023-01-07', 14.4, 0.0),
(8, 8, '2023-01-08', 17.6, 0.0),
(9, 9, '2023-01-09', 9.0, 10.2),
(10, 10, '2023-01-10', 18.3, 0.0),
(11, 11, '2023-01-11', 7.2, 2.3),
(12, 12, '2023-01-12', 4.6, 12.0),
(13, 13, '2023-01-13', 3.3, 8.5),
(14, 14, '2023-01-14', 0.0, 15.6),
(15, 15, '2023-01-15', -2.2, 1.0),
(16, 16, '2023-01-16', 10.5, 0.0),
(17, 17, '2023-01-17', 12.7, 0.0),
(18, 18, '2023-01-18', 5.5, 0.0),
(19, 19, '2023-01-19', 8.8, 0.0),
(20, 20, '2023-01-20', 6.1, 5.0);


