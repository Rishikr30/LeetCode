# Write your MySQL query statement below
delete t1 from Person t1 inner join Person t2 where t1.id> t2.id and t1.email = t2.email;