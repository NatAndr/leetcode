--Write a SQL query to rank scores. If there is a tie between two scores, both should have the same ranking.
--Note that after a tie, the next ranking number should be the next consecutive integer value.
--In other words, there should be no "holes" between ranks.


SELECT
    S1.Score,
    (SELECT COUNT(DISTINCT Score) FROM Scores AS S2 WHERE S2.Score >= S1.Score) AS Rank
FROM Scores AS S1
ORDER BY Score DESC