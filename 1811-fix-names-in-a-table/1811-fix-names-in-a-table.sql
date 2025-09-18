# Write your MySQL query statement below
select user_id, CONCAT(
         UPPER(LEFT(name, 1)),        -- first character in uppercase
         LOWER(SUBSTRING(name, 2))    -- rest in lowercase
       ) AS name
from Users
order by user_id asc