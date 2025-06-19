mysql> create table infor(sno int,stuname varchar(25),dept varchar(25),course varchar(30),sal int,product varchar(20),proprice int);
Query OK, 0 rows affected (0.08 sec)

mysql> insert into infor(sno,stuname,dept,course,sal,product,proprice)
    -> values (1,'abi','CT','WD',4000,'phone',2500),
    -> (2,'sowni','CT','WD',5000,'slipper',100),
    -> (3,'sri','IT','FSD',4500,'iphone',10000),
    -> (4,'hari','IT','FSD',3900,'smartwatch',1000),
    -> (5,'sudha','CS','SD',4100,'jimkas',1500);
Query OK, 5 rows affected (0.05 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from infor;
+------+-----------+------+--------+-------+------------+----------+
| sno  | stuname   | dept | course | sal   | product    | proprice |
+------+-----------+------+--------+-------+------------+----------+
|    1 | abi       | CT   | WD     | 4000 | phone      |    2500   |
|    2 | sowni     | CT   | WD     | 5000 | slipper    |     1000  |
|    3 | sri       | IT   | FSD    | 4500 | iphone     |    10000  |
|    4 | hari      | IT   | FSD    | 3900 | smartwatch |    1000   |
|    5 | sudha     | CS   | SD     | 4100 | jimkas     |     1500  |
+------+-----------+------+--------+-------+------------+----------+
5 rows in set (0.00 sec)

mysql> select count(stuname),course
    -> from infor
    -> group by course;
+----------------+--------+
| count(stuname) | course |
+----------------+--------+
|              2 | WD     |
|              2 | FSD    |
|              1 | SD     |
+----------------+--------+

mysql> select avg(sal),dept
    -> from infor
    -> group by dept;
+------------+------+
| avg(sal)   | dept |
+------------+------+
| 45000.0000 | CT   |
| 42000.0000 | IT   |
| 41000.0000 | CS   |
+------------+------+

mysql> select max(proprice)
    -> from infor;
+---------------+
| max(proprice) |
+---------------+
|        100000 |
+---------------+

mysql> select min(proprice)
    -> from infor;
+---------------+
| min(proprice) |
+---------------+
|          1000 |
+---------------+
