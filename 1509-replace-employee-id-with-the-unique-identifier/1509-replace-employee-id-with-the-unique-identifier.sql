# Write your MySQL query statement below
select e1.name , e2.unique_id
from Employees e1
LEFT join EmployeeUNI e2 on e1.id=e2.id


