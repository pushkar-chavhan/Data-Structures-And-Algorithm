# Write your MySQL query statement below
select p.product_id,
 COALESCE(
        ROUND(SUM(p.price * u.units) / NULLIF(SUM(u.units), 0), 2),
        0
    ) AS average_price
from Prices p
left join UnitsSold u on
p.product_id=u.product_id
and purchase_date  between start_date and end_date
group by product_id