#Przeprowadź symulację aktualizacji bazy danych, dodając nowe miasto do tabeli Cities
# i wstawiając odpowiednie dane pogodowe dla tego miasta do tabeli Weather. 
#Sprawdź, czy nowe wpisy nie zakłócają istniejących zapytań pobierających 5 miast z najwyższymi średnimi temperaturami.

#dodanie danych o miastach 
INSERT INTO Cities (CityID, CityName, Country, Population) VALUES
(23, 'Wroclaw', 'POLAND', 300000);

#dodanie danych pogodowych 
INSERT INTO Weather (WeatherID, CityID, Date, Temperature, Precipitation) VALUES
(23, 23, '2023-04-04', 18.5, 5.3);

SELECT c.cityname, w.temperature FROM cities c join weather w on c.cityid = w.cityid
order by w.temperature desc
limit 5;

