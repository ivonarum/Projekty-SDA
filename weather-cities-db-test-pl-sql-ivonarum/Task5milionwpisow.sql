create table test (
a int,
b text);

select * from test;

DELIMITER $$
CREATE PROCEDURE insert_data()
BEGIN   DECLARE i INT DEFAULT 1;
WHILE i <= 1000000 DO
INSERT INTO TEST(a, b) VALUES (i, LEFT(UUID(), 10));
SET i = i + 1;
END WHILE;
COMMIT;
END
$$
DELIMITER ;
CALL insert_data();

select count(*) from test;

# explain 
select * from test where a=91578;

create UNIQUE index test_pk on test(a);
drop index test_pk on test;


DELIMITER $$
CREATE PROCEDURE measure_time1()
BEGIN    
DECLARE l_start double;    
DECLARE l_end INT;    
DECLARE l_time INT;    
DECLARE l_result_a INT;    
DECLARE l_result_b VARCHAR(10);    
DECLARE i INT DEFAULT 1;    
SET l_start = UNIX_TIMESTAMP();    
WHILE i <= 1000 DO        
SELECT a, b INTO l_result_a, l_result_b FROM TEST WHERE a = i;        
SET i = i + 1;    
END WHILE;    
SET l_end = UNIX_TIMESTAMP();    
SET l_time = l_end - l_start;    
SELECT l_start, l_end, l_time;
END 
$$
DELIMITER ;
CALL measure_time1();