# Write your MySQL query statement below
select max(salary) as secondHighestSalary from Employee where salary< (select max(salary) as secondHighestSalary from Employee );