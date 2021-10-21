
--编写一个 SQL 查询，获取 Employee 表中第n高的薪水（Salary）。
--
--+----+--------+
--| Id | Salary |
--+----+--------+
--| 1  | 100    |
--| 2  | 200    |
--| 3  | 300    |
--+----+--------+
--例如上述 Employee表，n = 2时，应返回第二高的薪水200。如果不存在第n高的薪水，那么查询应返回null。
--
--+------------------------+
--| getNthHighestSalary(2) |
--+------------------------+
--| 200                    |
--+------------------------+


CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare m int;
    SET m = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select
    IFNULL(
        (
            select
                Distinct Salary
            from
                Employee
            order by
                Salary DESC
            limit
                m, 1
        ), null
    ) as SecondHighestSalary
  );
END