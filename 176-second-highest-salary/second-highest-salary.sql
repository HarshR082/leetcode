# Write your MySQL query statement below
SELECT max(salary) as SecondHighestSalary from Employee where salary<(Select salary from Employee order by salary DESC limit 1);