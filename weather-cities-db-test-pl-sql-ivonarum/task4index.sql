#zapytanie używane do wyszukiwania miasta o najwyższych średnich temperaturach. 
#Zaproponuj i zaimplementuj strategie indeksowania, które skracają czas wykonania zapytania bez zmiany jego wyniku.

#Explain
SELECT 
    cityname, MAX(Temperature) as maksTemp
FROM
    cities c
        JOIN
    weather w ON c.cityid = w.cityid
GROUP BY cityname
order by maksTemp desc
limit 1;

#indeks dla kolumn cityid oraz temperature
create index idx_city_id_cities on cities(CityID);
create index idx_temp on weather(Temperature); #tego indeksu komputer nie wykorzysta i on nie pokazuje sie