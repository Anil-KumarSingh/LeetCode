# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d
ON e.departmentid = d.id
WHERE e.salary = (
    SELECT MAX(salary)
    FROM Employee 
    WHERE departmentId = e.departmentId
);
