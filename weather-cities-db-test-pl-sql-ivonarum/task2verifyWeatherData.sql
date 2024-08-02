#Weryfikacja danych pogodowych w odniesieniu do miasta
SELECT * FROM weather;

SELECT * FROM weather w left join cities c on w.cityid = c.cityid
where w.cityid is null or c.cityname is null;