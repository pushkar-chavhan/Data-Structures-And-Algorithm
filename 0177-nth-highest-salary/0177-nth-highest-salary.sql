CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
DETERMINISTIC
BEGIN
  DECLARE result INT;
  DECLARE offsetVal INT;

  SET offsetVal = N - 1;

  SELECT DISTINCT Salary INTO result
  FROM Employee
  ORDER BY Salary DESC
  LIMIT 1 OFFSET offsetVal;

  RETURN result;
END;
