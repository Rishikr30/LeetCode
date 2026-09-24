# Write your MySQL query statement below
select person_name from queue q1 where ( select sum(weight) from queue q2 where q2.turn <= q1.turn) <=1000 order by turn desc limit 1;