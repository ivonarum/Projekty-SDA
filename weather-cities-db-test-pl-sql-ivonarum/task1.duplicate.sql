use pogodatasks;
SELECT * FROM cities;

SELECT cityname, country FROM cities;

select cityname, country, count(*) from cities
group by cityname, country;

select cityname, country, count(*) as duplicateRows from cities
group by cityname, country having duplicateRows >1
