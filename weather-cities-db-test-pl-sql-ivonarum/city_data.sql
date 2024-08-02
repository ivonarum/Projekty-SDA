use pogodatasks;
CREATE TABLE IF NOT EXISTS Cities (
    CityID INTEGER PRIMARY KEY,
    CityName VARCHAR(100),
    Country VARCHAR(100),
    Population INTEGER
);

INSERT INTO Cities (CityID, CityName, Country, Population) VALUES
(1, 'New York', 'USA', 8419000),
(2, 'Los Angeles', 'USA', 3980400),
(3, 'Chicago', 'USA', 2706000),
(4, 'Houston', 'USA', 2325500),
(5, 'Phoenix', 'USA', 1680800),
(6, 'Philadelphia', 'USA', 1584200),
(7, 'San Antonio', 'USA', 1541200),
(8, 'San Diego', 'USA', 1423800),
(9, 'Dallas', 'USA', 1347900),
(10, 'San Jose', 'USA', 1026900),
(11, 'London', 'UK', 8982000),
(12, 'Birmingham', 'UK', 1141810),
(13, 'Leeds', 'UK', 789194),
(14, 'Glasgow', 'UK', 626410),
(15, 'Sheffield', 'UK', 584853),
(16, 'Bradford', 'UK', 536986),
(17, 'Liverpool', 'UK', 496784),
(18, 'Edinburgh', 'UK', 482005),
(19, 'Manchester', 'UK', 547627),
(20, 'Bristol', 'UK', 467099);
